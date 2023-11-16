import java.util.Scanner;

public class BOJ1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int result=0;
        int cnt = 0;
        result=Integer.parseInt(x);
        if(x.length()==1){
            x="0"+x;
        }

        while(true){
            int a = x.charAt(0)-'0';
            int b = x.charAt(1)-'0';
            String c = Integer.toString((a+b));
            x = x.charAt(1)+Character.toString(c.charAt(c.length()-1));
            int f = Integer.parseInt(x);

            cnt++;
            if(result==f){
                break;
            }

        }
        System.out.println(cnt);
    }
}
