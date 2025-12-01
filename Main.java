public class Main {
    public static void main(String[] args) {

        Coffee myOrder = new BlackCoffee();
        myOrder = new Milk(myOrder);
        myOrder = new CaramelSyrup(myOrder);

        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Total Cost: ₱ " + myOrder.getCost());
    }
}
