import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string and stolb");
        int sc1 = sc.nextInt();
        boolean mag = true;
        // int sc2 = sc.nextInt();
        int[][] matrix = new int[sc1][sc1];
        System.out.println("Write number");
        for (int i = 0; i < sc1; i++) {
            for (int j = 0; j < sc1; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sumDiagonal = 0;
        for (int i = 0; i < sc1; i++) {
            sumDiagonal += matrix[i][i];
        }
        int secDiag = 0;
        for (int i = 0; i < sc1; i++) {
            secDiag += matrix[i][sc1-i-1];
        }
        int rowSum = 0;
        for (int i = 0; i < matrix.length; i++) { // число строчек
            rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {// длина первой строки
                rowSum += matrix[i][j];
            }
        }
        /*System.out.println(sumDiagonal);
        System.out.println(secDiag);
        System.out.println(rowSum);*/
        if(secDiag != sumDiagonal || secDiag != rowSum || rowSum != sumDiagonal){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
