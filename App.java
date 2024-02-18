package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles  = new ArrayList<>();

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
 
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        int j = 0;
                        String stringInput2 = sc.nextLine();
                        j = Integer.parseInt(stringInput2);

                        System.out.println("Anna kulkuneuvon valmistaja:");
                        String manufacturer = sc.nextLine();
                        System.out.println("Anna kulkuneuvon malli:");
                        String model = sc.nextLine();
                        System.out.println("Anna kulkuneuvon huippunopeus:");
                        int maxSpeed = Integer.parseInt(sc.nextLine());
                        
                        switch (j) {
                            case 1:
                                vehicles.add(new Car(manufacturer, model, maxSpeed));
                                break;
                        
                            case 2:
                                vehicles.add(new Plane(manufacturer, model, maxSpeed));
                                break;

                            case 3:
                                vehicles.add(new Ship(manufacturer, model, maxSpeed));
                                break;

                            default:
                                System.out.println("Syöte oli väärä");
                                break;
                        }
                        
                        //vehicles.add(new Car(manufacturer, model, maxSpeed));



                        break;
                    case 2:
                        System.out.println("Listaa kulkuneuvot ");
                        for (Vehicle vehicle: vehicles) {
                            vehicle.printSpecs();
                        }
                        break;
                    case 3:
                        System.out.println("Aja autoa");
                        break;
                    case 4:
                        System.out.println("Lennä lentokonetta");
                        break;
                    case 5:
                        System.out.println("Seilaa laivoja");
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
            }
        }
    }
    }
}
