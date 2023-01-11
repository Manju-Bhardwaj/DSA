package stacks;
 class Node {
     int data;
     Node next;

     public Node(int data) {
         this.data = data;
         next = null;
     }
 }
//implementing stack using linkedlist
public class UsingLinkedList {
    Node head;
    int size;
    public UsingLinkedList(){
        head=null;
        size=0;
    }
    public void push(int data){
        Node temp= new Node(data);
        temp.next=head;
        size++;
        head=temp;
    }

    public int pop(){
        if(head==null){
            System.out.println("stack is empty");
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }

    public int peek(){
        if(head==null){
            System.out.println("stack is empty");
        }
        return head.data;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
        return size;
    }
    public static void main(String[] args) {
        UsingLinkedList s= new UsingLinkedList();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
