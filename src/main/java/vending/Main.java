package vending;

public class Main {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        Drink drink = vm.buy(Coin.FIVE_HUNDRED, DrinkType.COKE);
        Change change = vm.refund();

        if (drink == null) {
            System.out.println("Could not buy Coke...");
        } else {
            System.out.println(String.format("Could buy coke-> Change: %s yen", change));
        }
    }
}
