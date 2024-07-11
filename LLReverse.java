//reverse a list using iterative approach
public class LLReverse {
    Node head;
    class Node{
     String data;
     Node next;

        Node(String data){
        this.data = data;
        this.next = null;

     }
  } 
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

   //reverse list
   public void reverseIterate(){
    if(head == null || head.next == null){
        return;
    }

    Node prevNode = head;
    Node currNode = head.next;
    while(currNode != null){
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        //update
        prevNode = currNode;
        currNode = nextNode;
    }
    head.next = null;
    head = prevNode;
   }
  public static void main(String[] args) {
    LLReverse list = new LLReverse();
    list.addLast("a");
    list.addLast("b");
    list.addLast("c");
    list.addLast("d");;
    list.printList();
    list.reverseIterate();
    list.printList();


  }

    
}
