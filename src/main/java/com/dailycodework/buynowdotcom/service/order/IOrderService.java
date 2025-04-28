package com.dailycodework.buynowdotcom.service.order;

import com.dailycodework.buynowdotcom.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    List<Order> getUserOrders(Long userId);
}
