public class Lab1 {
    public static void main(String[] args) {
        final char A = 1;
        final char N = 5;
        final char B = 1;
        final char M = 5;
        final char C = 2;
//        for(;;);

        double s = 0;
        boolean isDivisionByZero = false;
//        try {
        label1: for (char i = A; i <= N && !isDivisionByZero; i++) {
//            todo improve
            /*if (i == C) {
//                    continue;
//                s = Double.POSITIVE_INFINITY;
//                s = Math.MAX_VALUE;
                isDivisionByZero = true;
                break;
            }*/

            for (char j = B; j <= M; j++) {
                if (i == C) {
                    isDivisionByZero = true;
                    break /*label1*/;
                    /*System.out.println("Division by zero");
                    return;*/
                }
//                todo add check for j == 0
                s += (double) (i % j) / (i - C);
            }
        }

        if (isDivisionByZero) {
            System.out.println("Division by zero");
        } else {
            System.out.println(s);
        }
        /*} catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }*/

//        System.out.println(-1.0 / 0);
//        System.out.println(/*(double)*/ 0 / 0);


//todo check in C/C++ and C#
        /*System.out.println(1 / 2);
        System.out.println(1.0 / 2);
        System.out.println(1f / 2);*/

        /*System.out.println(args[0]);
        System.out.println(args[1]);*/
    }
}
