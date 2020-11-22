package facade;

import facade.restaurant.Kitchen;
import facade.restaurant.Waiter;

public class RestaurantOrderFacade {

    private Waiter waiter = new Waiter();
    private Kitchen kitchen = new Kitchen();

    public void orderMeal() {
        waiter.writeOrder();
        waiter.sendMealToKitchen();
        kitchen.selectIngredients();
        kitchen.prepareMeal();
        kitchen.callWaiter();
        waiter.serveMeal();
    }

}
