import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ11047 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = 0;
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//        int[] arrays = new int[N];
//        for(int i = 0 ; i < N ; i++){
//            arrays[i]=sc.nextInt();
//
//        }
//     for(int i = N-1; i>=0 ; i--) {
//         if (K > arrays[i]) {
//             int remainder = K % arrays[i];
//             cnt += K / arrays[i];
//             K=remainder;
//         }
//     }
//        System.out.println(cnt);
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] coins = new int[N]; // 각 동전의 가치를 저장할 배열

        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt(); // 각 동전의 가치 입력
        }

        // 큰 가치의 동전부터 사용하여 K원을 만들기
        for (int i = N - 1; i >= 0; i--) {
            if (K >= coins[i]) {
                int numCoins = K / coins[i]; // 해당 가치의 동전으로 만들 수 있는 개수
                cnt += numCoins; // 사용한 동전 개수 누적
                K %= coins[i]; // 남은 금액 갱신
            }
        }

        System.out.println(cnt);

    }
}
