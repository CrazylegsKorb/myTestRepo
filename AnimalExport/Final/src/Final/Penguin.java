package Final;
public class Penguin extends Bird implements laysEggs, canSwim, carnivore, walks, jumps{

    Penguin(){
        this.setName("a penguin");
        this.setSound("*trill*");
        this.setWeight(20.25);          //inlbs
        this.setType("penguin");
        this.hasHollowBones = false;    
        this.hasFeathers = true;
    }

    Penguin(String in){
        this.setName(in);
        this.setSound("*trill*");
        this.setWeight(24.52);          //in lbs
        this.hasHollowBones = false;
        this.hasFeathers = true;
    }

    public void swim() {
        System.out.println("\"I swim super fast!\"");
    }

    public void layAnEgg() {
        System.out.println("\"I layed an egg!\"");
    }

    public void eatMeat() {
        System.out.println("\"I'm eating a fish!\"");
    }
    
    public void walk() {
        System.out.println("\"I waddle about!\"");        
    }
      
    public void jump() {
        System.out.println("\"I can make small hops!\"");
    }
  
    public void printSelf() {
        System.out.println("This is "+this.name+ ",\nthey are a "+ this.type +",\nthey make sounds like " + this.sound + ",\nand they weigh " +weight+ "lbs");
        this.eatMeat();
        this.layAnEgg();
        this.swim();
        this.walk();
        this.jump();
        System.out.println();
    }

}
