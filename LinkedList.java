import java.util.*;
class LinkedList
{
  
  static Node head;
  static class Node
  {

  	int data;
  	Node next;
  
  Node(int item)
  {
  	data=item;
  	next=null;
  }

  }

  static Node recurReverse(Node node)
  {
  

  	if(node.next==null)
  	{
  		return node;
  	}

  	Node header=recurReverse(node.next);
  	node.next.next=node;
  	node.next=null;

    return header;

  }
  
   static void display(Node head)
   {
       
       Node ptr=head;
       while(ptr.next!=null)
       {
       	System.out.print(ptr.data+"->");
        ptr=ptr.next;
       }
       System.out.println(ptr.data+"->NULL"); 
       
   }

  public static void main(String[] args)
  {
    
    
    LinkedList obj=new LinkedList();
    obj.head=new Node(1);
    obj.head.next=new Node(2);
    obj.head.next.next=new Node(3);
    System.out.println("Orginal List");
    obj.display(head);
    System.out.println("Reversed List");
    obj.head=obj.recurReverse(obj.head);
    obj.display(obj.head);

  }


}