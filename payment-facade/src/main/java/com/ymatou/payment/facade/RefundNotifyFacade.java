/*
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 */
package com.ymatou.payment.facade;

import com.ymatou.payment.facade.model.RefundNotifyRequest;

/**
 * 接收回调
 *
 * @author qianmin 2016年5月23日 下午5:18:39
 */
public interface RefundNotifyFacade {

    /**
     * 处理支付宝退款回调
     *
     * @param req
     * @return
     */
    //public BaseResponse refundNotify(AliPayRefundNotifyRequest req);

    /**
     * 抽象的退款回调处理入口
     *
     * @param request
     * @return
     */
    BaseResponse refundNotify(RefundNotifyRequest request);
}
