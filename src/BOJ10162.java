import java.util.Scanner;

public class BOJ10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        while(true){
        if(T<10){
            break;
        }
            if(T>=300){
            cnt1 += T/300;
            T = T%300;
        }else if(T>=60){
            cnt2 += T/60;
            T = T%60;
        }else if(T>=10){
            cnt3 += T/10;
            T = T%10;
        }
        }
        if(T==0){
            System.out.println(cnt1+" "+cnt2+" "+cnt3);
//            System.out.println(T);
        }else{
            System.out.println(-1);
        }

    }
}
