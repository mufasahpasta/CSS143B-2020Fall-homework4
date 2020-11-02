package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);

        slideUnder(stack, temp);
    }
    public static void slideUnder(Stack<Integer> stack, int x)
    {
        if(stack.isEmpty())
        {
            stack.push(x);
            return;
        }
        else
        {
            int top = stack.pop();
            slideUnder(stack, x);
            stack.push(top);
        }
    }
}