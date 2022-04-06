
public class Duck extends Bird{
	private String name;
	private int weight;
	private String sound;
	
	public Duck()
	{
		this.name = "Duck";
		this.weight = 10;
		this.sound = "QUACK!";
	}
	
	public void getName()
	{
		System.out.println(this.name);
	}
	
	public void speak()
	{
		System.out.println(this.sound);
	}
	
	public void getWeight()
	{
		System.out.println(this.weight + " lb(s)");
	}
	

}
