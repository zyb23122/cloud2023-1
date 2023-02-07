package com.hzyh.springcloud.controller;

import com.hzyh.springcloud.entity.CommonResult;
import com.hzyh.springcloud.entity.Payment;
import com.hzyh.springcloud.service.PaymentSerivce;
import com.netflix.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentSerivce paymentSerivce;
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentSerivce.create(payment);
        if (i>0){
            return new CommonResult(200,"插入数据库成功",i);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

/*    @GetMapping("/payment/discovery")
    public Object discovery(){
        System.out.println("=====================");
        System.out.println(discoveryClient.getAllKnownRegions());
        discoveryClient.get();
        discoveryClient.getInstancesById()
    }*/
}
