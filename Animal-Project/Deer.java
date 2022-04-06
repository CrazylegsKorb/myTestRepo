
public class Deer extends Mammal implements jump,walk,livebirth{
	private String name;
	private int weight;
	private String sound;
	private Boolean hasFur;
	public Deer()
	{
		this.name = "Deer";
		this.weight = 150;
		this.sound = "Grunt";
		this.hasFur = true;
	}

	
	public void canjump()
	{
		System.out.println("Can Jump");
	}
	public void canwalk()
	{
		System.out.println("Can walk");
	}
	public void givebirth()
	{
		System.out.println("Has live birth");
	}
}
