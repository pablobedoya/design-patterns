package facade.restaurant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Kitchen {

    private static final Logger LOGGER = LogManager.getLogger(Kitchen.class);

    public void selectIngredients() {
        LOGGER.info("Selecting the ingredients to prepare the meal...");
    }

    public void prepareMeal() {
        LOGGER.info("Preparing the meal.");
    }

    public void callWaiter() {
        LOGGER.info("Calling the waiter to serve the meal to the customer.");
    }

}
