import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) throws FileNotFoundException {
        //firstfilelen();
        //secondfilelen();
        inonefile();
        finalfile(firstfilelen() + secondfilelen());
    }

    static void inonefile() throws FileNotFoundException {
        Scanner firstsc = new Scanner(new File("firstfile.txt"));
        Scanner secsc = new Scanner(new File("secondfile.txt"));
        PrintWriter pw = new PrintWriter(new File("slout.txt"));
        while (firstsc.hasNextInt() && secsc.hasNextInt()) {
            int one = firstsc.nextInt();
            int two = secsc.nextInt();
            if (one == two) {
                pw.println(one);
            }
            if (one > two) {
                pw.println(two);
                //int oneBuf = one;
                pw.println(one);
            } else {
                pw.println(one);
                //int twoBuf = two;
                pw.println(two);
            }
        }
        while (firstsc.hasNextInt()) {
            int one1 = firstsc.nextInt();
            pw.println(one1);
        }
        while (secsc.hasNextInt()) {
            int two1 = secsc.nextInt();
            pw.println(two1);
        }
        pw.flush();
    }

    static void finalfile(int k3) throws FileNotFoundException {
        Scanner fin = new Scanner(new File("slout.txt"));
        int[] arr = new int[k3];
        //int d = 0;
        while (fin.hasNextInt()) {
            System.out.println("21");
            for (int i = 0; i < k3; i++) {
                //int s = fin.nextInt();
                arr[i] = fin.nextInt();
            }
        }
        PrintWriter pw = new PrintWriter(new File("slout.txt"));
        Arrays.sort(arr);
        for (int i = 0; i < k3; i++) {
            //System.out.println("222");
            pw.println(arr[i]);
        }
        pw.close();
    }

    static int firstfilelen() throws FileNotFoundException {
        Scanner firstsc = new Scanner(new File("firstfile.txt"));
        int k1 = 0;
        while (firstsc.hasNextInt()) {
            int onek = firstsc.nextInt();
            k1++;
        }
        return k1;
    }

    static int secondfilelen() throws FileNotFoundException {
        Scanner secsc = new Scanner(new File("secondfile.txt"));
        int k2 = 0;
        while (secsc.hasNextInt()) {
            int twok = secsc.nextInt();
            k2++;
        }
        return k2;
    }
}
