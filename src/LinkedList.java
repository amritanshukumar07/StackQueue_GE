public class LinkedList {
    Node head;
    public void push(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void append(int value){
        Node newNode= new Node(value);
        if(head==null){
            head= newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next=newNode;

        }
    }
    public void pop(){
        head=head.next;
    }
    public Node peak(){
        return head;
    }
}
