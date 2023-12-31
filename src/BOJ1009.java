import java.util.Scanner;

public class BOJ1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        while(cnt>0){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            long multiply=1;
            for(int i = 0 ; i< num2 ; i ++){
                multiply = multiply*num1%10;
            }
            if(multiply==0){
                multiply=10;
            }
            System.out.println(multiply);
            cnt--;
        }
    }
}
