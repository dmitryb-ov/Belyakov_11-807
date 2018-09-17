import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string");
        String str = sc.next();
        System.out.println("Write number");
        int num = sc.nextInt();
        char[] symbols = str.toCharArray();
        boolean first = true;
        int k = 0;
        for (int i = 0; i < symbols.length; i++) {
            if((symbols[i+num]) > symbols.length-1){ // выходит за пределы массива,
                // не знаю, как избежать этого через сравнение аргументов, решил сделать через методы в hw02_1
                symbols[k] = symbols[i];
                System.out.print(symbols[k]);
                k++;
            }else{
                symbols[i+num] = symbols[i];
                System.out.print(symbols[i+num]);
            }
        }
    }
}
