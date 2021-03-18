
public class Parrot extends Bird {

	public void talk(){
		
		System.out.println("Parrot imitates people's words");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parrot parrot1 = new Parrot();
		
		System.out.println(parrot1.color);
		
		parrot1.talk();
		
		parrot1.fly();
		
		parrot1.tweet();
	}

}
