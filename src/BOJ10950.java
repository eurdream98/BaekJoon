import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i<a;i++){
            String x = sc.nextLine();
            int w = x.indexOf(" ");
            int e= Integer.parseInt(x.substring(0,w));
            int f= Integer.parseInt(x.substring(w+1));
            System.out.println(e+f);
        }
//        sc.close();
    }
}
