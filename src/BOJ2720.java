import java.util.Scanner;

public class BOJ2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        for(int i = 0 ; i<w;i++){
            int k = sc.nextInt();
            int c1 = 0;
            int c2 = 0;
            int c3 = 0;
            int c4 = 0;
            while(true){
                if(k==0){
                    break;
                }

            if(k>=25){
                c1 += k/25;
                k = k%25;

            }else if(k>=10){
                c2 += k/10;
                k = k%10;

            }else if(k>=5){
                c3 += k/5;
                k = k%5;

            }else if(k>=1){
                c4 = k/1;
                k = k%1;

            }

            }
            System.out.println(c1+" "+c2+" "+c3+" "+c4);
        }

        }
    }

