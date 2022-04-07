package com.hcl.animalkingdom;
import java.util.ArrayList;

import com.hcl.animalkingdom.impl.Animal;
import com.hcl.animalkingdom.impl.Deer;
import com.hcl.animalkingdom.impl.Duck;
import com.hcl.animalkingdom.impl.Opossum;
import com.hcl.animalkingdom.impl.Penguin;
import com.hcl.animalkingdom.impl.Shark;
import com.hcl.animalkingdom.impl.Snake;
import com.hcl.animalkingdom.interfaces.Omnivore;
public class Test {
    public static void main(String[] args){
        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(new Shark());
        list.add(new Penguin());
        list.add(new Deer("Bambi"));
        list.add(new Snake("Steve"));
        list.add(new Opossum("Refuse"));
        list.add(new Duck("Drake"));

        for(int i=0; i<list.size(); i++){
            list.get(i).printSelf();
            
            if(list.get(i) instanceof Omnivore) {
            	((Omnivore)list.get(i)).eat();
            	//list.get(i).eat()
            } //else 
        }
    }
}
