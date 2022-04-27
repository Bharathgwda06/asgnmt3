package today;

;

public class Employee {
	int id;
	String firstname;
	String lastname;
	int salary;
	
	Employee(int a, String b , String c , int d){
		this.id=a;
		this.firstname=b;
		this.lastname=c;
		this.salary=d;
	}
	
	int getID(){
		return id;
	}
	
	String getFirstName() {
		return firstname;
	}
	
	String getLastName() {
		return lastname;
	}
	
	int getSalary() {
		return salary;
	}
	
	void setSalary( int s) {
		salary = s;
	}
	int getAnnualSalary() {
		return salary*12;
	}
    int raiseSalary(int perc) {
    	int x= salary*10/100;
    	salary+=x;
    	return salary;
    	
    }
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ "]";
	}

	public static void main(String[] args) {
		
		
		
		
		

	}

}
