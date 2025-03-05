public class Lab1 {
    public static void main(String[] args) {
        final char A = 1;
        final char N = 5;
        final char B = 1;
        final char M = 5;
        final char C = 2;
//        for(;;);

        double s = 0;
        for (char i = A; i <= N; i++) {
//            todo improve
            if (i == C) {
                continue;
            }

            for (char j = B; j <= M; j++) {
//                todo add check for j == 0
                s += (double) (i % j) / (i - C);
            }
        }
        System.out.println(s);


        System.out.println(1.0 / 0);


//todo check in C/C++ and C#
        /*System.out.println(1 / 2);
        System.out.println(1.0 / 2);
        System.out.println(1f / 2);*/

        /*System.out.println(args[0]);
        System.out.println(args[1]);*/
    }
}
