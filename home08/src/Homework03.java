import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write strok");
        int strok = sc.nextInt();
        System.out.println("Write stolb");
        int stolb = sc.nextInt();
        System.out.println("Write numbers");
        int matrix[][] = new int[strok][stolb];
        int t = 1;
        int count1 = 1;
        int count2 = 1;
        for (int i = 0; i < stolb; i++) {
            matrix[0][i] = sc.nextInt();
            t++;
        }
        //System.out.println("0");
        for (int i = 1; i < strok; i++) {
            matrix[i][stolb - 1] = sc.nextInt();
            t++;
        }
        //System.out.println("1");
        for (int i = stolb - 2; i >= 0; i--) {
            matrix[strok - 1][i] = sc.nextInt();
            t++;
        }
        //System.out.println("2");
        for (int i = strok - 2; i > 0; i--) {
            matrix[i][0] = sc.nextInt();
            t++;
        }
        //System.out.println("3");
        while (t < stolb * strok) {
            while (matrix[count1][count2 + 1] == 0) {
                matrix[count1][count2] = sc.nextInt();
                count2++;
                t++;
            }
            while (matrix[count1 + 1][count2] == 0) {
                matrix[count1][count2] = sc.nextInt();
                count1++;
                t++;
            }
            while (matrix[count1][count2 - 1] == 0) {
                matrix[count1][count2] = sc.nextInt();
                count2--;
                t++;
            }
            while (matrix[count1 - 1][count2] == 0) {
                matrix[count1][count2] = sc.nextInt();
                count1--;
                t++;
            }
        }
        for (int i = 0; i < strok; i++) {
            for (int j = 0; j < stolb; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = sc.nextInt();
                    t++;
                }
            }
        }
        for (int i = 0; i < strok; i++) {
            for (int j = 0; j < stolb; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
