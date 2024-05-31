// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getDishWasher().doDishes(true);
        kitchen.getIceBox().orderFood(true);
        kitchen.getBrewMaster().brewCoffee(true);

        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();
    }
}