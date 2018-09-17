import java.util.Scanner;

public class Homework01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write
        System.out.println("Write first arr");
        String vvod = sc.next();
        System.out.println("Write second arr");
        String vvod_dop = sc.next();
        //
        int x = vvod.indexOf(vvod_dop);
        if (x > 0){
            System.out.println(x+1); //для удобного восприятия цифр
        }else{
            System.out.println("No count");
        }
    }
}
