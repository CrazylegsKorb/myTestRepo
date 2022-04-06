public class bird extends Animal {
    String name;
    String sound;
    int weight;
    Boolean hasFeathers;
    Boolean hasHollowBones;

    //Sound accessors
    String speak(){
        return this.sound;
    }
    void setSound(String in){
        this.sound = in;
    }

    //Name accessors 
    String getName(){
        return this.name;
    }
    void setName(String in){
        this.name = in;
    }

    //Size accessors
    int getSize(){
        return this.weight;
    }
    void setSize(int num){
        this.weight = num;
    }

    Boolean getBones(){
        return this.hasHollowBones;
    }

    Boolean getFeathers(){
        return this.hasFeathers;
    }
}
