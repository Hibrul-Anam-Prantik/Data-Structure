package Stack;

import java.util.Stack;

public class StackUse
{
    public static void main(String[] args) {
        Stack<Integer>  s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(4);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
