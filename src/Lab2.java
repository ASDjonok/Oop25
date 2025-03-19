public class Lab2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        System.out.println(a.length);
        System.out.println(b.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        int[][] c = new int[3][4];
        int[][] d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(d[1][1]);

    }
}
