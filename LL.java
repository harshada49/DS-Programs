
//linkedList implementation from scratch 
public class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null; 
        }
    }
    //add - first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode; 
    }
    // add - last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
         Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    //delete - first
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        head = head.next;
    }

    //delete - last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        
        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("H");
        list.addFirst("a");
        list.addLast("d");
        list.printList();

        list.deleteLast();
        list.printList();


    }
}