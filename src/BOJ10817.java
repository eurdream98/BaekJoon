import java.util.Arrays;
import java.util.Scanner;

public class BOJ10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String b[]=a.split(" ");
//        System.out.println(Arrays.toString(b));
        int c[] = new int[b.length];
        for(int i = 0 ; i<b.length;i++){
            int d = Integer.parseInt(b[i]);
            c[i]=d;
        }
//        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(c[1]);
    }
}
