
public class Reptiles<Boolean, String> extends Animal {
	private String name;
	private boolean hasScales;
	private String sound;
	public Reptiles()
	{
		this.name = "NA";
		this.hasScales = true;
	}
	
	public Reptiles(String sound)
	{
		this.sound = sound;
		this.hasScales = true;
	}
	
	public void hasFeathers()
	{
		System.out.println("Has Scales? " + this.hasScales);
	}
}
