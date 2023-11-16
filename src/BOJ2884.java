import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m>=45) {
            m = m - 45;
        } else if (m<45) {
            h = h-1;
            m = m - 45;
        }
        if(m<0){
            m=m+60;
        }
        if(h<0){
            h+=24;
        }


        System.out.println(h+" "+m);
    }

}
