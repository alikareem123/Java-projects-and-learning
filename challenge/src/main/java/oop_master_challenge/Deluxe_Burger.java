package oop_master_challenge;

public class Deluxe_Burger extends Burger{
    Item deluxe1, deluxe2;

    public Deluxe_Burger(String name, double price){
        super(name, price);
    }


    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new Item("TOPPING", extra4, 0);
        deluxe2 = new Item("TOPPING", extra5, 0);
    }

    @Override
    public void printItemSizedList() {
        super.printItemSizedList();
        if(deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }


    @Override
    public double getExtraPrice(String toppingName) {
        return super.getExtraPrice(toppingName);
    }
    
}
