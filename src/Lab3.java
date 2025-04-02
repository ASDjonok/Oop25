public class Lab3 {
    public static void main(String[] args) {
        String s = "Hello, World!";
        String s2 = s;
        s += 'd';
        System.out.println(s);
        System.out.println(s2);

//        todo check difference
//        String s3 = new String("Hello, World!");

        StringBuilder sb = new StringBuilder("Hello, World!");
        sb.append('d');
    }
}
