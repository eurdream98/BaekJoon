import java.util.Scanner;

public class BOJ11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
//        sc.nextLine();
        for(int i = 0 ; i<cnt;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+(i+1)+": "+a+" "+"+ "+b+" = "+(a+b));
        }
    }
}
