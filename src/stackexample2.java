import java.util.Stack;
public class stackexample2 {
    public static void main(String[] args) {
        Stack<Integer>stack1=new Stack<Integer>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        System.out.println("The oroginal Stack" + stack1.toString());
        int top=stack1.peek();
        System.out.println("The Top Element:" + top);
        System.out.println("Stack After Accessing Top Element:" + stack1.toString());
        int out=stack1.pop();
        System.out.println("Removed Element:" + out);
        System.out.println("Stack After Pop Operation:" + stack1.toString());
        System.out.println("The size of the Stack:" + stack1.size());

    }
}
