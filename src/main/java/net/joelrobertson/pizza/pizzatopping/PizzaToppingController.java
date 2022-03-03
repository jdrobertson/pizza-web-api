package net.joelrobertson.pizza.pizzatopping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PizzaToppingController {

    private final PizzaToppingService PizzaToppingService;

    public PizzaToppingController(PizzaToppingService PizzaToppingService) {
        this.PizzaToppingService = PizzaToppingService;
    }

    @GetMapping("/pizzatoppings")
    public List<PizzaTopping> getPizzaToppings() {
        return PizzaToppingService.getPizzaToppings();
    }

    @PostMapping("/pizzatoppings")
    public PizzaTopping postPizzaTopping(@RequestBody PizzaTopping pizzaTopping) {
        return PizzaToppingService.createPizzaTopping(pizzaTopping);
    }
}
