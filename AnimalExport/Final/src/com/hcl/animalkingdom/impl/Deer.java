package com.hcl.animalkingdom.impl;

import com.hcl.animalkingdom.interfaces.CanSwim;
import com.hcl.animalkingdom.interfaces.Herbavore;
import com.hcl.animalkingdom.interfaces.Jumps;
import com.hcl.animalkingdom.interfaces.LiveBirth;
import com.hcl.animalkingdom.interfaces.Walks;

public class Deer extends Mammal implements Herbavore, Walks, LiveBirth, CanSwim, Jumps{

    Deer(){
        this.setName("a deer");
        this.setSound("*snort wheeze stomp*");
        this.setWeight(254.31);                    //in lbs
        this.setType("deer");
        this.hasFur = true;
    }

    public Deer(String in){
        this.setName(in);
        this.setSound("*snort wheeze stomp*");
        this.setWeight(542.18);                     //in lbs
        this.setType("deer");
        this.hasFur = true;
    }
    
    public void swim() {
        System.out.println("\"I can swim short distances!\"");
    }

    public void giveBirth() {
        System.out.println("\"I gave birth to a fawn!\"");
    }

    public void walk() {
        System.out.println("\"I can walk, and gallop!\"");
    }

    public void eatGeens() {
        System.out.println("\"I like to eat foliage and fruit!\"");
    }

    public void jump() {
        System.out.println("\"I can jump long distances!\"");
    }

    public void printSelf() {
        System.out.println("This is "+this.name+ ", \nthey are a "+ this.type +",\nthey make sounds like " + this.sound + ",\nand they weigh " +weight+ "lbs");
        this.eatGeens();
        this.giveBirth();
        this.swim();
        this.walk();
        this.jump();
        System.out.println();
    }
    
}
