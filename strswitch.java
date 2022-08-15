
import java.io.*;
import java.util.*;
class strswitch
{
    public static void main(String args[])
   { 
        String s4,s3;
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("string 1");
        String s1=sc.nextLine();
        System.out.println("string 2");
        String s2=sc.nextLine();
        System.out.println("ENTER YOUR CHOICE\n ");
        System.out.println("1.Index 2.CharAt 3.Compare 4.Concat 5.Endwith \n\n6.Length 7.Lowecase 8.Replace 9.Uppercase 10.Trim 11.Substring");
         ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
                System.out.print("Found Last Index :" );
                System.out.println(s1.lastIndexOf( 'a' ));
                break;
            case 2:
                char c=s1.charAt(12);
                System.out.println("CHARACTER IS->"+c);
                break;
            case 3:
                    int x;
                    x=s1.compareTo(s2);
                    if(x==0)
                    System.out.println("equal");
                    else
                    System.out.println("not equal");
                    break;
            case 4:
                    s3=s1.concat(s2);
                    System.out.println("STRING IS-->"+s3);
                    break;
            case 5:
                    System.out.println(s1.endsWith("L"));  
                    System.out.println(s1.endsWith("H")); 
                    break;
            case 6:
                    int length = s1.length();
                    System.out.println( "String Length1 is : " + length );
                    int length1 = s2.length();
                    System.out.println( "String Length2 is : " + length1 );
                    break;
            case 7:
                    System.out.println(s1.toLowerCase());
                    break;

            case 8:
                    System.out.println(s1.replace('m','z'));
                    break;
            case 9:
                    System.out.println(s1.toUpperCase());
                    break;

            case 10:
                         System.out.println(s1.trim());
                         break;
                 
            case 11:
                        System.out.println(s1.substring(4,7));
                        break;
            


                default:System.out.println("enter the valid choice");
        }   

    }
}