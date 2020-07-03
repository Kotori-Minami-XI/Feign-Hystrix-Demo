package com.Kotori.controller;

import com.Kotori.SDK.OrderApi;
import com.Kotori.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProviderController implements OrderApi {
    @Autowired
    private OrderServiceImpl orderService;

    @RequestMapping("/getOrder")
    public String getOrder(@RequestBody String orderId) {
        if ("1".equals(orderId)) {

        } else {
            int i = 1/0;
        }
        return orderService.getOrder(orderId);
    }
}
