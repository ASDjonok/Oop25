package lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cosmetic lipstick = new Cosmetic("Lipstick", "Red", 19.99, 50, "BrandA");
//        lipstick.name = "Lipstick2";
//        System.out.println(lipstick.name);
//        System.out.println(lipstick.getName());
//        lipstick.setName("Lipstick2");
//        System.out.println(lipstick.getName());
        /*Student student = new Student("John Doe", "FIOT", "IO-43");
        System.out.println(student.getName());
        System.out.println(student.getFaculty());
        System.out.println(student.getGroup());
        student.setFaculty("FPM", "FP-44", *//*"123456",*//* "admin");*/
//        student.setGroup("FP-44");


        // створити масив з об’єктів класу визначеному варіантом
        // 1. Створити масив з 5 об’єктів класу Cosmetic
        Cosmetic[] cosmetics = new Cosmetic[5];
        cosmetics[0] = new Cosmetic("Lipstick", "Red", 19.99, 50, "BrandA");
        cosmetics[1] = new Cosmetic("Foundation", "Beige", 29.99, 30, "BrandB");
        cosmetics[2] = new Cosmetic("Eyeliner", "Black", 15.99, 20, "BrandC");
        cosmetics[3] = new Cosmetic("Blush", "Pink", 12.99, 25, "BrandD");
//        cosmetics[4] = new Cosmetic("Mascara", "Black", 18.99, 40, "BrandE");
        /*Cosmetic[] cosmetics = {
                new Cosmetic("Foundation", "Beige", 19.99, 30, "BrandB"),
                new Cosmetic("Lipstick", "Red", 19.99, 50, "BrandA"),
                new Cosmetic("Eyeliner", "Black", 15.99, 20, "BrandC"),
                new Cosmetic("Blush", "Pink", 12.99, 25, "BrandD"),
                new Cosmetic("Mascara", "Black", 18.99, 40, "BrandE")
        };*/
        // 2. Вивести на екран інформацію про всі об’єкти масиву
        for (Cosmetic cosmetic : cosmetics) {
            /*System.out.println("Name: " + cosmetic.getName());
            System.out.println("Color: " + cosmetic.getColor());
            System.out.println("Price: " + cosmetic.getPrice());
            System.out.println("Quantity: " + cosmetic.getQuantity());
            System.out.println("Brand: " + cosmetic.getBrand());*/
            System.out.println(cosmetic/*.toString()*/);
        }

        // Відсортувати масив, за одним з полів, за
        //зростанням, а за іншим, за спаданням використавши при цьому стандартні
        //засоби сортування.
        /*cosmetics.sort((c1, c2) -> {
            if (c1.getPrice() == c2.getPrice()) {
                return c1.getName().compareTo(c2.getName());
            }
            return Double.compare(c1.getPrice(), c2.getPrice());
        });*/
        /*Arrays.sort(cosmetics/*, (c1, c2) -> {
            if (c1.getPrice() == c2.getPrice()) {
                return c2.getName().compareTo(c1.getName());
            }
            return Double.compare(c1.getPrice(), c2.getPrice());
        }*!/);*/
        //sort by price
        /*Arrays.sort(cosmetics, (c1, c2) -> {
            return Double.compare(c1.getPrice(), c2.getPrice());
        });*/
//        Arrays.sort(cosmetics, Comparator.comparingDouble(Cosmetic::getPrice));

        System.out.println("Sorted by price and name:");
        for (Cosmetic cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }

        //sort by name
//        Arrays.sort(cosmetics, (c1, c2) -> c2.getName().compareTo(c1.getName()));
        /*Arrays.sort(cosmetics, Comparator.comparing(Cosmetic::getName).reversed());
        System.out.println("Sorted by name:");
        for (Cosmetic cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }*/

        /*byte a = -128;
        a--;
        System.out.println(a);*/

        /*Cosmetic cosmetic1 = new Cosmetic("Lipstick", "Red", 19.99, 50, "BrandA");
        System.out.println(cosmetic1.getName());
        cosmetic1.setName("Lipstick2");
        System.out.println(cosmetic1.getName());*/

        /*String[] strings = {"banana", "apple", "cherry"};
        Arrays.sort(strings);
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }*/

        System.out.println(cosmetics[0].equals(cosmetics[1]));
//        System.out.println(null.equals(cosmetics[0]));
        System.out.println(cosmetics[0].equals(null));

        String s = "A";
        Object o = s;
        o.equals("B");

    }
}
