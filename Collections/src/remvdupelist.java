
import java.util.*;

public class remvdupelist {
	
	private ListNode head;
	
	private class ListNode{
		private int data;
		private ListNode next;
			
	public ListNode(int data)
	{
		this.data= data;
		this.next=null;
	}
	}
	
		public void insertAtBeginning(int data)
		{
			ListNode newNode=new ListNode(data);
			newNode.next=head;
			head= newNode;
				
		}
		
		public void printlinklist()
		{
			if(head==null)
			{
				System.out.println("null");
			}
			ListNode current=head;
			while(null != current){
				System.out.print(current.data + "-->");
				current=current.next;
			}
	
		}
		
		
		public void removeduplicates(){
			if(head == null){
				return;
			}
			ListNode current=head;
			while(current!= null &&  current.next !=null){ 
			if(current.data==current.next.data){
				current.next=current.next.next;
				
			}
			else{
				current=current.next;
			}
			}
			
			}
		

	public static void main(String[] args)
	{
		remvdupelist l1=new remvdupelist();
	l1.insertAtBeginning(3);
		l1.insertAtBeginning(3);
		
		l1.insertAtBeginning(3);;
		l1.insertAtBeginning(2);
		l1.insertAtBeginning(1);
		l1.insertAtBeginning(1);
		l1.printlinklist();	
		System.out.println(" ");
	l1.removeduplicates();
	System.out.println(" ");
	l1.printlinklist();
	}
}
