package vending;

public class Stock {

    private int quantity;

    public Stock(int quantity) {
        this.quantity = quantity;
    }

    public boolean isEmpty() {
        return quantity == 0;
    }
s
    public void pop() {
        quantity--;
    }
}
