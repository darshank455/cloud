import java.util.Calendar;
import java.util.*;
public class DOB 
{
   public static void main(String[] args) 
   { int D,M,Y;
     Scanner sc=new Scanner(System.in);
      Calendar cal = Calendar.getInstance();
      int d=cal.get(Calendar.DATE);
      int m=(cal.get(Calendar.MONTH)+1);
      int y=cal.get(Calendar.YEAR);

      System.out.println("Enter the date");
        D=sc.nextInt();
        System.out.println("Enter the month");
        M=sc.nextInt();
        System.out.println("Enter the year");
        Y=sc.nextInt();

        int year=y-Y;
        int month=m-M;
        int day=d-D;
        System.out.println("Your age is "+day+"-days "+month+"-month "+year+"-year" );

   }
}