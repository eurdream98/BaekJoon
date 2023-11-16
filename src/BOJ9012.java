//package day04_study;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        for(int i = 0; i<cnt ; i++) {
            Stack<String> st = new Stack<>();
            String a = sc.next();
            String[] b= a.split("");
            for(int j = 0; j<b.length;j++) {
                if(b[j].equals("(")) {
                    st.add(b[j]);
                }else {
                    if(st.isEmpty()) {
                        st.add(b[j]);
                        break;
                    }else {
                        st.pop();
                    }
                }

            }
            if(st.isEmpty()) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}
