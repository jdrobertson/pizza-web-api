package net.joelrobertson.pizza.customerorder;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerOrderController {

    private final CustomerOrderService customerOrderService;

    public CustomerOrderController(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }

    @GetMapping("/customerorders")
    public List<CustomerOrder> getCustomerOrders() {
        return customerOrderService.getCustomerOrders();
    }

    @PostMapping("/customerorders")
    public CustomerOrder postCustomerOrder(@RequestBody CustomerOrder customerOrder) {
        return customerOrderService.createCustomerOrder(customerOrder);
    }
}
