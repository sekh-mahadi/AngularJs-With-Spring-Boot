package io.mtech.ecommerce.service;


import org.springframework.stereotype.Service;

import io.mtech.ecommerce.dto.Purchase;
import io.mtech.ecommerce.dto.PurchaseResponse;

@Service
public interface CheckoutService {
	
	PurchaseResponse placeOrder(Purchase purchase);

}
