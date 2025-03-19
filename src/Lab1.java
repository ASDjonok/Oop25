public class Lab1 {
    public static void main(String[] args) {
        final char A = 3;
        final char N = 5;
        final char B = 0;
        final char M = 5;
        final char C = 2;

        double s = 0;

        if ((C >= A && C <= N) || (0 >= B && 0 <= M)) {
            System.out.println("Division by zero");
            return;
        }

        for (char i = A; i <= N; i++) {
            for (char j = B; j <= M; j++) {
                s += (double) (i % j) / (i - C);
            }
        }
        System.out.println(s);
    }
}
