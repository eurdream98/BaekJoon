import java.util.Scanner;

public class BOJ1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin = sc.next();
        //num을 30,40+50,60+70으로 나눴다
        String[] num = origin.split("-");

        for(int i = 0 ; i<num.length;i++) {
            if (num[i].contains("+")){
                String[] num2 = num[i].split("\\+");
                int sum=0;
                for(int j = 0 ; j<num2.length;j++) {
                    sum += Integer.parseInt(num2[j]);
                }
                num[i]= String.valueOf(sum);
            }
        }
        int result = Integer.parseInt(num[0]);
        for(int i = 1 ; i<num.length;i++){
            result -= Integer.parseInt(num[i]);
        }

        System.out.println(result);
    }
}
