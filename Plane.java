package main;

public class Plane extends Vehicle{

    public Plane(String manufacturer, String model, int maxSpeed){
        /*super(manufacturer,  model, maxSpeed);*/
    }

    public void fly(){
        System.out.println(model + " lentää kohteeseen!");
    }
}