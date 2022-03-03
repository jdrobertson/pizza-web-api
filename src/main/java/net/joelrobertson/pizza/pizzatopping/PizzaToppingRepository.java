package net.joelrobertson.pizza.pizzatopping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaToppingRepository extends JpaRepository<PizzaTopping, Long> {
}