/**
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *
 * All rights reserved.
 */
package com.ymatou.payment.test.facade.impl.rest;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.ws.rs.core.Response;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import com.ymatou.payment.domain.channel.InstitutionConfig;
import com.ymatou.payment.domain.channel.InstitutionConfigManager;
import com.ymatou.payment.domain.channel.service.SignatureService;
import com.ymatou.payment.facade.constants.PayTypeEnum;
import com.ymatou.payment.facade.rest.PaymentNotifyResource;
import com.ymatou.payment.infrastructure.db.mapper.AlipayNotifyLogMapper;
import com.ymatou.payment.infrastructure.db.model.AlipayNotifyLogExample;
import com.ymatou.payment.infrastructure.db.model.AlipayNotifyLogPo;
import com.ymatou.payment.infrastructure.util.HttpUtil;
import com.ymatou.payment.test.RestBaseTest;

/**
 * 支付回调测试
 * 
 * @author wangxudong 2016年5月19日 上午11:54:27
 *
 */
public class PaymentNotifyResourceTest extends RestBaseTest {

    @Resource
    private PaymentNotifyResource paymentNotifyResource;

    @Resource
    private SignatureService signatureService;

    @Resource
    private InstitutionConfigManager institutionConfigManager;

    @Resource
    private AlipayNotifyLogMapper alipaynotifylogMapper;

    @Test
    public void testAliPayPCNotify() throws UnsupportedEncodingException {
        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/notify/10");

        // 产线的数据，由于没有支付单号，验签通过报文记录，但是支付单号找不到
        String paymentId = "21916168000593994";
        String payType = "10";
        String reqBody =
                "discount=0.00&payment_type=1&subject=yeyingcao%E7%9A%84%E8%AE%A2%E5%8D%95&trade_no=2016051921001004250269230618&buyer_email=yeyingcao88%40163.com&buyer_id=test&gmt_create=2016-05-19+12%3A56%3A41&notify_type=trade_status_sync&quantity=1&out_trade_no=21916168000593994&seller_id=2088701734809577&notify_time=2016-05-19+12%3A56%3A47&trade_status=TRADE_SUCCESS&is_total_fee_adjust=N&total_fee=387.00&gmt_payment=2016-05-19+12%3A56%3A47&seller_email=ap.ymt%40ymatou.com&price=387.00&buyer_id=2088002495313254&notify_id=39a92c986d7097b332939697525f793hxi&use_coupon=N&sign_type=MD5&sign=c40ed3acbe82c45cfabf70b0157e6ccf";

        // 删除旧数据
        AlipayNotifyLogExample example = new AlipayNotifyLogExample();
        example.createCriteria().andBizNoEqualTo(paymentId);
        alipaynotifylogMapper.deleteByExample(example);

        servletRequest.setContent(reqBody.getBytes("utf-8"));
        String response = paymentNotifyResource.notify(payType, servletRequest);

        assertEquals("验证返回值", "failed", response);

        List<AlipayNotifyLogPo> poList = alipaynotifylogMapper.selectByExample(example);

        assertEquals("验证报文插入表中", 1, poList.size());
    }

    @Test
    public void testNotifySuccess() throws UnsupportedEncodingException {

        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/notify/13");

        // 产线的数据，由于没有支付单号，验签通过报文记录，但是支付单号找不到
        String paymentId = "16070714424896160";
        String payType = "13";
        String requestBody =
                "discount=0.00&payment_type=1&subject=zhangyingnan%E7%9A%84%E8%AE%A2%E5%8D%95&trade_no=2016070721001004850256239538&buyer_email=324708852%40qq.com&gmt_create=2016-07-07+14%3A43%3A00&notify_type=trade_status_sync&quantity=1&out_trade_no=16070714424896160&seller_id=2088701734809577&notify_time=2016-07-07+14%3A43%3A01&body=zhangyingnan%E7%9A%84%E8%AE%A2%E5%8D%95&trade_status=TRADE_SUCCESS&is_total_fee_adjust=N&total_fee=288.00&gmt_payment=2016-07-07+14%3A43%3A01&seller_email=ap.ymt%40ymatou.com&price=288.00&buyer_id=2088402149701853&notify_id=5656ed605b03486d8ad4c269d93dc51mk6&use_coupon=N&sign_type=RSA&sign=EK2fWwFvK28oQnyVtCPUOsigaRcTpRiWI%2BCVZYfnUCrIQgLG3WPh%2BEcpVm6YpCwXwo%2FLUnA22qh470hN%2F9rA2lwPoGUGvTT2uXPpedp0DFpG0HOgl31cSD%2F5a07afPHx%2FmHi5KhxB%2B5L4PBPZV8VSPQ%2BkQNBnjiimiLfstTmzbg%3D";

        // 删除旧数据
        AlipayNotifyLogExample example = new AlipayNotifyLogExample();
        example.createCriteria().andBizNoEqualTo(paymentId);
        alipaynotifylogMapper.deleteByExample(example);

        servletRequest.setContent(requestBody.getBytes("utf-8"));
        String response = paymentNotifyResource.notify(payType, servletRequest);

        assertEquals("验证返回值", "success", response);

    }

    @Test
    public void testAliPayPCCallback() {
        String payType = "10";
        String paymentId = "21923050800942763";

        // 删除旧数据
        AlipayNotifyLogExample example = new AlipayNotifyLogExample();
        example.createCriteria().andBizNoEqualTo(paymentId);
        alipaynotifylogMapper.deleteByExample(example);

        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/callback/" + payType);
        servletRequest.setQueryString(
                "buyer_email=13918705020&buyer_id=2088502927970351&exterface=alipay.acquire.page.createandpay&gmt_payment=2016-05-20+17:45:17&is_success=T&notify_id=RqPnCoPT3K9%252Fvwbh3InXShl%252BTeGJOqEWsGgi2TxT9ZO8KnQY82evrWMvJPeE2R8DqU%252FJ&notify_time=2016-05-20+17:45:24&notify_type=trade_status_sync&out_trade_no=21923050800942763&seller_email=ap.ymt%40ymatou.com&seller_id=2088701734809577&subject=piaixiao%E7%9A%84%E8%AE%A2%E5%8D%95&total_fee=108.00&trade_no=2016052021001004350265453604&trade_status=TRADE_SUCCESS&sign=3dccc77d8b241736bc4abed0d7e77f02&sign_type=MD5");


        Response response = paymentNotifyResource.callback(payType, servletRequest);


        assertEquals("验证返回值", 500, response.getStatus());

        List<AlipayNotifyLogPo> poList = alipaynotifylogMapper.selectByExample(example);

        assertEquals("验证报文插入表中", 1, poList.size());
    }

    @Test
    public void testAliPayPCCallbackWrongSign() {
        String payType = "10";
        String paymentId = "21923050800942763";

        // 删除旧数据
        AlipayNotifyLogExample example = new AlipayNotifyLogExample();
        example.createCriteria().andBizNoEqualTo(paymentId);
        alipaynotifylogMapper.deleteByExample(example);

        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/callback/" + payType);
        servletRequest.setQueryString(
                "buyer_email=13918705020&buyer_id=2088502927970351&exterface=alipay.acquire.page.createandpay&gmt_payment=2016-05-20+17:45:17&is_success=T&notify_id=RqPnCoPT3K9%252Fvwbh3InXShl%252BTeGJOqEWsGgi2TxT9ZO8KnQY82evrWMvJPeE2R8DqU%252FJ&notify_time=2016-05-20+17:45:24&notify_type=trade_status_sync&out_trade_no=21923050800942763&seller_email=ap.ymt%40ymatou.com&seller_id=2088701734809577&subject=piaixiao%E7%9A%84%E8%AE%A2%E5%8D%95&total_fee=108.00&trade_no=2016052021001004350265453604&trade_status=TRADE_SUCCESS&sign=error-sign&sign_type=MD5");


        Response response = paymentNotifyResource.callback(payType, servletRequest);


        assertEquals("验证返回值", 500, response.getStatus());
    }

    @Test
    public void testAliPayPCNotifyMock() throws UnsupportedEncodingException {
        String payType = "10";
        String reqRawBody =
                "discount=0.00&payment_type=1&subject=yeyingcao%E7%9A%84%E8%AE%A2%E5%8D%95&trade_no=2016051921001004250269230618&buyer_email=yeyingcao88%40163.com&gmt_create=2016-05-19+12%3A56%3A41&notify_type=trade_status_sync&quantity=1&out_trade_no=10106408357807500869446&seller_id=2088701734809577&notify_time=2016-05-19+12%3A56%3A47&trade_status=TRADE_SUCCESS&is_total_fee_adjust=N&total_fee=387.00&gmt_payment=2016-05-19+12%3A56%3A47&seller_email=ap.ymt%40ymatou.com&price=387.00&buyer_id=2088002495313254&notify_id=39a92c986d7097b332939697525f793hxi&use_coupon=N&sign_type=MD5&sign=c40ed3acbe82c45cfabf70b0157e6ccf";
        String reqBody = buildMockQueryString(reqRawBody, payType);

        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/notify/" + payType);
        servletRequest.addHeader("mock", "1");
        servletRequest.setContent(reqBody.getBytes("utf-8"));

        String response = paymentNotifyResource.notify(payType, servletRequest);

        assertEquals("验证返回值", "success", response);
    }

    @Test
    public void testAliPayWAPNotifyMock() throws UnsupportedEncodingException {
        String payType = "11";
        String reqRawBody =
                "service=alipay.wap.trade.create.direct&sign=88bce74fba687b7aa93362755716dd00&v=1.0&sec_id=MD5&notify_data=%3Cnotify%3E%3Cbuyer_email%3EBrReOe3xtnqs%40foxmail.com%3C%2Fbuyer_email%3E%3Cbuyer_id%3E20880625760664%3C%2Fbuyer_id%3E%3Cgmt_create%3E2016-11-14+14%3A13%3A45%3C%2Fgmt_create%3E%3Cgmt_payment%3E2016-11-14+14%3A13%3A46%3C%2Fgmt_payment%3E%3Cis_total_fee_adjust%3EN%3C%2Fis_total_fee_adjust%3E%3Cnotify_id%3E1454764198882179%3C%2Fnotify_id%3E%3Cnotify_time%3E2016-11-14+14%3A13%3A47%3C%2Fnotify_time%3E%3Cnotify_type%3Etrade_status_sync%3C%2Fnotify_type%3E%3Cout_trade_no%3E16111414141511934%3C%2Fout_trade_no%3E%3Cpayment_type%3E1%3C%2Fpayment_type%3E%3Cprice%3E2%3C%2Fprice%3E%3Cquantity%3E1%3C%2Fquantity%3E%3Cseller_email%3Eap.ymt%40ymatou.com%3C%2Fseller_email%3E%3Cseller_id%3E2088701734809577%3C%2Fseller_id%3E%3Csubject%3E%E8%87%AA%E5%8A%A8%E5%8C%96%E6%B5%8B%E8%AF%95%E5%95%86%E5%93%81TBa7uzCeZV%3C%2Fsubject%3E%3Ctotal_fee%3E2%3C%2Ftotal_fee%3E%3Ctrade_no%3Ed7eee7f5-2235-4b56-9033-9bc2e31d5383%3C%2Ftrade_no%3E%3Ctrade_status%3ETRADE_SUCCESS%3C%2Ftrade_status%3E%3Cuse_coupon%3EN%3C%2Fuse_coupon%3E%3C%2Fnotify%3E";
        String paymentId = "16111414141511934";

        // 删除旧数据
        AlipayNotifyLogExample example = new AlipayNotifyLogExample();
        example.createCriteria().andBizNoEqualTo(paymentId);
        alipaynotifylogMapper.deleteByExample(example);

        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/notify/" + payType);
        servletRequest.addHeader("mock", "1");
        servletRequest.setContent(reqRawBody.getBytes("utf-8"));

        String response = paymentNotifyResource.notify(payType, servletRequest);

        assertEquals("验证返回值", "success", response);

        List<AlipayNotifyLogPo> poList = alipaynotifylogMapper.selectByExample(example);

        assertEquals("验证报文插入表中", 1, poList.size());
    }

    @Test
    public void testAliPayAppNotify() throws UnsupportedEncodingException {
        String payType = "13";
        String paymentId = "20160522162738564000000000075707";
        String reqBody =
                "discount=0.00&payment_type=1&subject=dayday_jie%E7%9A%84%E8%AE%A2%E5%8D%95&trade_no=2016052221001004600254283947&buyer_email=429023038%40qq.com&gmt_create=2016-05-22+16%3A27%3A55&notify_type=trade_status_sync&quantity=1&out_trade_no=20160522162738564000000000075707&seller_id=2088701734809577&notify_time=2016-05-22+16%3A27%3A57&body=dayday_jie%E7%9A%84%E8%AE%A2%E5%8D%95&trade_status=TRADE_SUCCESS&is_total_fee_adjust=N&total_fee=17.00&gmt_payment=2016-05-22+16%3A27%3A57&seller_email=ap.ymt%40ymatou.com&price=17.00&buyer_id=2088202423378603&notify_id=c081bd3a5cf90802e50faef0bfb6d97kmq&use_coupon=N&sign_type=RSA&sign=fw2VqtCqKXytIIZHz69xviiL3%2FT1sMLaf5o6eu1HZzu3KFLCi2FZ86%2FSiaTXd%2BqNN%2BMDgJ6cqzTzsOek%2FIBdSqcFcVU4A13XqVpZVHq4v6LE04auxeWcEBUDuh1QQoA1tOzThyWa6zxp1NBEX78yn1k4378JtGx1F%2BVUsbLp2aY%3D";

        // 删除旧数据
        AlipayNotifyLogExample example = new AlipayNotifyLogExample();
        example.createCriteria().andBizNoEqualTo(paymentId);
        alipaynotifylogMapper.deleteByExample(example);

        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/notify/" + payType);

        servletRequest.setContent(reqBody.getBytes("utf-8"));
        String response = paymentNotifyResource.notify(payType, servletRequest);

        assertEquals("验证返回值", "failed", response);

        List<AlipayNotifyLogPo> poList = alipaynotifylogMapper.selectByExample(example);

        assertEquals("验证报文插入表中", 1, poList.size());
    }

    @Test
    public void testWeiXinJSAPINotify() throws UnsupportedEncodingException {
        String payType = "14";
        String paymentId = "21913767900550876";
        String reqBody =
                "<xml><appid><![CDATA[wxa06ebe9f39751792]]></appid><bank_type><![CDATA[CFT]]></bank_type><cash_fee><![CDATA[6900]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[N]]></is_subscribe><mch_id><![CDATA[1278350701]]></mch_id><nonce_str><![CDATA[be7a9693aa7b41e28ad7b570dbd594c3]]></nonce_str><openid><![CDATA[oR5W7jgOj4XWY2B7rkmJ9hr1VPGQ]]></openid><out_trade_no><![CDATA[21913767900550876]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[C99435843DA91205171B2AA6DAC203E0]]></sign><time_end><![CDATA[20160518195545]]></time_end><total_fee>6900</total_fee><trade_type><![CDATA[JSAPI]]></trade_type><transaction_id><![CDATA[4009052001201605186002211905]]></transaction_id></xml>";

        // 删除旧数据
        AlipayNotifyLogExample example = new AlipayNotifyLogExample();
        example.createCriteria().andBizNoEqualTo(paymentId);
        alipaynotifylogMapper.deleteByExample(example);


        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/notify/" + payType);
        servletRequest.setContent(reqBody.getBytes("utf-8"));
        String response = paymentNotifyResource.notify(payType, servletRequest);

        assertEquals("验证返回值", "failed", response);

        List<AlipayNotifyLogPo> poList = alipaynotifylogMapper.selectByExample(example);

        assertEquals("验证报文插入表中", 1, poList.size());
    }

    @Test
    public void testWeiXinAppNotify() throws UnsupportedEncodingException {
        String payType = "15";
        String paymentId = "20160522151452525000000000077470";
        String reqBody =
                "<xml><appid><![CDATA[wxf51a439c0416f182]]></appid><bank_type><![CDATA[CFT]]></bank_type><cash_fee><![CDATA[6900]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[N]]></is_subscribe><mch_id><![CDATA[1234079001]]></mch_id><nonce_str><![CDATA[c798daa9864046d7a109a2fba0a2b668]]></nonce_str><openid><![CDATA[oASzYjl-imWblI9UAcnNn3f6Yp_8]]></openid><out_trade_no><![CDATA[20160522151452525000000000077470]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[239E3C920714FBAE9B353E56CDC180BA]]></sign><time_end><![CDATA[20160522151457]]></time_end><total_fee>6900</total_fee><trade_type><![CDATA[APP]]></trade_type><transaction_id><![CDATA[4010052001201605226158055804]]></transaction_id></xml>";

        // 删除旧数据
        AlipayNotifyLogExample example = new AlipayNotifyLogExample();
        example.createCriteria().andBizNoEqualTo(paymentId);
        alipaynotifylogMapper.deleteByExample(example);

        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/notify/" + payType);

        servletRequest.setContent(reqBody.getBytes("utf-8"));
        String response = paymentNotifyResource.notify(payType, servletRequest);

        assertEquals("验证返回值", "failed", response);

        List<AlipayNotifyLogPo> poList = alipaynotifylogMapper.selectByExample(example);

        assertEquals("验证报文插入表中", 1, poList.size());
    }

    @Test
    public void testWeiXinAppNotifyWithWrongMerchantId() throws UnsupportedEncodingException {
        String payType = "14"; // should be 15, 14 and 15 has different merchantid
        String paymentId = "20160522151452525000000000077470";
        String reqBody =
                "<xml><appid><![CDATA[wxf51a439c0416f182]]></appid><bank_type><![CDATA[CFT]]></bank_type><cash_fee><![CDATA[6900]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[N]]></is_subscribe><mch_id><![CDATA[1234079001]]></mch_id><nonce_str><![CDATA[c798daa9864046d7a109a2fba0a2b668]]></nonce_str><openid><![CDATA[oASzYjl-imWblI9UAcnNn3f6Yp_8]]></openid><out_trade_no><![CDATA[20160522151452525000000000077470]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[96D6CF7EA4C25ACC6F751E50682E33A1]]></sign><time_end><![CDATA[20160522151457]]></time_end><total_fee>6900</total_fee><trade_type><![CDATA[APP]]></trade_type><transaction_id><![CDATA[4010052001201605226158055804]]></transaction_id></xml>";

        // 删除旧数据
        AlipayNotifyLogExample example = new AlipayNotifyLogExample();
        example.createCriteria().andBizNoEqualTo(paymentId);
        alipaynotifylogMapper.deleteByExample(example);

        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setRequestURI("/notify/" + payType);

        servletRequest.setContent(reqBody.getBytes("utf-8"));
        String response = paymentNotifyResource.notify(payType, servletRequest);

        assertEquals("验证返回值", "failed", response);

        List<AlipayNotifyLogPo> poList = alipaynotifylogMapper.selectByExample(example);

        assertEquals("验证报文插入表中", 0, poList.size());
    }

    private String buildMockQueryString(String originString, String payType) throws UnsupportedEncodingException {
        InstitutionConfig instConfig = institutionConfigManager.getConfig(PayTypeEnum.parse(payType));
        Map<String, String> map = HttpUtil.parseQueryStringToMap(originString);
        HashMap<String, String> mockHeader = new HashMap<String, String>();
        mockHeader.put("mock", "1");
        String sign = signatureService.signMessage(map, instConfig, mockHeader);
        map.put("sign", sign);

        return HttpUtil.parseMapToQueryString(map);
    }
}
