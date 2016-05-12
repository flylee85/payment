/*
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 */
package com.ymatou.payment.facade;

import com.ymatou.payment.facade.model.FastRefundRequest;
import com.ymatou.payment.facade.model.FastRefundResponse;

/**
 * 退款接口
 * 
 * @author qianmin 2016年5月11日 上午10:51:16
 * 
 */
public interface RefundFacade {

    /**
     * 快速退款
     * 
     * @param req
     * @return
     */
    FastRefundResponse fastRefund(FastRefundRequest req);
}
