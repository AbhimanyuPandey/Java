package commandlineargsSystemproperties.automobile.twowheeler;

import commandlineargsSystemproperties.automobile.Vehicle;

public class Honda extends Vehicle{

	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		return "Nodel name : Honda";
	}

	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return "Registration number: KA10KS 4567";
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "Owner name = Abhishek";
	}
	public int speed() {
		return 70;
	}
	public void cdPlayer() {
		System.out.println("CD Player Facility");
	}


}
