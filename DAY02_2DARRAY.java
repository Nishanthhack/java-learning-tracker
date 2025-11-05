public class DAY02_2DARRAY {
    static void main() {
        int[][]matrix = new int[5][5];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[2][3] = 4;
        matrix[3][4] = 5;
        matrix[4][4] = 6;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
