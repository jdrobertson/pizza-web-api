package net.joelrobertson.pizza.pizzabase;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.joelrobertson.pizza.pizzabasesize.PizzaBaseSize;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PizzaBase extends AbstractPersistable<Long> {

    private String name;

    @OneToMany(mappedBy = "pizzaBase", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<PizzaBaseSize> pizzaBaseSizes = new ArrayList<>();

    public List<PizzaBaseSize> getPizzaBaseSizes() {
        return pizzaBaseSizes;
    }

    public void setPizzaBaseSizes(List<PizzaBaseSize> pizzaBaseSizes) {
        this.pizzaBaseSizes = pizzaBaseSizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}