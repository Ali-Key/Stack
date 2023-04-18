import java.util.Stack;
public class reversebuffer {
    public String reverseBuffer(String input) {
        Stack<Character> stack = new Stack<>();
        for (char i : input.toCharArray()) {
            stack.push(i);
        }
        StringBuffer reverse = new StringBuffer();
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
}
