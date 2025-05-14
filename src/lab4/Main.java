package lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cosmetic lipstick = new Cosmetic("Lipstick", "Red", 19.99, 50, "BrandA");
//        lipstick.name = "Lipstick2";
//        System.out.println(lipstick.name);
//        System.out.println(lipstick.getName());
//        lipstick.setName("Lipstick2");
//        System.out.println(lipstick.getName());
//        todo set example (faculty+group)
        /*Student student = new Student("John Doe", "FIOT", "IO-43");
        System.out.println(student.getName());
        System.out.println(student.getFaculty());
        System.out.println(student.getGroup());
        student.setFaculty("FPM", "FP-44", *//*"123456",*//* "admin");*/
//        student.setGroup("FP-44");


        // створити масив з об’єктів класу визначеному варіантом
        // 1. Створити масив з 5 об’єктів класу Cosmetic
        /*Cosmetic[] cosmetics = new Cosmetic[5];
        cosmetics[0] = new Cosmetic("Lipstick", "Red", 19.99, 50, "BrandA");
        cosmetics[1] = new Cosmetic("Foundation", "Beige", 29.99, 30, "BrandB");
        cosmetics[2] = new Cosmetic("Eyeliner", "Black", 15.99, 20, "BrandC");
        cosmetics[3] = new Cosmetic("Blush", "Pink", 12.99, 25, "BrandD");
        cosmetics[4] = new Cosmetic("Mascara", "Black", 18.99, 40, "BrandE");*/
        Cosmetic[] cosmetics = {
                new Cosmetic("Lipstick", "Red", 19.99, 50, "BrandA"),
                new Cosmetic("Foundation", "Beige", 19.99, 30, "BrandB"),
                new Cosmetic("Eyeliner", "Black", 15.99, 20, "BrandC"),
                new Cosmetic("Blush", "Pink", 12.99, 25, "BrandD"),
                new Cosmetic("Mascara", "Black", 18.99, 40, "BrandE")
        };
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
//        todo analise other interpretations of task (ways of sorting)
        Arrays.sort(cosmetics, (c1, c2) -> {
            if (c1.getPrice() == c2.getPrice()) {
//                todo fix sort direction
                return c1.getName().compareTo(c2.getName());
            }
            return Double.compare(c1.getPrice(), c2.getPrice());
        });
        System.out.println("Sorted by price:");
        for (Cosmetic cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }




    }
}
