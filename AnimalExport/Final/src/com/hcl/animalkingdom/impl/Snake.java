package com.hcl.animalkingdom.impl;

import com.hcl.animalkingdom.interfaces.CanFly;
import com.hcl.animalkingdom.interfaces.CanSwim;
import com.hcl.animalkingdom.interfaces.Carnivore;
import com.hcl.animalkingdom.interfaces.LaysEggs;
import com.hcl.animalkingdom.interfaces.Walks;

public class Snake extends Reptile implements LaysEggs, CanSwim, Carnivore, CanFly, Walks{

    Snake(){
        this.setName("a snake");
        this.setSound("*hiss hiss*");
        this.setWeight(1.35);           //in lbs
        this.setType("snake");
        this.isColdBlooded = true;
        this.hasScales = true;
    }

    public Snake(String in){
        this.setName("a snake");
        this.setSound("*hiss hiss*");
        this.setWeight(2.18);           //in lbs
        this.setType("snake");
        this.isColdBlooded = true;
        this.hasScales = true;
    }

    public void swim() {
        System.out.println("\"I'm lucky if I can swim!\"");
    }

    public void layAnEgg() {
        System.out.println("\"I layed some eggs!\"");
    }

    public void eatMeat() {
        System.out.println("\"I'm eating a mouse!\"");        
    }
    
    public void fly() {
        System.out.println("\"I'm really lucky if I can glide!\"");
    }
    
    public void walk() {
        System.out.println("\"I slither about!\"");        
    }

    public void printSelf() {
        System.out.println("This is "+this.name+ ",\nthey are a "+ this.type +",\nthey make sounds like " + this.sound + ",\nand they weigh " +weight+ "lbs");
        this.eatMeat();
        this.layAnEgg();
        this.swim();
        this.fly();
        System.out.println();
    }

}
