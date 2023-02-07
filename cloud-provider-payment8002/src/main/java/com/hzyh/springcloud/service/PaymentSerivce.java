package com.hzyh.springcloud.service;

import com.hzyh.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentSerivce {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
