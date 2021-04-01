import java.util.Scanner;

class Conversion 
{
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of minutes:");
    int minutes = input.nextInt();

     
    int year = minutes / (60*24*365);
    int remainingMinutes = minutes % 525600;
    int day = remainingMinutes / 1440;


    System.out.println(minutes + " minutes is approximately " + year + " years and "  +  day + " days ");
    }
}