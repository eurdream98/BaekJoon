

import java.util.Scanner;

public class BOJ10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String x = sc.nextLine();
            if (x.equals("0 0")) {
                break;
            }
            int w = x.indexOf(" ");
            int a = Integer.parseInt(x.substring(0, w));
            int b = Integer.parseInt(x.substring(w + 1));
            System.out.println(a + b);

        }
    }

}