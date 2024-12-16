package dethiGK;

public class ConsVehicle implements IVehicle {
	private Vehicle first;
	private IVehicle rest;

	public ConsVehicle(Vehicle first, IVehicle rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Vehicle getFirst() {
		return first;
	}

	public void setFirst(Vehicle first) {
		this.first = first;
	}

	public IVehicle getRest() {
		return rest;
	}

	public void setRest(IVehicle rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "ConsVehicle [first=" + first.toString() + ", rest=" + rest.toString() + "]";
	}

	@Override
	public boolean contains(Vehicle v) {
		// TODO Auto-generated method stub
		if (first.equals(v)) {
			return true;
		}
		return rest.contains(v);
	}

}
