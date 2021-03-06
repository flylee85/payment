/**
 * (C) Copyright 2017 Ymatou (http://www.ymatou.com/).
 *
 * All rights reserved.
 */
package com.ymatou.payment.integration.model;

import com.ymatou.payment.facade.PrintFriendliness;

/**
 * 招行结算支付单信息
 * 
 * @see
 * @author Administrator 2017年1月14日 上午11:39:58
 *
 */
public class CmbSettledOrderInfo extends PrintFriendliness {

    /**
     * http://58.61.30.110/OpenAPI2/API/IntDeclareAPI8.aspx
     */
    private static final long serialVersionUID = -2929378106891930568L;

    /**
     * 商户的订单日期，格式：yyyyMMdd
     */
    private String date;

    /**
     * 商户的订单号
     */
    private String orderNo;

    /**
     * 银行的订单流水号
     */
    private String bankSerialNo;

    /**
     * 订单参考号
     */
    private String orderRefNo;

    /**
     * 交易币种,固定为：“10”
     */
    private String currency;

    /**
     * 订单金额格式：xxxx.xx
     */
    private String orderAmount;

    /**
     * 费用金额,格式：xxxx.xx
     */
    private String fee;

    /**
     * 银行受理日期,格式：yyyyMMdd
     */
    private String acceptDate;

    /**
     * 银行受理时间,格式：HHmmss
     */
    private String acceptTime;

    /**
     * 结算金额,格式：xxxx.xx
     */
    private String settleAmount;

    /**
     * 优惠金额,单位为元，精确到小数点后两位； 格式为：xxxx.xx元；无优惠则返回0.00
     */
    private String discountAmount;

    /**
     * 订单状态,0：已结账 1：已撤销 2：部分结账 4：未结账 5：无效状态 6：未知状态
     */
    private String orderStatus;

    /**
     * 银行处理日期,格式：yyyyMMdd
     */
    private String settleDate;

    /**
     * 银行处理时间,格式：HHmmss
     */
    private String settleTime;

    /**
     * 卡类型,02：一卡通 03：信用卡 07：他行卡
     */
    private String cardType;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBankSerialNo() {
        return bankSerialNo;
    }

    public void setBankSerialNo(String bankSerialNo) {
        this.bankSerialNo = bankSerialNo;
    }

    public String getOrderRefNo() {
        return orderRefNo;
    }

    public void setOrderRefNo(String orderRefNo) {
        this.orderRefNo = orderRefNo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(String acceptDate) {
        this.acceptDate = acceptDate;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(String settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }



}
