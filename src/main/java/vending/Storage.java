package vending;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private Map<DrinkType, Stock> stocks;

    public Storage() {
        stocks = new HashMap<>();
        stocks.put(DrinkType.COKE, new Stock(5));
        stocks.put(DrinkType.DIET_COKE, new Stock(5));
        stocks.put(DrinkType.TEA, new Stock(5));
    }

    public boolean doesNotHaveStock(DrinkType drinkType) {
        return findStock(drinkType).isEmpty();
    }

    public Drink takeOut(DrinkType drinkType) {
        Stock stock = findStock(drinkType);
        stock.pop();
        return new Drink(drinkType);
    }

    private Stock findStock(DrinkType drinkType) {
        return stocks.get(drinkType);
    }
}
