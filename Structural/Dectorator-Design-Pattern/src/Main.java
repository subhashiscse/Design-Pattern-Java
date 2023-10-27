public class Main {
    public static void main(String[] args) {
        // Order a Pizza and a Burger.
        FoodItem pizzaOrder = new Pizza();
        FoodItem burgerOrder = new Burger();

        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder, 10.0);
        pizzaOrder = new ExtraSauceDecorator(pizzaOrder, 5.0);

        burgerOrder = new ExtraCheeseDecorator(burgerOrder, 20.0);
        burgerOrder = new ExtraToppingsDecorator(burgerOrder, 15.0);

        System.out.println("Description of pizza order is " + pizzaOrder.getDescription());
        System.out.println("Price of pizza order is: " + pizzaOrder.getPrice());

        System.out.println("Description of burger order is " + burgerOrder.getDescription());
        System.out.println("Price of burger order is: " + burgerOrder.getPrice());
    }
}