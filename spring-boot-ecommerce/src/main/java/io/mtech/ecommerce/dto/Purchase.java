package io.mtech.ecommerce.dto;


import java.util.Set;

import io.mtech.ecommerce.entity.Address;
import io.mtech.ecommerce.entity.Customer;
import io.mtech.ecommerce.entity.Order;
import io.mtech.ecommerce.entity.OrderItem;
import lombok.Data;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
