package com.hcl.animalkingdom.impl;

import com.hcl.animalkingdom.interfaces.CanSwim;
import com.hcl.animalkingdom.interfaces.Carnivore;
import com.hcl.animalkingdom.interfaces.LaysEggs;
import com.hcl.animalkingdom.interfaces.LiveBirth;

public class Shark extends Fish implements CanSwim, Carnivore, LaysEggs, LiveBirth{

    public Shark(){
        this.setName("a shark");
        this.setSound("*chomp chomp*");
        this.setWeight(4978.5);         //in lbs
        this.setType("shark");
        this.hasGills = true;
    }

    Shark(String in){
        this.setName(in);
        this.setSound("*chomp chomp*");
        this.setWeight(4978.5);         //in lbs
        this.setType("shark");
        this.hasGills = true;
    }

    public void swim() {
        System.out.println("\"I swim fast, but I can't swim backwards!\"");
    }

    public void eatMeat() {
        System.out.println("\"I'm chomping on fish!\"");
    }
    
    public void giveBirth() {
        System.out.println("\"Sometimes I give birth!\"");        
    }

    public void layAnEgg() {
        System.out.println("\"Sometimes I lay eggs!\"");
    }
    
    public void printSelf() {
        System.out.println("This is "+this.name+ ",\nthey are a "+ this.type +",\nthey make sounds like " + this.sound + ",\nand they weigh " +weight+ "lbs");
        this.eatMeat();
        this.giveBirth();
        this.layAnEgg();
        this.swim();
        System.out.println();
    }

}
