public class ExtraToppingsDecorator extends Decorator {
    private final double extraToppingsPrice;

    public ExtraToppingsDecorator(FoodItem item, double price) {
        super(item);
        this.extraToppingsPrice = price;
    }

    public String getDescription() {
        return foodItem.getDescription() + " with Extra Toppings";
    }

    public double getPrice() {
        return foodItem.getPrice() + extraToppingsPrice;
    }
}