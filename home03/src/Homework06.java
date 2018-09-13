import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write quantity");
        int n = sc.nextInt();
        //global var`s
        int[] mas = new int[n];
        //
        System.out.println("Write numbers");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        for (int i = mas.length-1; i >= 0 ; i--) {
            System.out.print("Output: "+mas[i]);
        }
    }
}
