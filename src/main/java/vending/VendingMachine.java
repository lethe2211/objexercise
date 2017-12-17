package vending;

public class VendingMachine {

    CoinMech coinMech = new CoinMech();
    Storage storage = new Storage();

    public Drink buy(Coin payment, DrinkType drinkType) {
        coinMech.put(payment);

        if (!coinMech.hasEnoughChange()) {
            return null;
        }

        if (storage.doesNotHaveStock(drinkType)) {
            return null;
        }

        coinMech.commit();

        return storage.takeOut(drinkType);
    }

    public Change refund() {
        return coinMech.refund();
    }

}