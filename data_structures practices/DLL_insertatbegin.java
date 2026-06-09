import java.util.*;
public class DLL_insertatbegin{
    public static void main (String[] args) {
  {
    doublylinkedlist dll = new doublylinkedlist();
    dll.insertatbegin(10);
    dll.insertatbegin(20);
    System.out.println(dll.head.data);
    System.out.println(dll.tail.data+" "+dll.tail.prev);
  }
}
}
class Node{
  int data;
  Node prev;
  Node next;
  Node(int data){
    this.data=data;
    this.prev=null;
    this.next=null;
  }
}
class doublylinkedlist{
  Node head=null;
  Node tail=null;
  void insertatbegin(int data){
    Node n = new Node(data);
    if(head==null){
      head=tail=n;   
    }
    else{
      head.prev=n;
      n.next=head;
      head=n;
    }
    
  }
}