package n3exercise1;

public class Vehicle {
    String name;
    boolean started = false;

    public Vehicle(String name) {
        this.name = name;
    }

    public void rev() {
        if(!started){
            System.out.println("The "+name+ " is not started");
            return;
        }
        System.out.println("The " + name + " is revving");
    }

    public void brake(){
        if(!started){
            System.out.println("The "+name+ " is not started");
            return;
        }
        System.out.println("The " + name + " is slowing down");
    }

    public void start(){
        if(started){
            System.out.println("The "+name+ " is already started");
            return;
        }
        System.out.println("Starting the "+name);
        started = true;
    }

}
