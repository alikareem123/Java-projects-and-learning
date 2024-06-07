//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getBrewMaster().brewCoffee();
//        kitchen.getIceBox().orderFood();
//        kitchen.getDishWasher().doDishes();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}