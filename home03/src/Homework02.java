import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write quantity");
        //global var`s
        int n = sc.nextInt();
        int[] mas = new int[n];
        int max = 0;
        int k = 0;
        //
        System.out.println("Write numbers");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
            if(Math.abs(mas[i]) > max){
                max = Math.abs(mas[i]);
                k = i+1;
            }
        }
        System.out.println("Max index: "+k);
    }
}
