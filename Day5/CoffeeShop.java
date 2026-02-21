
class MenuItem {
    private String name;
    private double price;

    
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


class Order {
    private MenuItem[] items;
    private int itemCount;

 
    public Order() {
        items = new MenuItem[10];
        itemCount = 0;
    }

    public void addMenuItem(MenuItem item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
            System.out.println(item.getName() + " added to order.");
        } else {
            System.out.println("Order is full. Cannot add more items.");
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println(" Receipt ");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getName() + " - $" + items[i].getPrice());
        }
       
        System.out.println("Total: $" + calculateTotal());
    }
}

public class CoffeeShop {
    public static void main(String[] args) {

        
        MenuItem coffee = new MenuItem("Coffee", 3.50);
        MenuItem sandwich = new MenuItem("Sandwich", 5.75);
        MenuItem cake = new MenuItem("Cake", 4.25);

        Order order = new Order();

        order.addMenuItem(coffee);
        order.addMenuItem(sandwich);
        order.addMenuItem(cake);

        order.printReceipt();
    }
}
