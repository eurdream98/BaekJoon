import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int N = sc.nextInt();

        Integer[] arrA = new Integer[N];
        Integer[] arrB = new Integer[N];
        for(int i = 0 ; i< N ; i++ ) {
            arrA[i] = sc.nextInt();
        }
        for(int i = 0 ; i< N ; i++ ) {
            arrB[i] = sc.nextInt();
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB, Comparator.reverseOrder());
        for(int i = 0 ; i<N ; i++){
            result += arrA[i]*arrB[i];
        }

        System.out.println(result);
    }
}
