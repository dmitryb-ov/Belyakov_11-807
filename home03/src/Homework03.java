import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write quantity");
        //global var`s
        int n = sc.nextInt();
        int[] mas = new int[n];
        int k=0;
        //
        System.out.println("Write numbers");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        for (int i = 1; i < mas.length-1; i++){
            if(mas[i]>mas[i-1] && mas[i]>mas[i+1]){
                k++;
            }
        }
        System.out.println("Kol-vo: "+k);
    }
}
