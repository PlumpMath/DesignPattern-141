package pattern.structural.templet.concrete;

import pattern.structural.templet.state.Direction;
import pattern.structural.templet.state.Door;
import pattern.structural.templet.templet.Motor;

public class HyundaiMotor extends Motor {

	public HyundaiMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("HyundaioMotor : "+direction);
	}
}
