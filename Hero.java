package commandlineargsSystemproperties.automobile.twowheeler;

import commandlineargsSystemproperties.automobile.Vehicle;

public class Hero extends Vehicle{

	public String modelName() {
		// TODO Auto-generated method stub
		return "Model name : Hero";
	}

	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return "Registraion Number : KA10J 3456";
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "Owner name = Abhimanyu";
	}
	public int speed() {
		return 60;
	}
	public void radio() {
		System.out.println("Radio Facility");
	}

}
