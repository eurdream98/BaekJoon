import java.util.Arrays;
import java.util.Scanner;

public class BOJ11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine();
        String[] a = new String[cnt];
        int[] b = new int[cnt];
        for(int i = 0 ; i<cnt ; i++){
            a[i]=sc.nextLine();
            int w = a[i].indexOf(" ");
            int c= Integer.parseInt(a[i].substring(0,w));
            int d= Integer.parseInt(a[i].substring(w+1));
            b[i]=c+d;
        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
        for(int i = 0 ; i<cnt;i++) {
            System.out.println("Case "+"#"+(i+1)+": "+b[i]);
        }
    }
}
