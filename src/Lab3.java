public class Lab3 {
    int a = 1;

    public static void main(String[] args) {
        String s = "A";
        String s2 = s;
//        System.out.println(s == s2); // true
        s += 'B';
        String s3 = "AB";
//        System.out.println(s == s2); // false
//        System.out.println(s == s3); // false
//        System.out.println(s.equals(s3)); // true
//        System.out.println(s3.equals(s)); // true
//        System.out.println(1 == 1);
//        System.out.println(1 == 2);

        String s4 = "AB";
//        String s5 = "AB";
        String s5 = new String("AB");
//        System.out.println(s3 == s5);
        /*System.out.println(s);
        System.out.println(s2);*/
        /*System.out.println(s.length());
        System.out.println(s.substring(0, 5));
        System.out.println(s.indexOf(","));*/
//        System.out.println(s/*.trim()*/);

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

//        for (;;);
        /*int a = 0;
        for (int i = 0; i < 100000000; i++) {
//            System.out.println(i);

            for (int j = 0; j < 100000000; j++) {
//            System.out.println(i);
                a += i + j;
            }
//            a += i;
        }
        System.out.println(a);*/

//        todo String.split()
        String s6 = "Hello, World. I am a student.";
        String[] splitStrings = s6.split("\\. ?");
        for (String s8 : splitStrings) {
            System.out.println(s8/*.trim()*/);
        }
        /*String a[] = {"1", "2", "3"};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (String stringElement : a) {
            System.out.println(stringElement);
        }*/

    }
}
