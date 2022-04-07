package Final;
public abstract class Animal {
    public String name;
    public String sound;
    public double weight;

    public abstract void printSelf();
    public abstract String getName();
    public abstract void setName(String in);
    public abstract String getSound();
    public abstract void setSound(String in);
    public abstract double getWeight();
    public abstract void setWeight(double in);
}
