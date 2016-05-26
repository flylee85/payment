package com.ymatou.payment.domain.pay.model;

import java.math.BigDecimal;
import java.util.Date;

import com.ymatou.payment.facade.PrintFriendliness;
import com.ymatou.payment.facade.model.AcquireOrderReq;
import com.ymatou.payment.infrastructure.db.model.PaymentPo;

/**
 * 支付单
 * 
 * @author wangxudong
 *
 */
public class Payment extends PrintFriendliness {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 2524661669277166299L;

    /**
     * 商户订单
     */
    private BussinessOrder bussinessOrder;

    /**
     * 收单请求
     */
    private AcquireOrderReq acquireOrderReq;

    /**
     * VARCHAR(32) 必填<br>
     * 
     */
    private String paymentId;

    /**
     * CHAR(36) 必填<br>
     * 
     */
    private String bussinessOrderId;

    /**
     * VARCHAR(64)<br>
     * 
     */
    private String institutionPaymentId;

    /**
     * VARCHAR(16) 必填<br>
     * 
     */
    private String paytype;

    /**
     * DECIMAL(18,4) 必填<br>
     * 
     */
    private BigDecimal payprice;

    /**
     * DECIMAL(18,4)<br>
     * 
     */
    private BigDecimal actualpayprice;

    /**
     * VARCHAR(3) 必填<br>
     * 
     */
    private String paycurrencytype;

    /**
     * VARCHAR(3)<br>
     * 
     */
    private String actualpaycurrencytype;

    /**
     * DOUBLE(53)<br>
     * 
     */
    private Double exchangerate;

    /**
     * VARCHAR(32)<br>
     * 
     */
    private String bankid;

    /**
     * INTEGER(10)<br>
     * 
     */
    private Integer cardtype;

    /**
     * VARCHAR(64)<br>
     * 
     */
    private String payerid;

    /**
     * TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     * 
     */
    private Date createdtime;

    /**
     * INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Integer paystatus;

    /**
     * TIMESTAMP(23,3)<br>
     * 
     */
    private Date paytime;

    /**
     * TIMESTAMP(23,3)<br>
     * 
     */
    private Date lastupdatedtime;

    /**
     * INTEGER(10)<br>
     * 
     */
    private Integer checkstatus;

    /**
     * VARCHAR(32) 必填<br>
     */
    public String getPaymentid() {
        return paymentId;
    }

    /**
     * VARCHAR(32) 必填<br>
     */
    public void setPaymentid(String paymentid) {
        this.paymentId = paymentid == null ? null : paymentid.trim();
    }

    /**
     * CHAR(36) 必填<br>
     */
    public String getBussinessorderid() {
        return bussinessOrderId;
    }

    /**
     * CHAR(36) 必填<br>
     */
    public void setBussinessorderid(String bussinessorderid) {
        this.bussinessOrderId = bussinessorderid == null ? null : bussinessorderid.trim();
    }

    /**
     * VARCHAR(64)<br>
     */
    public String getInstitutionpaymentid() {
        return institutionPaymentId;
    }

    /**
     * VARCHAR(64)<br>
     */
    public void setInstitutionpaymentid(String institutionpaymentid) {
        this.institutionPaymentId = institutionpaymentid == null ? null : institutionpaymentid.trim();
    }

    /**
     * VARCHAR(16) 必填<br>
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * VARCHAR(16) 必填<br>
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    /**
     * DECIMAL(18,4) 必填<br>
     */
    public BigDecimal getPayprice() {
        return payprice;
    }

    /**
     * DECIMAL(18,4) 必填<br>
     */
    public void setPayprice(BigDecimal payprice) {
        this.payprice = payprice;
    }

    /**
     * DECIMAL(18,4)<br>
     */
    public BigDecimal getActualpayprice() {
        return actualpayprice;
    }

    /**
     * DECIMAL(18,4)<br>
     */
    public void setActualpayprice(BigDecimal actualpayprice) {
        this.actualpayprice = actualpayprice;
    }

    /**
     * VARCHAR(3) 必填<br>
     */
    public String getPaycurrencytype() {
        return paycurrencytype;
    }

    /**
     * VARCHAR(3) 必填<br>
     */
    public void setPaycurrencytype(String paycurrencytype) {
        this.paycurrencytype = paycurrencytype == null ? null : paycurrencytype.trim();
    }

    /**
     * VARCHAR(3)<br>
     */
    public String getActualpaycurrencytype() {
        return actualpaycurrencytype;
    }

    /**
     * VARCHAR(3)<br>
     */
    public void setActualpaycurrencytype(String actualpaycurrencytype) {
        this.actualpaycurrencytype = actualpaycurrencytype == null ? null : actualpaycurrencytype.trim();
    }

    /**
     * DOUBLE(53)<br>
     */
    public Double getExchangerate() {
        return exchangerate;
    }

    /**
     * DOUBLE(53)<br>
     */
    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
     * VARCHAR(32)<br>
     */
    public String getBankid() {
        return bankid;
    }

    /**
     * VARCHAR(32)<br>
     */
    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    /**
     * INTEGER(10)<br>
     */
    public Integer getCardtype() {
        return cardtype;
    }

    /**
     * INTEGER(10)<br>
     */
    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * VARCHAR(64)<br>
     */
    public String getPayerid() {
        return payerid;
    }

    /**
     * VARCHAR(64)<br>
     */
    public void setPayerid(String payerid) {
        this.payerid = payerid == null ? null : payerid.trim();
    }

    /**
     * TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Integer getPaystatus() {
        return paystatus;
    }

    /**
     * INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    /**
     * TIMESTAMP(23,3)<br>
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * TIMESTAMP(23,3)<br>
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    /**
     * TIMESTAMP(23,3)<br>
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * TIMESTAMP(23,3)<br>
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * INTEGER(10)<br>
     */
    public Integer getCheckstatus() {
        return checkstatus;
    }

    /**
     * INTEGER(10)<br>
     */
    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * PP_Payment
     *
     * @mbggenerated Wed May 04 11:33:50 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymentid=").append(paymentId);
        sb.append(", bussinessorderid=").append(bussinessOrderId);
        sb.append(", institutionpaymentid=").append(institutionPaymentId);
        sb.append(", paytype=").append(paytype);
        sb.append(", payprice=").append(payprice);
        sb.append(", actualpayprice=").append(actualpayprice);
        sb.append(", paycurrencytype=").append(paycurrencytype);
        sb.append(", actualpaycurrencytype=").append(actualpaycurrencytype);
        sb.append(", exchangerate=").append(exchangerate);
        sb.append(", bankid=").append(bankid);
        sb.append(", cardtype=").append(cardtype);
        sb.append(", payerid=").append(payerid);
        sb.append(", createdtime=").append(createdtime);
        sb.append(", paystatus=").append(paystatus);
        sb.append(", paytime=").append(paytime);
        sb.append(", lastupdatedtime=").append(lastupdatedtime);
        sb.append(", checkstatus=").append(checkstatus);
        sb.append("]");
        return sb.toString();
    }

    /**
     * 从PO转换成model
     * 
     * @param po
     * @return
     */
    public static Payment convertFromPo(PaymentPo po) {
        if (po == null) {
            return null;
        }
        Payment model = new Payment();
        model.setPaymentid(po.getPaymentId());
        model.setBussinessorderid(po.getBussinessOrderId());
        model.setInstitutionpaymentid(po.getInstitutionPaymentId());
        model.setPaytype(po.getPayType());
        model.setPayprice(po.getPayPrice());
        model.setPaycurrencytype(po.getPayCurrencyType());
        model.setActualpayprice(po.getActualPayPrice());
        model.setActualpaycurrencytype(po.getActualPayCurrencyType());
        model.setExchangerate(po.getExchangeRate());
        model.setBankid(po.getBankId());
        model.setCardtype(po.getCardType());
        model.setPayerid(po.getPayerId());
        model.setCreatedtime(po.getCreatedTime());
        model.setPaystatus(po.getPayStatus());
        model.setPaytime(po.getPayTime());
        model.setLastupdatedtime(po.getLastUpdatedTime());
        model.setCheckstatus(po.getCheckStatus());

        return model;
    }

    /**
     * @return the bussinessOrder
     */
    public BussinessOrder getBussinessOrder() {
        return bussinessOrder;
    }

    /**
     * @param bussinessOrder the bussinessOrder to set
     */
    public void setBussinessOrder(BussinessOrder bussinessOrder) {
        this.bussinessOrder = bussinessOrder;
    }

    /**
     * @return the acquireOrderReq
     */
    public AcquireOrderReq getAcquireOrderReq() {
        return acquireOrderReq;
    }

    /**
     * @param acquireOrderReq the acquireOrderReq to set
     */
    public void setAcquireOrderReq(AcquireOrderReq acquireOrderReq) {
        this.acquireOrderReq = acquireOrderReq;
    }

}
