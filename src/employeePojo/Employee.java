package employeePojo;

public class Employee {

	private String firstName;
	private String lastfirstName;
	private int id;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastfirstName() {
		return lastfirstName;
	}
	public void setLastfirstName(String lastfirstName) {
		this.lastfirstName = lastfirstName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(String firstName, String lastfirstName, int id) {
		super();
		this.firstName = firstName;
		this.lastfirstName = lastfirstName;
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastfirstName == null) ? 0 : lastfirstName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastfirstName == null) {
			if (other.lastfirstName != null)
				return false;
		} else if (!lastfirstName.equals(other.lastfirstName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastfirstName=" + lastfirstName + ", id=" + id + "]";
	}
	
	
	
}
