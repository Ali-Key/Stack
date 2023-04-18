public class ArrayStack1 {
    public static void main(String[] args) {


        StackArray<Integer> ArrayStack1=new StackArray<Integer>();
        ArrayStack1.push(10);
        ArrayStack1.push(20);
        ArrayStack1.push(30);
        ArrayStack1.push(40);
        System.out.println("The push of the Stack: " + ArrayStack1.size());
        int top= ArrayStack1.pop();
        System.out.println("The top the stack : " + top);
        int out= ArrayStack1.peek();
        System.out.println("the outer of the stack :(peek) :" + out);
        System.out.println("the size of the stack :(peek) :" + ArrayStack1.size());
        System.out.println("The size of the Stack :" + ArrayStack1.size());
        System.out.println("Iam Ali Omar");
    }
}