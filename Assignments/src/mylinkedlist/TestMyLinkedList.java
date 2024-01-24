package mylinkedlist;

public class TestMyLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList ml=new MyLinkedList();
		
		ml.insert(ml, 0);
		ml.insert(ml, 1);
		ml.insert(ml, 2);
		ml.traverse(ml);
		ml.insert(ml, 3);
		ml.traverse(ml);
		ml.delete(ml, 3);
		ml.traverse(ml);
		
		 
         
		
	}

}
