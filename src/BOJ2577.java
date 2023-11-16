import java.util.Arrays;
import java.util.Scanner;

public class BOJ2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a*b*c;
        int[] cnt = new int[10];
        for(int i = 0 ; i<Integer.toString(d).length(); i++){
            for(int k = 0 ; k<10 ; k++) {
                if (Integer.toString(d).charAt(i)-'0' == k) {
                    cnt[k]++;

                }

            }


        }
        for(int i = 0 ; i<10;i++){
            System.out.println(cnt[i]);
        }

    }
}
