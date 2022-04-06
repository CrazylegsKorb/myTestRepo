public class Duck extends Bird implements laysEggs, canSwim, omnivore, canFly{

    Duck(){
        this.setName("a chicken");
        this.setSound("*quack quack*");
        this.setWeight(2.1);                //in lbs
        this.setType("duck");
        this.hasHollowBones = true;
        this.hasFeathers = true;
    }

    Duck(String in){
        this.setName(in);
        this.setSound("*quack quack*");
        this.setWeight(2.4);                //in lbs
        this.setType("duck");
        this.hasHollowBones = true;
        this.hasFeathers = true;
    }

    public void layAnEgg(){
        System.out.println("\"I layed an Egg!\"");
    }

    public void swim() {
        System.out.println("\"I can float, swim, and dive!\"");
    }

    public void eat(){
        System.out.println("\"I'm eating some bread from a nice old lady!\"");
    }

    public void fly() {
        System.out.println("\"I fly in a V-formation!\"");
    }
    
    public void printSelf() {
        System.out.println("This is "+this.name+ ", \nthey are a "+ this.type +",\nthey make sounds like " + this.sound + ",\nand they weigh " +weight+ "lbs");
        this.eat();
        this.layAnEgg();
        this.swim();
        this.fly();
    }
    
}
