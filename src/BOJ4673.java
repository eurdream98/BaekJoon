import java.lang.reflect.Array;
import java.util.ArrayList;

public class BOJ4673 {
    public static void main(String[] args) {
        boolean[] used = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int result = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                result += String.valueOf(i).charAt(j) - '0';
            }
            result += i;
            if(result<=10000){
            used[result]=true;
            }
        }
        for(int i = 1;i<10000;i++){
        if(!used[i]){
            System.out.println(i);
        }}
    }

    }
