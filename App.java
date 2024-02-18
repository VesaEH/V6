package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        Scanner sc = new Scanner(System.in);

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

                        break;
                    case 2:
                        System.out.println("Listaa kulkuneuvot ");
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
