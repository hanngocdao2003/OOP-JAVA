package dethiGK;

public class ConsLoEmployee implements ILoEmployee {
	private Employee first;
	private ILoEmployee rest;

	public ConsLoEmployee(Employee first, ILoEmployee rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Employee getFirst() {
		return first;
	}

	public void setFirst(Employee first) {
		this.first = first;
	}

	public ILoEmployee getRest() {
		return rest;
	}

	public void setRest(ILoEmployee rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "ConsLoEmployee [first=" + first + ", rest=" + rest + "]\n";
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		if (first instanceof Staff) {
			return first.getSalaryRate() * 1000000;
		} else if (first instanceof Driver) {
			return first.getSalaryRate() * 900000;
		}
		return first.salary() + rest.salary();
	}

	@Override
	public int howManyEmployee() {
		// TODO Auto-generated method stub
		if(first instanceof Staff) {
			return 1 + rest.howManyEmployee();
		}
		return 0;
	}

	@Override
	public boolean isDrive(Vehicle v) {
		// TODO Auto-generated method stub
		return first instanceof Driver && rest.isDrive(v);
	}

	@Override
	public ILoEmployee getDrivers(Vehicle v) {
		 // Kiểm tra nếu nhân viên đầu tiên có thể lái phương tiện v
	    if (first instanceof Driver && ((Driver) first).isDrive(v)) {
	        // Thêm nhân viên này vào danh sách tài xế
	        return new ConsLoEmployee(first, rest.getDrivers(v));
	    } else {
	        // Bỏ qua nhân viên này và tiếp tục kiểm tra danh sách còn lại
	        return rest.getDrivers(v);
	    }
	}

}
