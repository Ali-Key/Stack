import java.util.Arrays;
import java.util.EmptyStackException;

public class StackArray<T>{
    //variables
    private final static int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;
    //constructors
    StackArray(int initialCapacity){
        top = 0;
        stack = (T[]) new Object[initialCapacity];
    }
    StackArray(){
        this(DEFAULT_CAPACITY);
    }
    //methods

    int size(){
        return top;
    }
    private void expandCapacity(){

        stack = Arrays.copyOf(stack , stack.length*2);
    }
    void push(T element){
        if(size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }

    Boolean isEmpty(){
        return  top == 0;
    }

    T pop () throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        top--;
        T out = stack[top];
        stack[top] = null;
        return out;
    }

    T peek() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return stack[top-1];
    }
}
