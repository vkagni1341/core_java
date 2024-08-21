
/*
Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and
 Amount.*/



public class Simple_Intrest
{
   public static void main (String[]args)
{
    double principalAmount = Double.parseDouble(args[0]);
    double rate            = Double.parseDouble(args[1]);
    double time            = Double.parseDouble(args[2]);

    double simpleInterest  = principalAmount*rate*time/100;
    System.out.println("Simple Interest = "+simpleInterest );
    System.out.println("TOTAL AMOUT IS = "+(simpleInterest+principalAmount));

}
}
