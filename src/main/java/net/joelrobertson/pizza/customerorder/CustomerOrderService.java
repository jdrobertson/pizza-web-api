package net.joelrobertson.pizza.customerorder;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerOrderService {

    private final CustomerOrderRepository customerOrderRepository;

    public CustomerOrderService(CustomerOrderRepository customerOrderRepository) {
        this.customerOrderRepository = customerOrderRepository;
    }

    public List<CustomerOrderDto> getCustomerOrders() {
        return customerOrderRepository.findAllByOrderByFulfilledAsc()
            .stream().map(CustomerOrder::asDto).collect(Collectors.toList());
    }

    public CustomerOrderDto getCustomerOrderById(Long customerOrderId) {
        var customerOrder = customerOrderRepository.findById(customerOrderId);
        return customerOrder.map(CustomerOrder::asDto).orElse(null);
    }

    public CustomerOrder createCustomerOrder(CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }

    public CustomerOrder updateCustomerOrder(Long customerOrderId, UpdateCustomerOrderDto updateCustomerOrderDto) {
        var customerOrder = customerOrderRepository.findById(customerOrderId);
        if (customerOrder.isPresent() &&!customerOrder.get().getFulfilled() && updateCustomerOrderDto.getFulfilled()) {
            customerOrder.get().setFulfilled(updateCustomerOrderDto.getFulfilled());
            return customerOrderRepository.save(customerOrder.get());
        }
        else {
            return null;
        }
    }
}
