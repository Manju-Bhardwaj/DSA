package stacks;

public class StackUsingArray {
    int a[];
     int top;
     int capacity;
    public StackUsingArray(int capacity){
        this.capacity=capacity;
        top=-1;
        a=new int[capacity];
    }
    public  void push(int data){
        //check for overflow
        if(top==capacity-1){
            System.out.println("stack overflow");
        }
        top++;
        a[top]=data;
    }

    public int pop(){
        //check for underflow
        if(top==-1){
            System.out.println("stack underflow");
        }
        int res=a[top];
        top--;
        return res;
    }

    public int peek(){
        if(top==-1){
            System.out.println("stack underflow");

        }
        return a[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public static void main(String[] args) {
    StackUsingArray stack= new StackUsingArray(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
