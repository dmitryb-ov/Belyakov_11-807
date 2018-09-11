import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write quantity");
        //global var`s
        int n = sc.nextInt();
        int[] mas = new int[n];
        double sum = 0.0;
        double srnum = 0.0;
        int k = 0;
        //
        System.out.println("Write height");
        for (int i = 0; i < mas.length ; i++) {
            mas[i] = sc.nextInt();
            sum = sum + mas[i];
        }
        srnum = sum/n;
        for (int i = 0; i < n; i++) {
            if (mas[i] >= srnum){
                k++;
            }
        }
        System.out.println("Middle height: "+srnum);
        System.out.println("Kolvo>middle: "+k);
    }
}
