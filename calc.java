import java.util.Scanner;

public class calc {
  public static void main (String []args){

    Scanner calculator = new Scanner (System.in);
    boolean prog;
    boolean init = false; 
    while (init == false){ 
      System.out.println("Welcome to the BeGreen Energy Calculator! Would you like to calculate the energy you use for a specific appliance? \n(Enter Y/N)");
      String start = calculator.next();
      if (start.equalsIgnoreCase("N")){prog = false;
      init = true;}
      else if (start.equalsIgnoreCase("Y")){prog = true;
      init = true;}
      else {System.out.println("Error: Please enter Y/N! Try again!");}
      }   
    while (init ==true){
     System.out.println("What is the wattage of your appliance?\n(Please enter a whole number)");
     int wattage = calculator.nextInt();
     System.out.println("Great. How long do you use this appliance per day in minutes?\n(Please enter a whole number)");
     double hpd = calculator.nextInt() /60;
     System.out.println("How much does it cost to use this appliance per kilo-watt hour?\n"
     + "(Please do not use the dollar sign and enter in decimal format)");
     double pph = calculator.nextDouble();
     System.out.println("Awesome! Here are your calculations!");
     double kwhpd = (double) (wattage * hpd)/1000;
     System.out.print("Kilo-watt hours per day: Your appliance uses ");
     System.out.printf("%.2f", kwhpd);
     System.out.println(" kWh a day.");
     System.out.print("Kilo-watt hours per year: Your appliance uses ");
     System.out.printf("%.2f", kwhpd*365);
     System.out.println(" kWh a year.");
     System.out.print("Cost per day : Your appliance costs you ");
     System.out.printf("$%.2f", kwhpd*pph);
     System.out.println(" a day.");
     System.out.print("Cost per year : Your appliance costs you ");
     System.out.printf("$%.2f", (kwhpd*pph)*365);
     System.out.println(" a year.");
     System.out.println("\n \nUsing too much power/money? Check out our tips to learn how to energy-save! \n \n");
     boolean continuee = false;
     while (continuee == false){
     System.out.println("Would you like to calculate the usage of another device? \n(Enter Y/N)");
     String cont = calculator.next();
     if (cont.equalsIgnoreCase("N")){continuee = true;
        init = false;}
     else if (cont.equalsIgnoreCase("Y")){continuee = true;}
     else {System.out.println("Error: Please enter Y/N! Try again!");}
    }
    }
    System.out.println("Thank you for using BeGreen's Energy Calculator!");
    calculator.close();
  }
}