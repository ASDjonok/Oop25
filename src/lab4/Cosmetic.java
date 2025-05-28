package lab4;

import java.util.Objects;

public class Cosmetic implements Comparable<Cosmetic> {
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

    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public int compareTo(Cosmetic o) {
        if (getPrice() == o.getPrice()) {
            return o.getName().compareTo(getName());
        }
        return Double.compare(/*this.*/getPrice(), o.getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cosmetic cosmetic = (Cosmetic) o;
        return Double.compare(price, cosmetic.price) == 0 && quantity == cosmetic.quantity
                && Objects.equals(name, cosmetic.name) && Objects.equals(color, cosmetic.color)
                && Objects.equals(brand, cosmetic.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, price, quantity, brand);
    }
}
