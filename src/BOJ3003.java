import java.util.Arrays;
import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        int[] member = new int[6];
        for(int i = 0 ; i<member.length;i++){
            member[i]=sc.nextInt();
        }
        int[] result= new int[6];
        for(int i = 0 ; i<result.length;i++){
            result[i] = chess[i]-member[i];
            System.out.print(result[i]+" ");
        }


    }
}
