package linkedList;

import employeePojo.Employee;
import node.EmployeeNode;

public class DoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	
	private int size = 0;
	
	
	public boolean isEmpty()
	{
		return head == null;
	}
	//Add Node to linkedList
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);	
		//if list is empty then add new node to tail
		if(head==null)
		{
			tail = node;
		}
		else
		{
			head.setPrevious(node);
		}
		head = node;
		size++;
		}
	
	public void addToEnd(Employee employee)
	{
		EmployeeNode node = new EmployeeNode(employee);
		if(tail==null)
		{
			tail = node;
		} else
		{
			tail.setEmployee(employee);
			node.setPrevious(tail);
		}
	}
	
	// Print nodes from linked list
	public void printList()
	{
		EmployeeNode current = head;
		System.out.print("HEAD ->");
		while(current!=null)
		{
		System.out.print(current);
		System.out.print("<->");
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
