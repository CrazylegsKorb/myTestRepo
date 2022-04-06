
public class pike extends Fish implements Swim {
	
	private String name;
	private int weight;
	private String sound;
	private Boolean hasGills;

    public pike()
    {
        this.name = "pike";
        this.weight = 2;
        this.sound = "glurrppp *underwater noises*";
        this.hasGills = true;
    }

    public void getName()
    {
        System.out.println(this.name + " is the name of the fish.");
    }

    public void getSize()
    {
        System.out.println(this.weight + " lbs is the average weight of pikes.");
    }

    public void speak()
    {
        System.out.println(this.sound + " is the sound a fish makes?");
    }

    public void getGills()
    {
        System.out.println(this.hasGills + " pikes have gills");
    }

}
