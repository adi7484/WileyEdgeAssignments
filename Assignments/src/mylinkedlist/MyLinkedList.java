package mylinkedlist;



public class MyLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}

	public MyLinkedList insert(MyLinkedList list,int data) {
		Node newNode=new Node(data);
		newNode.next=null;
		
		if(list.head==null) {
			list.head=newNode;
		}else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		return list;
	}
	
	public  MyLinkedList delete(MyLinkedList list,int key) {
		Node current=list.head;
		Node prev=null;
		
		if(current !=null && current.data==key) {
			list.head=current.next;
			return list;
		}
		
		while(current!=null && current.data!=key) {
			prev=current;
			current=current.next;
		}
		
		if(current!=null) {//deleted the node
			prev.next=current.next;
			System.out.println(key + " found and deleted");
		}
		 
		return list;	
	}
	
	public  void traverse(MyLinkedList list) {
		Node current=list.head;
		System.out.print("My LinkedList: ");
		
		while(current !=null) {
			
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}

	
}	


