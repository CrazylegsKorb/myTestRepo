package com.hcl.animalkingdom.impl;

public class Mammal extends Animal{
    public Boolean hasFur;
    public String type = "mammal";

    public String getName() {
        return this.name;
    }
    
    public void setName(String in) {
        this.name = in;        
    }

    public String getSound() {
        return this.sound;
    }
    
    public void setSound(String in) {
        this.sound = in;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double in) {
        this.weight = in;
    }

    public void setType(String in){
        this.type = in;
    }

    public void printSelf() {
        System.out.println("This is "+this.name+ ", they are a "+ this.type +", they make sounds like " + this.sound + ", and they weigh " +weight+ "lbs");
    }
    
}
