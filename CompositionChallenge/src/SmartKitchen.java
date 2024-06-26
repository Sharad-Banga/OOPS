public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator  iceBox;

    public  SmartKitchen(){
    brewMaster = new CoffeeMaker();
    iceBox = new Refrigerator();
    dishWasher=new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag , boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.orderFood(fridgeFlag);
        dishWasher.doDishes(dishWasherFlag);
    }
}
class CoffeeMaker{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo=false;
        }
    }
}

class Refrigerator{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering food");
            hasWorkToDo=false;
        }
    }
}

class DishWasher{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing Dishes");
            hasWorkToDo=false;
        }
    }
}

