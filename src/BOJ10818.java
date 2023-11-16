import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i<N;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[0]+" "+a[N-1]);
    }
}
