import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write matrix 1");
        int strok = sc.nextInt();
        System.out.println("Write matrix 2");
        int stolb = sc.nextInt();
        System.out.println("Write numbers");
        int matrix[][] = new int[strok][stolb];
        for (int i = 0; i < strok; i++) {
            for (int j = 0; j < stolb; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sumStr = 0;
        int maxStr = 0;
        int stroks = 0;
        for (int i = 0; i < strok; i++) {
            sumStr = 0;
            for (int j = 0; j < stolb; j++) {
                sumStr += matrix[i][j];
                if (maxStr <= sumStr) {
                    maxStr = sumStr;
                    stroks = i;
                }
            }
        }
        System.out.println(" Stroka");
        for (int i = 0; i < stolb; i++) {
            System.out.printf("%d ",matrix[stroks][i]);
        }
        int sumStlb = 0;
        int maxStlb = 0;
        int stolbs = 0;
        for (int i = 0; i < stolb; i++) {
            sumStlb = 0;
            for (int j = 0; j < strok; j++) {
                sumStlb += matrix[j][i];
                if(maxStlb <= sumStlb){
                    maxStlb = sumStlb;
                    stolbs = i;
                }
            }
        }
        System.out.println("\n Stolb");
        for (int i = 0; i < strok; i++) {
            System.out.printf("%d\n",matrix[i][stolbs]);
        }
        System.out.printf("\nMaxstr %d, Str %d \nMaxstlb %d, Stolb %d",maxStr, stroks,maxStlb, stolbs);
    }
}
