package com.Kotori.controller;

import com.Kotori.service.EurekaFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private EurekaFeignClient feignClient;

    /***
     * 正常orderId的调用，服务方不会抛异常
     * http://127.0.0.1:8001/payNormal?orderId=1
     */
    @RequestMapping("/payNormal")
    public String payNormal(String orderId) {
        return feignClient.getOrder(orderId);
    }

    /***
     * 不正常orderId的调用，服务方会抛异常
     * http://127.0.0.1:8001/payAbnormal?orderId=0
     */
    @RequestMapping("/payAbnormal")
    public String payAbnormal(String orderId) {
        return feignClient.getOrder(orderId);
    }
}
