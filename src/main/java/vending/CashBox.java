package vending;

import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CashBox {

    private Stack<Coin> numberOf100Yen;

    public CashBox() {
        this.numberOf100Yen = new Stack<>();
    }

    public CashBox(Stack<Coin> numberOf100Yen) {
        this.numberOf100Yen = numberOf100Yen;
    }

    public void add(Coin coin) {
        numberOf100Yen.add(coin);
    }

    public Coin pop(Coin coin) {
        return numberOf100Yen.pop();
    }

    public boolean hasEnoughChange() {
        return numberOf100Yen.size() >= 5;
    }


    public Change takeOutChange() {
        List<Coin> coins = IntStream.range(0, 4)
                .mapToObj(i -> numberOf100Yen.pop())
                .collect(toList());

        return new Change(coins);
    }
}
