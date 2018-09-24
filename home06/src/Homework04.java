import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write quantity");
        int kolvo = sc.nextInt();
        String[] mas = new String[kolvo];
        for (int i = 0; i < kolvo; i++) {
            mas[i] = sc.next();
        }
        if(doubleSymbols(mas, kolvo) == true){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    static boolean doubleSymbols(String[] mas, int kolvo) {
        int k = 0;
        boolean f = false;
        for (int i = 0; i < kolvo; i++) {
            for (int j = 0; j < kolvo; j++) {
                if (mas[i].equals(mas[j])) {
                    k++;
                }
            }
            if(k > 1){
                f = true;
                break;
            }
            k = 0;
        }
        return f;
    }
}