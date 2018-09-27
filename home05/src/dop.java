import java.util.Scanner;

public class dop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //
        String str = sc.nextLine(); //создаем ввод строки
        char[] symbols = str.toCharArray(); //создаем массив из строки
        int k = 0;
        for (int i = 0; i < symbols.length; i++) { //цикл от 0 до длины массива строки
            if (symbols[i] > '0' && symbols[i] < '9'){ //если встречается цифра, плюсуем k
                k++;
            }
        }
        if (k > 0){
            System.out.println("Это переменная");
        }else{
            System.out.println("Это строка");
        }
    }
}
