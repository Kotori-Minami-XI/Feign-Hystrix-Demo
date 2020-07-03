package com.Kotori.service;

import com.Kotori.SDK.OrderApi;
import com.Kotori.fallback.FeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "feign-provider-group", fallback = FeignFallback.class)
public interface EurekaFeignClient extends OrderApi{
    @RequestMapping("/getOrder")
    public String getOrder(@RequestBody String orderId);
}
