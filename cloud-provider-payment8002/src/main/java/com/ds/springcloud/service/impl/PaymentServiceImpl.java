package com.ds.springcloud.service.impl;

import com.ds.springcloud.dao.PaymentDao;
import com.ds.springcloud.entities.Payment;
import com.ds.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther ds
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    //java 自带的注解，也可以实现自动注入
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
