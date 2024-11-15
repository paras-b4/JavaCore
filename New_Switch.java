// Method 1
import java.util.Scanner;
class Day
{
    public static void main (String[] arg)
    {
         Scanner obj = new Scanner (System.in);
         System.out.println("enter a day");
         String day = obj.nextLine();
         String result ;
         switch (day)
         {
            case "saturday","sunday" -> result = "9am" ;

            case "monday","tuesday" -> result = "6am";

            default -> result="7am";

            
         }
         System.out.println(result);
    }
}
// Method 2
/*
import java.util.Scanner;
class Day
{
    public static void main (String[] arg)
    {
         Scanner obj = new Scanner (System.in);
         System.out.println("enter a day");
         String day = obj.nextLine();
         String result ;
         switch (day)
         {
            case "saturday","sunday" :
                System.out.println("9am");
                break;


            case "monday","tuesday" :
                System.out.println("6am");
                break;

            default :
                System.out.println("7am");


            
         }
         
    }
}
// Method 3
import java.util.Scanner;
class Day
{
    public static void main (String[] arg)
    {
         Scanner obj = new Scanner (System.in);
         System.out.println("enter a day");
         String day = obj.nextLine();
         String result ;
        result = switch (day) //this is statement 
         { // this block is expression now
            case "saturday","sunday" -> "9am";
                


            case "monday","tuesday" -> "6am";
               

            default -> "7am";


            
         };
         System.out.println(result);         
    }
}
// Method 4
import java.util.Scanner;
class Day
{
    public static void main (String[] arg)
    {
         Scanner obj = new Scanner (System.in);
         System.out.println("enter a day");
         String day = obj.nextLine();
         String result ;
        result = switch (day) //this is statement 
         { // this block is expression now
            case "saturday","sunday" :
                yield "9am";
                


            case "monday","tuesday" :
                yield "6am";
               

            default :
            yield "7am";


            
         };
         System.out.println(result);         
    }
}*/