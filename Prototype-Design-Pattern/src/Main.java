public class Main {
    public static void main(String[] args) {
        ProductPrototype product1 = new Product("Hp",40000);
        ProductPrototype product2 = new Product("Dell",50000);

        ProductPrototype newProduct1 = product1.clone();
        ProductPrototype newProduct2 = product2.clone();

        System.out.println("Original Products:");
        product1.display();
        product2.display();

        System.out.println("Clone Products:");
        newProduct1.display();
        newProduct2.display();
    }
}