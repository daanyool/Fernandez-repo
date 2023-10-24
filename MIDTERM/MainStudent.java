import java.util.Scanner;

class Student {
   private String first_name;
   private String middle_name;
   private String last_name;
   private String suffix;
   
   public Student() {
      first_name = "";
      middle_name = "";
      last_name = "";
      suffix = "";
   }
   
   public String getFirstName() {
      return first_name;
   }
   
   public String getMiddleName() {
      return middle_name;
   }
   
   public String getLastName() {
      return last_name;
   }
   
   public String getSuffix() {
      return suffix;
   }
   
   public String getFullName() {
      return first_name + " " +
             middle_name + " " +
             last_name + " " +
             suffix;
   }
   
   public void setFirstName(String f) {
      first_name = f;
   }
   
   public void setMiddleName(String m) {
      middle_name = m;
   }
   
   public void setLastName(String l) {
      last_name = l;
   }
   
   public void setSuffix(String s) {
      suffix = s;
   }
}

public class MainStudent {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      Student s = new Student();
      
      System.out.println("Enter First Name: ");
      String f = obj.nextLine();
      s.setFirstName(f);
      
      System.out.println("Enter Middle Name: ");
      String m = obj.nextLine();
      s.setMiddleName(m);
      
      System.out.println("Enter Last Name: ");
      String l = obj.nextLine();
      s.setLastName(l);
      
      System.out.println("Enter Suffix: ");
      String su = obj.nextLine();
      s.setSuffix(su);
      
      System.out.println("FirstName: " + s.getFirstName());
      System.out.println("MiddleName: " + s.getMiddleName());
      System.out.println("LastName: " + s.getLastName());
      System.out.println("Suffix: " + s.getSuffix());
      System.out.println("FullName: " + s.getFullName());
   }
}
