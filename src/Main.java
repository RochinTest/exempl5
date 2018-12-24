import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int m = sc.nextInt();

            int k = m / 100;
            //System.out.println(k);
            int n = (m - 100 * k) / 10;
            //System.out.println(n);
            int l = ((m - 100 * k) - n * 10);
            // System.out.println(l);
            {
                int s = k + n + l;
                //System.out.println(s);
                int a = 0;
                int d = 1;
                int i = 1;
                int c = 1;
                // for (; i <=k; ++i) { c=1; a=0;
                // for (; c <= s; ++c) {
                d = s % 2;
                if (d == 0) //a = a + 1;
                    // }
                    //  if (a >= 2)
                    // System.out.print(" "+ i );

                    // if (m + n == l + k)
                    System.out.println("true");
                else System.out.println("false");
            }
        }
    }
}


