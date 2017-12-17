package vending;

import java.util.ArrayList;
import java.util.List;

public class Change {

    private List<Coin> coins;

    public Change() {
        this.coins = new ArrayList<>();
    }

    public Change(Coin coin) {
        this.coins = new ArrayList<>();
        coins.add(coin);
    }

    public Change(List<Coin> coins) {
        this.coins = coins;
    }

    public Change(Change change) {
        this(change.coins);
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public void add(Change change) {
        coins.addAll(change.coins);
    }

    public void clear() {
        coins.clear();
    }

    @Override
    public String toString() {
        return coins.toString();
    }
}
