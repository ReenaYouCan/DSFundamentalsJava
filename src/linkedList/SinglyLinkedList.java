package linkedList;

import employeePojo.Employee;
import node.EmployeeNode;

public class SinglyLinkedList {

	private EmployeeNode head;
	private int size = 0;
	
	
	public boolean isEmpty()
	{
		return head == null;
	}
	//Add Node to linkedList
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);	
		head = node;
		size++;
		}
	
	// Print nodes from linked list
	public void printList()
	{
		EmployeeNode current = head;
		System.out.print("HEAD ->");
		while(current!=null)
		{
		System.out.print(current);
		System.out.print("->");
		current = current.getNext();
		}
		System.out.print("null");
	}
	//Remove Node from linkedList

	public EmployeeNode removeFromFront() {
		
		if(isEmpty())
		{
			return null;
		}
		EmployeeNode removeNode = head;
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}
	
	//Get the size of list 
	public int getSize() {
		return size;
	}
}
