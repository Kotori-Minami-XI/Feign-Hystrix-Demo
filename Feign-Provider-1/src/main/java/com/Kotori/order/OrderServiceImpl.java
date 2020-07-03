package com.Kotori.order;

import com.Kotori.SDK.OrderApi;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderApi {
    @Override
    public String getOrder(String orderId) {
        return "getOrder";
    }
}
