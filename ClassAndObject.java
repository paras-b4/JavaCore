/* Java is an object oriented Programing 
 1. what is object ?
 --In real world everything is an object like a pen ,mouse,glass etc
 --every object has two things :
 --An object knows somthing( its has some properties )
 --An object does Somthing (it has a behaviour )
 --Every object has a property and Behaviour
 2. ehat is class ?
 --Class act as blueprint that contain the designing of an object 
 */
import java.util.Scanner;
class calculator
{ 
    public int add(int n1,int n2)
    {
        int result= n1+n2;
        return result;
        

    }
    
}
class main{
    public static void main(String[] args)
    {
        //int b=5;
        //int c=7;
        Scanner num1= new Scanner(System.in);
        System.out.println("enter  numbers");
        

        int b = num1.nextInt();
        int c = num1.nextInt();

        calculator calc = new calculator();  // calc is a Reference variable
        int r1=calc.add(b,c);
        System.out.println(r1);


    }
}
