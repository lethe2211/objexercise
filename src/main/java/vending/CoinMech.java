package vending;

public class CoinMech {

    private CashBox cashBox; // 100円玉の在庫
    private Payment payment;

    public CoinMech() {
        cashBox = new CashBox();
        for (int i = 0; i < 10; i++) {
            cashBox.add(Coin.ONE_HUNDRED);
        }
    }

    public void put(Coin coin) {
        this.payment = new Payment(coin);
    }

    public boolean hasEnoughChange() {
        return payment.needsChange() && cashBox.hasEnoughChange();
    }

    public Change refund() {
        return payment.refund();
    }

    public void commit() {
        payment.commit(cashBox);
    }
}
