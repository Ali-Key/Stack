import java.util.Stack;
public class reverser {
    public String reverse(String input) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++)
            stack.push(input.charAt(i));
        String reversed = "";
        while (!stack.isEmpty())
        {
            reversed += stack.pop();
        }
        return reversed;
    }

}