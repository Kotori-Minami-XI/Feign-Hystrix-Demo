package com.Kotori.fallback;

import com.Kotori.SDK.OrderApi;
import com.Kotori.service.EurekaFeignClient;
import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements EurekaFeignClient{

    public String getOrder(String orderId) {
        return "降级方法";
    }
}
