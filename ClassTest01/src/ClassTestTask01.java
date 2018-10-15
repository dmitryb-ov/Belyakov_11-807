import java.util.Scanner;

/**
 * Вариант 1
 */
public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write n");
        int n = sc.nextInt(); // ввод n
        int m = n * n; //n^2 чисел
        int[][] matrix = new int[n][n];
        //Заполняем матрицу в main
        System.out.println("Write matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nTask1: ");
        int arr[] = getSideDiagonalAsVector(matrix);
        System.out.println("\nTask2: ");
        int[] arr1 = mult(matrix,arr);
        System.out.println("\nTask3: ");
        sortArr(arr1);
    }

    //Task1
    static int[] getSideDiagonalAsVector(int[][] matrix) {
        int n = matrix[0].length;
        //int k = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = matrix[i][matrix.length - i - 1];
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    //Task2
    static int[] mult(int[][] matrix, int[] arr) {
        int sum = 0;
        int s = matrix[0].length;
        int arrs[] = new int[s];
        for (int i = 0; i < matrix[0].length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[j][i] * arr[i];
                arrs[i] = sum;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(arrs[i]+" ");
        }
        return arrs;
    }

    //Task3
    static void sortArr(int[] arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(Math.abs(arr[j]) < Math.abs(arr[j+1])){
                    int sort = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = sort;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
