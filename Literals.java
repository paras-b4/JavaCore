/* Literals in java are a synthetic representation of boolean, character,numeric ,or string data 
Different ways of representation of integers using Literals */

class Literals 
{
    public static void main(String arg[])
    {
        int b= 0b101; // Binary format----- must start with 0b
        int a= 0x7E; //Hexa decimal number ----Range from  0-9 and  a to f 
        int c=  07634;// Octal number -----must start with 0 and Range from 0-7
        // for Decimal no Range from 0-9
        char C='a';
        char u=0b1111;
        C++;
        C+=1;
        String name= "hellow";
        
        System.out.println(C) ;
        
        System.out.println(b) ;
        System.out.println(a) ;
        System.out.println(c) ;
        System.out.println(name) ;
        System.out.println(u) ;
    }
}