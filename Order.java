import java.util.ArrayList;
import java.util.List;

class MenuItem {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public MenuItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method untuk menghitung total harga per item
    public double calculateTotal() {
        return price * quantity;
    }
}

public class Order {
    private List<MenuItem> orderItems;

    // Constructor
    public Order() {
        orderItems = new ArrayList<>();
    }

    // Method untuk menambahkan item ke dalam pesanan
    public void addItem(MenuItem item) {
        orderItems.add(item);
    }

    // Method untuk menghitung total seluruh pesanan
    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : orderItems) {
            total += item.calculateTotal();
        }
        return total;
    }

    // Method untuk mencetak nota
    public void printReceipt() {
        System.out.println("=== Nota Pemesanan ===");
        for (MenuItem item : orderItems) {
            System.out.println(item.getName() + " x " + item.getQuantity() + " = " + item.calculateTotal());
        }
        System.out.println("Total Pembayaran: " + calculateTotal());
        System.out.println("======================");
    }
}
class Main {
    public static void main(String[] args) {
        // Membuat instance Order
        Order order = new Order();

        // Menambahkan beberapa item menu ke dalam pesanan
        order.addItem(new MenuItem("Nasi Goreng", 20000, 2));
        order.addItem(new MenuItem("Ayam Bakar", 25000, 1));
        order.addItem(new MenuItem("Es Teh", 5000, 3));

        // Mencetak nota
        order.printReceipt();

    }
}

