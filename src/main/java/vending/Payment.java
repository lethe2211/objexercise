package vending;

public class Payment {

    private Change change;
    private Coin coin;

    public Payment(Coin coin) {
        this.coin = coin;
    }

    public boolean needsChange() {
        return coin == Coin.FIVE_HUNDRED;
    }

    public void commit(CashBox cashBox) {
        if (coin == Coin.ONE_HUNDRED) {
            cashBox.add(coin);
            change = new Change();
        }

        if (coin == Coin.FIVE_HUNDRED) {
            change = cashBox.takeOutChange();
        }

        coin = null;
    }

    public Change refund() {
        return isNotCommited() ? new Change(coin) : change;
    }

    private boolean isNotCommited() {
        return coin != null;
    }
}
