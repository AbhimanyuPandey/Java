package OOPConcepts;


public abstract class Instrument {
public abstract void  play();
public static void main(String[] args) {
	Instrument[] arr = new Instrument[10];
	arr[0] = new Piano();
	arr[1] = new Flute();
	arr[2] = new Guitar();
	arr[3] = new Flute();
	arr[4] = new Piano();
	arr[5] = new Flute();
	arr[6] = new Guitar();
	arr[7] = new Guitar();
	arr[8] = new Piano();
	arr[9] = new Flute();
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] instanceof Piano) {
			System.out.println("Piano object is at index: "+i);
		}
		else if(arr[i] instanceof Flute) {
			System.out.println("Flute object is at index: "+i);
			
		}
		else if(arr[i] instanceof Guitar) {
			System.out.println("Guitar object is at index: "+i);
		}
		arr[i].play();
		
	}
	}
}
