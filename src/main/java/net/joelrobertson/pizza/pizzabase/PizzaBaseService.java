package net.joelrobertson.pizza.pizzabase;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaBaseService {

    private final PizzaBaseRepository pizzaBaseRepository;

    public PizzaBaseService(PizzaBaseRepository pizzaBaseRepository) {
        this.pizzaBaseRepository = pizzaBaseRepository;
    }

    public List<PizzaBase> getPizzaBases() {
        return pizzaBaseRepository.findAll();
    }

    public PizzaBase createPizzaBase(@NotNull PizzaBase pizzaBase) {
        return pizzaBaseRepository.save(pizzaBase);
    }
}
