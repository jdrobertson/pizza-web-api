package net.joelrobertson.pizza.pizzatopping;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaToppingService {

    private final PizzaToppingRepository pizzaToppingRepository;

    public PizzaToppingService(PizzaToppingRepository pizzaToppingRepository) {
        this.pizzaToppingRepository = pizzaToppingRepository;
    }

    public List<PizzaTopping> getPizzaToppings() {
        return pizzaToppingRepository.findAll();
    }

    public PizzaTopping createPizzaTopping(PizzaTopping pizzaTopping) {
        return pizzaToppingRepository.save(pizzaTopping);
    }
}
