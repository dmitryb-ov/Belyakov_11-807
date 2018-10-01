/*import java.util.Scanner;

public class Homework04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write stroki");
        int strok = sc.nextInt();
        System.out.println("Write stolb");
        int stolb = sc.nextInt();
        System.out.println("Write matrix");
        int[][] matrix = new int[strok][stolb];
        int min_Element_Of_Matrix = 0; // не самая совершенная система, но хоть так
        int max_Element_Of_Matrix = 0;
        int max_Strok = 0;
        int max_Stolb = 0;
        for (int all = 0; all < strok * stolb; all++) {
            for (int i = 0; i < strok; i++) {
                for (int j = 0; j < stolb; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            //Max
            for (int i = 0; i < strok; i++) {
                for (int j = 0; j < stolb; j++) {
                    if (matrix[i][j] > max_Element_Of_Matrix) {
                        max_Element_Of_Matrix = matrix[i][j];
                        max_Strok = i;
                        max_Stolb = j;
                    }
                }
            }
            matrix[max_Strok][max_Stolb] = 0;
            //Min
            min_Element_Of_Matrix = max_Element_Of_Matrix;
            for (int i = 0; i < strok; i++) {
                for (int j = 0; j < stolb; j++) {
                    if (matrix[i][j] < min_Element_Of_Matrix) {
                        min_Element_Of_Matrix = matrix[i][j];
                    }
                }
            }

        }
    }
}*/
