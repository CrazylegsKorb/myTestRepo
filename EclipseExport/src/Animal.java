
public class Animal {
	private String name;
	private int weight;
	private String sound;
	
	public void hasFeathers(){};
	
	public void getName() {};
	public void speak() {};
	public void getWeight() {};
	
	public static void main(String[] args) {
		
		Animal duck = new Duck();
		
		duck.getName();
		duck.hasFeathers();
		duck.speak();
		duck.getWeight();
		
		return;
	}
}
