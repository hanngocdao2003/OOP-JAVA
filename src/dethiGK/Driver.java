package dethiGK;

public class Driver extends Employee {
	private IVehicle listVehicle;

	public Driver(int eid, String name, Date birthday, double salaryRate, IVehicle listVehicle) {
		super(eid, name, birthday, salaryRate);
		this.listVehicle = listVehicle;
	}

	public IVehicle getListVehicle() {
		return listVehicle;
	}

	public void setListVehicle(IVehicle listVehicle) {
		this.listVehicle = listVehicle;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDriver: listVehicle: " + listVehicle + "\n-------";
	}

	@Override
	double salary() {
		// TODO Auto-generated method stub
		return super.getSalaryRate() * 900000;
	}

	@Override
	boolean isDrive(Vehicle v) {
		// TODO Auto-generated method stub
		return listVehicle.contains(v);
	}

}
