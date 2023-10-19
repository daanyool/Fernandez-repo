import java.util.Scanner;
import java.util.ArrayList;

public class Restaurant {
   ArrayList<String> prod;
   ArrayList<Double> price;
   
   public Restaurant() {
      prod = new ArrayList<>();
      price = new ArrayList<>();
   }
      
   public void getMenu() {
      prod.add("C1");
      prod.add("C2");
      prod.add("C3");
      
      price.add(100.00);
      price.add(150.00);
      price.add(200.00);
      
      for(String p: prod) {
         System.out.print(p);
         for(double pr: price) {
            System.out.println(" - " + pr);
            break; 
         }
      }
   }
   
   
   public static void main(String[] args) {
      Restaurant r = new Restaurant();
      r.getMenu();
   }
}
