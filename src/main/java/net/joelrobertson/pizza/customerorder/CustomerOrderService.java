package net.joelrobertson.pizza.customerorder;

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

    public CustomerOrder getCustomerOrderById(Long customerOrderId) {
        return customerOrderRepository.findById(customerOrderId).orElse(null);
    }

    public CustomerOrder createCustomerOrder(CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }

    public CustomerOrder updateCustomerOrder(Long customerOrderId, UpdateCustomerOrderDto updateCustomerOrderDto) {
        var customerOrder = customerOrderRepository.findById(customerOrderId);
        if (customerOrder.isPresent()) {
            if (!customerOrder.get().getFulfilled() && updateCustomerOrderDto.getFulfilled()) {
                customerOrder.get().setFulfilled(updateCustomerOrderDto.getFulfilled());
                return customerOrderRepository.save(customerOrder.get());
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
    }
}
