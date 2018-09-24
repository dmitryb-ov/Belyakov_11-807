import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        System.out.println("Write quantity");
        System.out.println("First");
        int kolvo = sc.nextInt();
        System.out.println("Second");
        int volvo = sc.nextInt();
        tets(kolvo,volvo);
        String[] num1 = new String[kolvo];
        String[] num2 = new String[kolvo];
        System.out.println("Write first arr");
        for (int i = 0; i < kolvo; i++) {
            num1[i] = sc.next();
        }
        System.out.println("Write second arr");
        for (int i = 0; i < volvo; i++) {
            num2[i] = sc.next();
        }
        doubleMas(num1,num2,kolvo,volvo);
    }
    static void tets (int kolvo, int volvo){
        if(kolvo < volvo){
            System.out.println("First argument must be > than second argument. Change place this argument");
        }
    }
    static int doubleMas(String[] num1, String[] num2, int kolvo, int volvo) {
        int s = 0;
        for (int i = 0; i < kolvo; i++) {
            for (int j = 0; j < volvo; j++) {
                if (num1[i].equals(num2[j])) {
                    s = (kolvo + volvo) - 1;
                }
            }
        }
        if (s == 0) {
            System.out.println(kolvo + volvo);
        } else {
            System.out.println("Output:" + s);
        }
        return s;
    }

}