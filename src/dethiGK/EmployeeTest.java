package dethiGK;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

	public void testConstructor() {
		Employee s1 = new Staff(101, "Le Nhan Minh", new Date(2, 8, 1994), 1.2, "Giao hang");
		Employee s2 = new Staff(102, "Ai Nguyen", new Date(1, 1, 1989), 1.5, "Ke toan");

		Vehicle v1 = new Vehicle(101, "Xe tai", 2020);
		Vehicle v2 = new Vehicle(102, "Xe khach", 2016);
		Vehicle v3 = new Vehicle(103, "Xe Bus", 2012);
		Vehicle v4 = new Vehicle(104, "Xe ban tai", 2010);

		IVehicle empty = new MTVehicle();

		IVehicle iv1 = new ConsVehicle(v1, new ConsVehicle(v2, new ConsVehicle(v4, empty)));
		Employee d1 = new Driver(201, "Ta Phap Quang", new Date(12, 5, 1989), 2.5, iv1);

		IVehicle iv2 = new ConsVehicle(v1, new ConsVehicle(v3, empty));
		Employee d2 = new Driver(202, "Thien Dinh", new Date(1, 9, 1989), 2.2, iv2);

		IVehicle iv3 = new ConsVehicle(v3, new ConsVehicle(v4, empty));
		Employee d3 = new Driver(203, "Tran Tuan Minh", new Date(8, 10, 1992), 2.0, iv3);

		ILoEmployee root = new ConsLoEmployee(s1, new ConsLoEmployee(s2,
				new ConsLoEmployee(d1, new ConsLoEmployee(d2, new ConsLoEmployee(d3, new MTLoEmployee())))));

		System.out.println(root);

		System.out.println(s1.salary());
		System.out.println(s2.salary());
		System.out.println(d1.salary());
		System.out.println(d2.salary());
		System.out.println(d3.salary());
		System.out.println(root.salary());
		System.out.println("-------------------------------");
		
		System.out.println(root.howManyEmployee());
		System.out.println("-------------------------------");
		
		System.out.println(d1.isDrive(v4));
		System.out.println(d2.isDrive(v4));
		System.out.println(d3.isDrive(v4));
		System.out.println("-------------------------------");
		
		System.out.println(root.getDrivers(v1));
		System.out.println("-------------------------------");

	}

}
