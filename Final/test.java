package Final;
import java.util.ArrayList;
public class test {
    public static void main(String[] args){
        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(new Shark());
        list.add(new Penguin());
        list.add(new Deer("Bambi"));
        list.add(new Snake("Steve"));
        list.add(new Opossum("Refuse"));
        list.add(new Duck("Drake"));

        for(int i=0; i<list.size(); i++){
            list.get(i).printSelf();;
        }
    }
}
