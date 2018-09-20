import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string");
        String str = sc.nextLine();
        char[] symblos = str.toCharArray();
        for (int i = 0; i < symblos.length; i++) {
            if((symblos[i] >= 48 && symblos[i] <= 57)){
                symblos[i] = '*';
                System.out.print(symblos[i]);
            }else{
                System.out.print(symblos[i]);
            }
        }
    }
}
