package n3exercise1;

import n3exercise1.actions.Action;

import java.util.ArrayList;
import java.util.List;

public class ParkingMan {
    List<Action> toDo = new ArrayList<Action>();

    public void takeAction(Action action){toDo.add(action);}

    public void doActions(){
        for(Action a : toDo){
            a.execute();
        }
        toDo.clear();
    }
}
