package dethiGK;

public interface ILoEmployee {
	// tao interface laf list cuar toan bo nhan vien trong cong ty van tai
	public double salary();

	public int howManyEmployee();

	public boolean isDrive(Vehicle v);

	public ILoEmployee getDrivers(Vehicle v);
}
