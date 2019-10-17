import java.util.Stack;

class Queue{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
         while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        stack1.push(node);

    }
    
    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}