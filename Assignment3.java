package commandlineargsSystemproperties;

import commandlineargsSystemproperties.automobile.twowheeler.Hero;
import commandlineargsSystemproperties.automobile.twowheeler.Honda;

public class Assignment3 {
public static void main(String[] args) {
	Hero hero = new Hero();
	System.out.println(hero.modelName());
	System.out.println(hero.registrationNumber());
	System.out.println(hero.ownerName());
	System.out.println("Speed: "+hero.speed());
	hero.radio();
	Honda honda = new Honda();
	System.out.println(honda.modelName());
	System.out.println(honda.registrationNumber());
	System.out.println(honda.ownerName());
	System.out.println("Speed: "+honda.speed());
	honda.cdPlayer();
}
}
