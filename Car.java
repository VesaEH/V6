package main;

public class Car extends Vehicle{

    public Car(String manufacturer, String model, int maxSpeed){
        //super(manufacturer, model, maxSpeed);
    }

    public void drive(){
        System.out.println(model + " paahtaa tietä eteenpäin!");
    }
}
