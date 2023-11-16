import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            str.append(ch);
        }

        int[] freq = new int[26]; // 알파벳 개수 (A ~ Z)
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A']++;
            }
        }

        int maxFreq = 0;
        char mostFrequentChar = ' ';
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (freq[ch - 'A'] > maxFreq) {
                maxFreq = freq[ch - 'A'];
                mostFrequentChar = ch;
            }
        }

        System.out.println(mostFrequentChar);
    }
}
