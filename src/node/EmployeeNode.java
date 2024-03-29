package node;

import employeePojo.Employee;

public class EmployeeNode {
	private Employee employee;
	private EmployeeNode next;
	private EmployeeNode previous;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	public EmployeeNode getNext() {
		return next;
	}
	@Override
	public String toString() {
		return employee.toString();
	}
	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
	}
	public EmployeeNode getPrevious() {
		return previous;
	}
	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}
	
}
