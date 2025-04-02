public class Lab2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        System.out.println(a.length);
        System.out.println(b.length);

//    todo    enhanced for loop
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        int[][] c = new int[3][4];
        int[][] d = {
                {1},
                {4, 5},
                {7, 8, 9}
        };

        System.out.println(d[1][1]);

        System.out.println(1^2);
        System.out.println(1|2);

        System.out.println(1^3);
        System.out.println(1|3);

        int[][] matrix = new int[2][];

        matrix[0] = new int[3];
        matrix[1] = new int[2];

        myMethod(matrix);
    }

    static void myMethod(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }

        }
    }
}
