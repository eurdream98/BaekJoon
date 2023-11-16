import java.util.Arrays;
import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        float[] a = new float[cnt];
        float[] b = new float[cnt];
        float sum =0;
        for(int i = 0 ; i<cnt ;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0 ; i<cnt ; i++){
            b[i]=a[i]/a[cnt-1]*100;
            sum+=b[i];
        }
        System.out.println(sum/cnt);

    }
}
