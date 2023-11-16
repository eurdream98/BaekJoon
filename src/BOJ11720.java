import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int sum = 0;
        String x = sc.next();
        for(int i = 0; i<x.length();i++) {
            sum+=x.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
