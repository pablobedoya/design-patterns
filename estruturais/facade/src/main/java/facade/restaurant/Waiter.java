package facade.restaurant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Waiter {
    
    private static final Logger LOGGER = LogManager.getLogger(Waiter.class);

    public void writeOrder() {
        LOGGER.info("Taking customer order...");
    }
    
    public void sendMealToKitchen() {
        LOGGER.info("Sending the meal to the kitchen.");
    }
    
    public void serveMeal() {
        LOGGER.info("Serving meal to the customer.");
    }

}
