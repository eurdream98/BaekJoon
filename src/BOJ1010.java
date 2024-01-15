import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        while(cnt<0){
            int west = Integer.parseInt(br.readLine());
            int east = Integer.parseInt(br.readLine());

            cnt--;
        }
    }
}
