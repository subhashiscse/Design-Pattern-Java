public class ExtraSauceDecorator extends Decorator {
    private final double extraSaucePrice;

    public ExtraSauceDecorator(FoodItem item, double price) {
        super(item);
        this.extraSaucePrice = price;
    }

    public String getDescription() {
        return foodItem.getDescription() + " with Extra Sauce";
    }

    public double getPrice() {
        return foodItem.getPrice() + extraSaucePrice;
    }
}
