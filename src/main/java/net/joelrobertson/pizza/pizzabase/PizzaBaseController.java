package net.joelrobertson.pizza.pizzabase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PizzaBaseController {

    private final PizzaBaseService PizzaBaseService;

    public PizzaBaseController(PizzaBaseService PizzaBaseService) {
        this.PizzaBaseService = PizzaBaseService;
    }

    @GetMapping("/pizzabases")
    public List<PizzaBaseDto> getPizzaBases() {
        return PizzaBaseService.getPizzaBases();
    }

    @PostMapping("/pizzabases")
    public PizzaBase postPizzaBase(@RequestBody PizzaBase pizzaBase) {
        return PizzaBaseService.createPizzaBase(pizzaBase);
    }
}
