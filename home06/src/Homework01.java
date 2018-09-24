import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"abcdre", "fgy", "567g", "gg", "eroiyotyt"};
        liner(str);
        System.out.println(Arrays.asList(str));
    }

    static void liner(String[] str) {
        for (int i = str.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(str[j].length() > str[j+1].length()){
                    String x = str[j];
                    str[j] = str[j+1];
                    str[j+1] = x;
                }
            }
        }
    }
}
