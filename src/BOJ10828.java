import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BOJ10828 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- >= 0) {
            String str = sc.nextLine();
//            if(sc.next()==)
            if(str.equals("top")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.peek());
                }
            }
            if(str.contains("push")){
                String[] strarr=str.split(" ");
                String number =strarr[1];
                stack.push(Integer.parseInt(number));
            }
            if(str.equals("size")){
                System.out.println(stack.size());
            }
            if(str.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.pop());
                }
            }
            if(str.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
        }
    }
}
