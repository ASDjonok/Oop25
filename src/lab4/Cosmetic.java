package lab4;

public class Cosmetic {
//    todo add equals() and hashCode() methods
//    todo analise directives of visibility
    private String name;
    private String color;
    private double price;
    private int quantity;
    private String brand;

    // constructor
    public Cosmetic(String name, String color, double price, int quantity, String brand) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                '}';
    }
}
