package dethiGK;

public class Vehicle {
	private int iid;
	private String name;
	private int year;

	public Vehicle(int iid, String name, int year) {
		super();
		this.iid = iid;
		this.name = name;
		this.year = year;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Vehicle: IID: " + iid + "\tName: " + name + "\tYear: " + year + "\n-------";
	}

}
