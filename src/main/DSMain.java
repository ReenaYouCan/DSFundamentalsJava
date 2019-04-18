package main;

import employeePojo.Employee;
import linkedList.DoublyLinkedList;
import linkedList.SinglyLinkedList;

public class DSMain {

	public static void main(String[] args) {
		
		Employee employee1= new Employee("Soham", "Nachare", 8);
		Employee employee2= new Employee("Ameya", "Rote", 31);
		Employee employee3= new Employee("Shourya", "Rote", 1);
		Employee employee4= new Employee("Shivam", "Nachare", 2);
		
		// Singly LinkedList Operations 
//		SinglyLinkedList list = new SinglyLinkedList();
//		
//		System.out.println(list.isEmpty());
//		
//		list.addToFront(employee1);
//		list.addToFront(employee2);
//		list.addToFront(employee3);
//		list.addToFront(employee4);
//		
//		list.printList();
//		System.out.println();
//		System.out.println(list.getSize());
//		
//		list.removeFromFront();
//		System.out.println(list.getSize());
//		list.printList();

		// Doubly LinkedList Operations
		
		DoublyLinkedList dList = new DoublyLinkedList();
		
		dList.addToFront(employee1);
		dList.addToFront(employee2);
		dList.addToFront(employee3);
		dList.addToFront(employee4);
		
		dList.printList();
		
	}

}
