abstract class Animal {
    String name;
    String sound;
    int size;

    //Sound accessors
    abstract String speak();
    abstract void setSound(String sound);

    //Name accessors 
    abstract String getName();
    abstract void setName(String name);

    //Size accessors
    abstract int getSize();
    abstract void setSize(int num);

}
