package ip.syssrc.loop;
import java.util.Scanner;
/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211040 - Muchtar Adam <muchtaradam2002@gmail.com>
 *
 */

public class Eyes {

    public static void main(String[] args) {

        Scanner t2 = new Scanner(System.in);

        int n = t2.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}