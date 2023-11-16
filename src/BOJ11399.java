import java.util.Arrays;
import java.util.Scanner;

public class BOJ11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int littlesum = 0;
        int[] people = new int[N];
        for(int i = 0; i<N;i++){
            people[i]=sc.nextInt();
        }
        Arrays.sort(people);
        for(int i = 0; i<N ; i++){
            littlesum=0;
            for(int j = 0 ; j<i+1;j++){
                littlesum += people[j];
            }
            sum+=littlesum;
        }
        System.out.println(sum);





    }
}
