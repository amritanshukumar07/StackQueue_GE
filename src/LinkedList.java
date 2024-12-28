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
}
