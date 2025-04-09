public class Lab3 {
    public static void main(String[] args) {
        String s = "A";
        String s2 = s;
        s += 'B';
        String s3 = "AB";
        System.out.println(s == s2); // false
        System.out.println(s == s3); //
        System.out.println(s.equals(s3)); // true
        System.out.println(s3.equals(s)); // true
        System.out.println(1 == 1);
        System.out.println(1 == 2);
        /*System.out.println(s);
        System.out.println(s2);*/
        /*System.out.println(s.length());
        System.out.println(s.substring(0, 5));
        System.out.println(s.indexOf(","));*/
//        System.out.println(s/*.trim()*/);

//        todo check difference
//        String s3 = new String("Hello, World!");

        StringBuilder sb = new StringBuilder("Hello, World!");
        sb.append('d');
        /*System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.substring(0, 5));
        System.out.println(sb.indexOf(" "));*/

        StringBuffer sbf = new StringBuffer("Hello, World ! ");
        sbf.append('d');
        /*System.out.println(sbf.capacity());
        System.out.println(sbf.length());
        System.out.println(sbf.substring(0, 5));
        System.out.println(sbf.indexOf(" "));
        System.out.println(sbf.indexOf(" ", 7));
        System.out.println(sbf.lastIndexOf(" "));
//        System.out.println(sbf.trim());
        System.out.println(sbf.charAt(1));*/

//        todo regex

    }
}
