import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //global var`s
        int[] mas = {3,4,2,11,133};
        String str = "";
        //
        System.out.println("Output");
        for (int i = 0; i < 5; i++) {
            str += mas[i];
            //System.out.print(mas[i]);
        }
        int x = Integer.parseInt(str);
        System.out.print(x);
        //System.out.printf("%d%d%d%d%d",mas[0],mas[1],mas[2],mas[3],mas[4]);
    }
}

