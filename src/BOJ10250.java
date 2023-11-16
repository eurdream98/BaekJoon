import java.util.Scanner;

public class BOJ10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Result;
        int T = sc.nextInt();
        while (T-- > 0) {

            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();


            if(N<=H) {
                Result = N*100+1;
                System.out.println(Result);

            } else if (N>H) {
                if(N%H==0){
                    Result = H*100+(N/H);
                    System.out.println(Result);
                }else{
                    Result = (N % H) * 100 + (N / H) + 1;
                    System.out.println(Result);
                }


            }

        }

    }
}
