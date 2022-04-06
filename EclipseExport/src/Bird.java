public class Bird extends Animal{
	private String name;
	private Boolean hasFeathers;
	
	
	public Bird()
	{
		this.name = "NA";
		this.hasFeathers = true;
	}
	
	public Bird(String sound)
	{
		this.name = sound;
		this.hasFeathers = true;
	}
	
	public void hasFeathers()
	{
		System.out.println("Has feathers? " + this.hasFeathers);
	}
	
}
