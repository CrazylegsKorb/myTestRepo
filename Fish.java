public class Fish extends Animal{
    Boolean hasGills;
    int weight;
    String name;
    String sound;
    
    

    String speak(){
       return this.sound;
    }
    void setSound(String in){
        this.sound = in;
    }
    String getName(){
        return this.name;
    }
    void setName(String in){
        this.name = in;
    }

        int getSize(){
            return this.weight;
        }
    void setSize(int num){
        this.weight = num;
    }
    Boolean getGills(){
        return this.hasGills;
    }
    
}