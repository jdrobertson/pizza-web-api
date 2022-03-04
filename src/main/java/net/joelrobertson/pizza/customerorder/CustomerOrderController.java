package net.joelrobertson.pizza.customerorder;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerOrderController {

    private final String controllerRoute = "/customerorders";

    private final CustomerOrderService customerOrderService;

    public CustomerOrderController(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }

    @GetMapping(controllerRoute)
    public List<CustomerOrder> getCustomerOrders() {
        return customerOrderService.getCustomerOrders();
    }

    @GetMapping(controllerRoute+"/{customerOrderId}")
    public CustomerOrder getCustomerOrder(@PathVariable Long customerOrderId) {
        return customerOrderService.getCustomerOrderById(customerOrderId);
    }

    @PostMapping(controllerRoute)
    public CustomerOrder postCustomerOrder(@RequestBody CustomerOrder customerOrder) {
        return customerOrderService.createCustomerOrder(customerOrder);
    }

    @PatchMapping(controllerRoute+"/{customerOrderId}")
    public CustomerOrder patchCustomerOrder(
            @PathVariable Long customerOrderId,
            @RequestBody UpdateCustomerOrderDto updateCustomerOrderDto) {
        return customerOrderService.updateCustomerOrder(customerOrderId, updateCustomerOrderDto);
    }
}
