/**
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *
 * All rights reserved.
 */
package com.ymatou.payment.domain.pay.model;

import java.math.BigDecimal;
import java.util.Date;

import com.ymatou.payment.facade.PrintFriendliness;
import com.ymatou.payment.facade.constants.BizCodeEnum;
import com.ymatou.payment.infrastructure.db.model.BussinessOrderPo;

/**
 * 商户订单模型
 * 
 * @author wangxudong 2016年5月11日 下午4:19:36
 *
 */
public class BussinessOrder extends PrintFriendliness {

    private static final long serialVersionUID = 5438330052260748278L;

    /**
     * 商户订单Id
     */
    private String bussinessOrderId;
    /**
     * 应用编号
     */
    private String appId;
    /**
     * 原始AppId
     */
    private String originAppId;
    /**
     * 商户订单Id
     */
    private String orderId;
    /**
     * 支付类型
     */
    private String payType;
    /**
     * 订单金额
     */
    private BigDecimal orderPrice;
    /**
     * 货币类型
     */
    private String currencyType;
    /**
     * 码头用户Id
     */
    private Integer userId;
    /**
     * 版本
     */
    private Integer version;
    /**
     * 跟踪Id
     */
    private String traceId;
    /**
     * 收单时间
     */
    private String orderTime;
    /**
     * 第三方用户Id
     */
    private String thirdPartyUserId;
    /**
     * 第三方用户类型
     */
    private Integer thirdPartyUserType;
    /**
     * 客户端Ip
     */
    private String clientIp;
    /**
     * 客户端回调URL
     */
    private String callbackUrl;
    /**
     * 服务端回调URL
     */
    private String notifyUrl;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品描述
     */
    private String productDesc;
    /**
     * 商品链接
     */
    private String productUrl;
    /**
     * 代码页
     */
    private Integer codePage;
    /**
     * 扩展信息
     */
    private String ext;
    /**
     * 备注
     */
    private String memo;
    /**
     * 签名方式
     */
    private String signMethod;
    /**
     * 支付类型
     */
    private BizCodeEnum bizCode;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 最后更新时间
     */
    private Date lastUpdatedTime;
    /**
     * 订单状态
     */
    private Integer orderStatus;
    /**
     * 通知状态
     */
    private Integer notifyStatus;
    /**
     * 通知时间
     */
    private Date notifyTime;


    public String getBussinessOrderId() {
        return bussinessOrderId;
    }

    public void setBussinessOrderId(String bussinessOrderId) {
        this.bussinessOrderId = bussinessOrderId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOriginAppId() {
        return originAppId;
    }

    public void setOriginAppId(String originAppId) {
        this.originAppId = originAppId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getThirdPartyUserId() {
        return thirdPartyUserId;
    }

    public void setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
    }

    public Integer getThirdPartyUserType() {
        return thirdPartyUserType;
    }

    public void setThirdPartyUserType(Integer thirdPartyUserType) {
        this.thirdPartyUserType = thirdPartyUserType;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public Integer getCodePage() {
        return codePage;
    }

    public void setCodePage(Integer codePage) {
        this.codePage = codePage;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getSignMethod() {
        return signMethod;
    }

    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    public BizCodeEnum getBizCode() {
        return bizCode;
    }

    public void setBizCode(BizCodeEnum bizCode) {
        this.bizCode = bizCode;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(Integer notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bussinessOrderId=").append(bussinessOrderId);
        sb.append(", appId=").append(appId);
        sb.append(", originAppId=").append(originAppId);
        sb.append(", orderId=").append(orderId);
        sb.append(", payType=").append(payType);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", currencyType=").append(currencyType);
        sb.append(", userId=").append(userId);
        sb.append(", version=").append(version);
        sb.append(", traceId=").append(traceId);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", thirdPartyUserId=").append(thirdPartyUserId);
        sb.append(", thirdpartyUserType=").append(thirdPartyUserType);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", callbackUrl=").append(callbackUrl);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", productName=").append(productName);
        sb.append(", productDesc=").append(productDesc);
        sb.append(", productUrl=").append(productUrl);
        sb.append(", codePage=").append(codePage);
        sb.append(", ext=").append(ext);
        sb.append(", memo=").append(memo);
        sb.append(", signMethod=").append(signMethod);
        sb.append(", bizCode=").append(bizCode);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", lastUpdatedTime=").append(lastUpdatedTime);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", notifyStatus=").append(notifyStatus);
        sb.append(", notifyTime=").append(notifyTime);
        sb.append("]");
        return sb.toString();
    }

    public static BussinessOrder convertFromPo(BussinessOrderPo po) {
        BussinessOrder model = new BussinessOrder();
        model.setBussinessOrderId(po.getBussinessOrderId());
        model.setAppId(po.getAppId());
        model.setOriginAppId(po.getOriginAppId());
        model.setOrderId(po.getOrderId());
        model.setPayType(po.getPayType());
        model.setOrderPrice(po.getOrderPrice());
        model.setCurrencyType(po.getCurrencyType());
        model.setUserId(po.getUserId());
        model.setVersion(po.getVersion());
        model.setTraceId(po.getTraceId());
        model.setOrderTime(po.getOrderTime());
        model.setThirdPartyUserId(po.getThirdPartyUserId());
        model.setThirdPartyUserType(po.getThirdPartyUserType());
        model.setClientIp(po.getClientIp());
        model.setCallbackUrl(po.getCallbackUrl());
        model.setNotifyUrl(po.getNotifyUrl());
        model.setProductName(po.getProductName());
        model.setProductDesc(po.getProductDesc());
        model.setProductUrl(po.getProductUrl());
        model.setCodePage(po.getCodePage());
        model.setExt(po.getExt());
        model.setMemo(po.getMemo());
        model.setSignMethod(po.getSignMethod());
        model.setBizCode(BizCodeEnum.parse(po.getBizCode()));
        model.setCreatedTime(po.getCreatedTime());
        model.setLastUpdatedTime(po.getLastUpdatedTime());
        model.setOrderStatus(po.getOrderStatus());
        model.setNotifyStatus(po.getNotifyStatus());
        model.setNotifyTime(po.getNotifyTime());

        return model;
    }

    /**
     * 返回商品主题
     * 
     * @return
     */
    public String getSubject() {
        if (productName != null && !productName.isEmpty())
            return productName;

        if (productDesc != null && !productDesc.isEmpty())
            return productDesc;

        return null;
    }

    /**
     * 返回商品描述
     * 
     * @return
     */
    public String getBody() {
        if (productDesc != null && !productDesc.isEmpty())
            return productDesc;

        if (productName != null && !productName.isEmpty())
            return productName;

        return null;
    }
}
