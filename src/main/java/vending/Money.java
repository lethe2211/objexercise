package vending;

public class Money {

    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public Money add(int amount) {
        return new Money(this.amount + amount);
    }

}
