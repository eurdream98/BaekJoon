import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = Integer.parseInt(b);
        char c1 = b.charAt(0);
        char c2 = b.charAt(1);
        char c3 = b.charAt(2);

        int c4 = c1-'0';
        int c5 = c2-'0';
        int c6 = c3-'0';
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(c6);
        int r1 = a*c6;
        int r2 = a*c5;
        int r3 = a*c4;
        int r4 = a*c;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
