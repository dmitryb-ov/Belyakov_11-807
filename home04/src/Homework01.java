/*import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write
        System.out.println("Write first arr");
        String vvod = sc.next();
        System.out.println("Write second arr");
        String vvod_dop = sc.next();
        //Arr Char
        char[] symbols = vvod.toCharArray();
        char[] dop_symbols = vvod_dop.toCharArray();
        //simple var
        //int n = symbols.length;
        //int b = dop_symbols.length;
        int k = 0;
        int out = 0;
        boolean test = true;
        //
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < dop_symbols.length && test; j++) {
                if(symbols[i] != dop_symbols[j-k]){
                    k++;
                }else if(symbols[i] == dop_symbols[j-k]){
                    test = false;
                    while(symbols[i+1] == dop_symbols[j-k+1]){
                        //test = false;
                        out = i;
                    }
                }
            }
            System.out.println(i);
        }
    }
}
*/