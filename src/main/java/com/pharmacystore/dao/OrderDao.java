package com.pharmacystore.dao;

import java.util.List;

import com.pharmacystore.pojo.Order;

public interface OrderDao {

	boolean placeOrder(Order order);
	List<Order> getAllOrders();
	Order searchOrder(int orderId);
	boolean changeOrderStatusToConfirmed(int orderId);
	boolean changeOrderStatusToCancelled(int orderId);
	List<Order> getAllOrdersForUser(String customerid);
	boolean updateOrderAddress(int orderid,
			String address);
}