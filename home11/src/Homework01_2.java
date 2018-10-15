import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Homework01_2 {
    public static void main(String[] args) throws FileNotFoundException {
        int l = arrlenght();
        sort(l);
    }

    static int arrlenght() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("instr.txt"));
        int k = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            k++;
           // System.out.println("K"+k);
        }
        return k;
    }
    static void sort(int k) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("instr.txt"));
        PrintWriter pw = new PrintWriter(new File("outstr.txt"));
        String[] arrstr = new String[k];
        while (sc.hasNextLine()) {
            //System.out.println("1");
            for (int i = 0; i < k; i++) {
                String str = sc.nextLine();
                arrstr[i] = str;
            }
        }
        Arrays.sort(arrstr);
        pw.println("Homework01\n");
        for (int i = 0; i < k; i++) {
            //System.out.println("2");
            pw.println("\t"+arrstr[i]);
        }
        pw.close();
    }
}