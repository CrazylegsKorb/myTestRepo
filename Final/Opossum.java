public class Opossum extends Mammal implements omnivore, canSwim, liveBirth, walks, jumps{

    Opossum(){
        this.setName("an opossum");
        this.setSound("AAAAAAAAA");
        this.setWeight(11.31);         //in lbs
        this.setType("opossum");
        this.hasFur = true;
    }

    Opossum(String in){
        this.setName(in);
        this.setSound("AAAAAAAAA");
        this.setWeight(13.86);         //in lbs
        this.setType("opossum");
        this.hasFur = true;
    }

    public void walk() {
        System.out.println("\"I walk at my own pace!\"");
    }

    public void giveBirth() {
        System.out.println("\"I had a few joeys!\"");        
    }

    public void swim() {
        System.out.println("\"I can swim, but not well!\"");
    }

    public void eat() {
        System.out.println("\"I love eating trash!\"");
    }

    public void jump() {
        System.out.println("\"I can make small hops!\"");
    }
    
    public void printSelf() {
        System.out.println("This is "+this.name+ ",\nthey are an "+ this.type +",\nthey make sounds like " + this.sound + "\nand they weigh " +weight+ "lbs");
        this.eat();
        this.giveBirth();
        this.swim();
        this.walk();
        this.jump();
        System.out.println();
    }
    
}
