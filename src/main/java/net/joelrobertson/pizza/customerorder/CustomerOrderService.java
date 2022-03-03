package net.joelrobertson.pizza.customerorder;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderService {

    private final CustomerOrderRepository customerOrderRepository;

    public CustomerOrderService(CustomerOrderRepository customerOrderRepository) {
        this.customerOrderRepository = customerOrderRepository;
    }

    public List<CustomerOrder> getCustomerOrders() {
        return customerOrderRepository.findAll();
    }

    public CustomerOrder createCustomerOrder(@NotNull CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }
}
