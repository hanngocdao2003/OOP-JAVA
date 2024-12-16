package dethiGK;

public class Staff extends Employee {
	private String department;

	public Staff(int eid, String name, Date birthday, double salaryRate, String department) {
		super(eid, name, birthday, salaryRate);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString() + "\nStaff: Department: " + department + "\n-------";
	}

	@Override
	double salary() {
		// TODO Auto-generated method stub
		return super.getSalaryRate() * 1000000;
	}

	@Override
	boolean isDrive(Vehicle v) {
		// TODO Auto-generated method stub
		return false;
	}
}
