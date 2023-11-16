import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        int[] num = new int[(int)N];
        for(int i =0 ; i<N;i++){
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
        for(int i = 0 ; i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
