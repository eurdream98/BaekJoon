import java.util.Scanner;

public class BOJ5585
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1000-sc.nextInt();
        int cnt = 0;
        while(N>=1){

            cnt+=N/500;
            N=N%500;

            cnt+=N/100;
            N=N%100;

            cnt+=N/50;
            N=N%50;

            cnt+=N/10;
            N=N%10;

            cnt+=N/5;
            N=N%5;

            cnt+=N/1;
            N=N%1;
        }
        System.out.println(cnt);
    }
}
