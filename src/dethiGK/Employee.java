package dethiGK;

public abstract class Employee {
	private int eid;
	private String name;
	private Date birthday;
	private double salaryRate;

	public Employee(int eid, String name, Date birthday, double salaryRate) {
		super();
		this.eid = eid;
		this.name = name;
		this.birthday = birthday;
		this.salaryRate = salaryRate;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public double getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}

	@Override
	public String toString() {
		return "EID: " + eid + "\nName: " + name + "\nBirthday: " + birthday + "\nSalary Rate: " + salaryRate;
	}

	abstract double salary();

	abstract boolean isDrive(Vehicle v);

}
