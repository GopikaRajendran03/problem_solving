import java.util.*;
public class DLL_insertatend{
    public static void main (String[] args) {
  {
    doublylinkedlist dll = new doublylinkedlist();
    dll.insertatend(10);
    dll.insertatend(20);
    dll.insertatend(30);
    System.out.println(dll.head.data+" "+dll.tail.prev.prev.prev);
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
  void insertatend(int data){
    Node n = new Node(data);
    if(head==null){
      head=tail=n;
    }
    else{
      tail.next=n;
      n.prev=tail;
      tail=n;
    }
  }
}