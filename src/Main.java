//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 9 stack and Queue Program");
 //       LinkedList queue= new LinkedList();
//        queue.append(70);
//        queue.append(30);
//        queue.append(56);
//        System.out.println("The stack is: ");
//        queue.display();
//        queue.pop();
//
//        System.out.println("Queue after pop");
//
//        queue.display();
//        System.out.println("Peak: "+queue.peak().data);
        LinkedList queue = new LinkedList();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Queue after Enqueue of 3 elements:");
        queue.printQueue();
        queue.dequeue();
        System.out.println("Queue after one Dequeue operation:");
        queue.printQueue();
    }
}