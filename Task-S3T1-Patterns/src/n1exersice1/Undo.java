package n1exersice1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo Instance;

    private static List<String> Comands;



    private Undo() {
        Comands = new ArrayList<String>();
    }

    public static Undo getInstance() {
        if(Instance == null){
            Instance = new Undo();
        }
        return Instance;
    }

    public void addComand(String Comand){
        Comands.add(Comand);
    }
    public void removeComand(String Comand){
        Comands.remove(Comand);
    }
    public void listComands(){
        Comands.forEach(System.out::println);
    }
    
    public void undo(){
        if(Comands.size()!=0){
            Comands.remove(Comands.size() -1);
        } else{
            System.out.println("There are no comands to undo");
        }
    }
}
