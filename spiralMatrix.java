public class spiralMatrix {

    public static void spiral(int matrix[][]) {
        int sr = 0, sc = 0;
        int er = matrix.length - 1, ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {
            // top
            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j] + " ");
            }

            // right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }
            // bottom
            for (int j = ec - 1; j >= sc; j--) {
                if (sr == er) {
                    break;
                }
                System.out.print(matrix[er][j] + " ");
            }
            //left
            for (int i = er - 1; i >= sr + 1; i--) {
                if (sc == ec) {
                    break;
                }
                System.out.print(matrix[i][sc] + " ");
            }
            sc++;
            sr++;
            er--;
            ec--;
        }
        System.out.println();

    }
    
    public static void diagonalSum(int matrix[][]) {
        //sum diagonal sum

        int sum = 0;

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        for (int i = 0; i < matrix.length; i++) {
            //pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // spiral(matrix);
        diagonalSum(matrix);
    }
}
