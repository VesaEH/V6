package main;

public class Ship extends Vehicle{

    public Ship(String manufacturer, String model, int maxSpeed){
        /*super(manufacturer,  model, maxSpeed);*/
    }

    public void sail(){
        System.out.println(model + " seilaa merten ääriin!");
    }
}