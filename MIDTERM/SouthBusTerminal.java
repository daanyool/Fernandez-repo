import java.util.Scanner;
import java.math.*;

public class SouthBusTerminal {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      double cityToCarcar = 37.9, carcarToMoalboal = 47.0, carcarToSibonga = 12.5, sibongaToMoalboal1 = 45.9, sibongaToMoalboal2 = 56.7;
      double distance = 0.0; 
      
      System.out.print("Enter Speed: ");
      double speed = obj.nextDouble();
      
      System.out.println("Is Barili-Dumanjug-Alcantara-Moalboal available? \n[1] yes \n[2] no");
      byte choice = obj.nextByte();
      
      if(choice==1) {
         System.out.println("Start(SouthBus Terminal) - Start");
         System.out.println("Route 1(Minglanilla) - Route 1");
         System.out.println("Route 2(San Fernando) - ROute 2");
         System.out.println("ROute 3(Carcar) - ROute 3");
         System.out.println("Route 4.1(Barili) - Route 4.1");
         System.out.println("Route 4.1.1(Dumanjug) - ROute 4.1.1");
         System.out.println("Route 4.1.2(Alcantara) - Route 4.1.2");
         System.out.println("End(Moalboal) - End");
         System.out.println();
         
         distance = cityToCarcar + carcarToMoalboal;
      }
      
      else if(choice==2) {
         System.out.println("Is Sibonga-Dumanjug-Alcantara-Moalboal available? \n[1] yes \n[2] no");
         choice = obj.nextByte();
         
         if(choice==1) {
            System.out.println("Start(SouthBus Terminal) - Start");
            System.out.println("Route 1(Minglanilla) - Rotue 1");
            System.out.println("ROute 2(San Fernando) - Route 2");
            System.out.println("ROute 3(Carcar) - ROute 3");
            System.out.println("Route 4.2(Sibonga) - Route 4.2");
            System.out.println("ROute 4.2.1(Dumanjug) - Route 4.2.1");
            System.out.println("ROute 4.2.2(Alcantara) - ROute 4.2.2");
            System.out.println("End(Moalboal) - End");
            System.out.println();
            
            distance = cityToCarcar + carcarToSibonga + sibongaToMoalboal1;
         }
         
         else if(choice==2) {
            System.out.println("Start(SouthBus Terminal) - Start");
            System.out.println("Route 1(Minglanilla) - ROute 1");
            System.out.println("ROute 2(San Fernando) - Route 2");
            System.out.println("ROute 3(Carcar) - ROute 3");
            System.out.println("ROute 4.2(Sibonga) - ROute 4.2");
            System.out.println("ROute 5(Argao) - Route 5");
            System.out.println("ROute 5.1(Ronda) - Route 5.1");
            System.out.println("ROute 5.2(Alcantara) - ROute 5.2");
            System.out.println("End(Moalboal) - End");
            System.out.println();
            
            distance = cityToCarcar + carcarToSibonga + sibongaToMoalboal2;
         }
      }
      System.out.println("Speed: " + speed + "km/hr");
      System.out.println("Total Distance: " + distance + "km");
      System.out.println("Time of Arrival: " + (int)(distance/speed) + " hrs and " +Math.round(distance%speed) + "minutes");
   }
}