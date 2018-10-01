import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write stroki");
        int strokA = sc.nextInt();
        System.out.println("Write stolb");
        int stolbA = sc.nextInt();
        int[][] matrixA = new int[strokA][stolbA];
        System.out.println("Write stroki");
        int strokB = sc.nextInt();
        System.out.println("Write stolb");
        int stolbB = sc.nextInt();
        int[][] matrixB = new int[strokB][stolbB];
        int[][] matrixC = new int[matrixA.length][matrixB[0].length];
        System.out.println("Write matrix A");
        for (int i = 0; i < strokA; i++) {
            for (int j = 0; j < stolbA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Write matrix B");
        for (int i = 0; i < strokB; i++) {
            for (int j = 0; j < stolbB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        //System.out.println(matrixB.length);
        //System.out.println(matrixB[0].length);
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[0].length; j++) {
                System.out.printf("%d ", matrixC[i][j]);
            }
            System.out.println(" ");
        }
    }
}