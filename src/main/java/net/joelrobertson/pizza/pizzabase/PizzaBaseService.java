package net.joelrobertson.pizza.pizzabase;

import net.joelrobertson.pizza.pizzabasesize.PizzaBaseSizeDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PizzaBaseService {

    private final PizzaBaseRepository pizzaBaseRepository;

    public PizzaBaseService(PizzaBaseRepository pizzaBaseRepository) {
        this.pizzaBaseRepository = pizzaBaseRepository;
    }

    public List<PizzaBaseDto> getPizzaBases() {
        return pizzaBaseRepository.findAll().stream().map(pizzaBase ->
            new PizzaBaseDto(
                pizzaBase.getId(),
                pizzaBase.getName(),
                pizzaBase.getPizzaBaseSizes().stream().map(pizzaBaseSize ->
                    new PizzaBaseSizeDto(
                        pizzaBaseSize.getId(),
                        pizzaBaseSize.getName(),
                        pizzaBaseSize.getInches(),
                        null
                    )
                ).collect(Collectors.toList())
            )
        ).collect(Collectors.toList());
    }

    public PizzaBase createPizzaBase(@NotNull PizzaBase pizzaBase) {
        return pizzaBaseRepository.save(pizzaBase);
    }
}
