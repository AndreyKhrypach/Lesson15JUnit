import java.util.Arrays;

public class Lesson15Program {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Integer[][] matrix1 = new Integer[5][5];
        Integer[][] matrix2 = new Integer[][]{{1,2,3}, {1,2,3,4}, {1,2,3}};
        Integer[][] matrix3 = new Integer[0][0];
        Integer[][] matrix4 = new Integer[5][6];

        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
        System.out.println(matrix.isMatrixSquare(matrix1));

        System.out.println(matrix.isMatrixSquare(matrix2));
        System.out.println(matrix.isMatrixSquare(matrix3));
        System.out.println(matrix.isMatrixSquare(matrix4));
    }
}
