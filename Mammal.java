
public class Mammal extends Animal{
	String name;
	String sound;
	int weight;
	Boolean hasFur;
	
	String speak()
	{
		return this.sound;
	}
	void setSound(String in)
	{
		this.sound=in;
	}
	String getName()
	{
		return this.name;
	}
	void setName(String in)
	{
		this.name=in;
	}
	int getSize()
	{
        return this.weight;
    }
    void setSize(int num){
        this.weight = num;
    }
	Boolean getFur()
	{
		return this.hasFur;
	}

}
