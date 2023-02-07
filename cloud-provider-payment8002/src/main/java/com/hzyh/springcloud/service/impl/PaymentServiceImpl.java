package com.hzyh.springcloud.service.impl;

import com.hzyh.springcloud.dao.PaymentDao;
import com.hzyh.springcloud.entity.Payment;
import com.hzyh.springcloud.service.PaymentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentSerivce {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
