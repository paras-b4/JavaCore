// static variable is use to create variable object free . we can call static variable through class name
// 1. when we are using static keywoed with variable ,block,method it become independent of object 
//                       STATIC VARIABLE 
class Mobile
{
    String brand ; //this is an instance variable
    int price;
    static String name ;  //this is a static variable  

    public void show() // this is an instance method you have to create an object of its class.
    {
        System.out.println( brand + ":" + price + ":" + name );

    }
}
class main{
    public static void main(String[] args) // for static method you do not need to create an object of its class.
    {
        Mobile obj1= new Mobile ();
        obj1.brand="apple";
        obj1.price=1500;
        Mobile.name="smartphone";

        Mobile obj2= new Mobile ();
        obj2.brand="samsung";
        obj2.price=1700;
        Mobile.name="smartphone";

        Mobile.name="phone";

        obj1.show();
        obj2.show();


    }
}

// we can call static method through class name 
// we cannot call non static method through class name we have to call its through object .
// you can use static variable inside static method .
// we cannot use non static variable directly in static method we use object refrence.

//  
/*              STATIC METHOD 
class Mobile
{
    String brand ; //this is an instance variable
    int price;
    static String name ;  //this is a static variable  

    public void show() // this is an instance method you have to create an object of its class.
    {
        System.out.println( brand + ":" + price + ":" + name );

    }
    public static void show1(Mobile obj) // This is a static method.
    {
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}
class main{
    public static void main(String[] args) // for static method you do not need to create an object of its class.
    {
        Mobile obj1= new Mobile ();
        obj1.brand="apple";
        obj1.price=1500;
        Mobile.name="smartphone";

        Mobile obj2= new Mobile ();
        obj2.brand="samsung";
        obj2.price=1700;
        Mobile.name="smartphone1";
         
        Mobile.name="phone";

        Mobile.show1(obj2); // object reference .

        obj1.show();
        obj2.show();


    }
}
*/
//                          STATIC BLOCK
// When we define static block and then creates an object then first static block is executed and then constructor is called . 
/*
class Mobile
{
    String brand ; // this is an instance variable
    int price;
    static String name ;  // this is a static variable  

    public void show() // this is an instance method you have to create an object of its class.
    {
        System.out.println( brand + ":" + price + ":" + name );

    }
    static 
    {
        System.out.println("this is static ");
    }
    public Mobile() // constructor 
    {
        brand="nothing ";
        price=2000;
        System.out.println("This is constructor");


    }
}
class main{
    public static void main(String[] args) // for static method you do not need to create an object of its class.
    {
        Mobile obj1= new Mobile ();
        //obj1.brand="apple";
        //obj1.price=1500;
        Mobile.name="smartphone";

        Mobile obj2= new Mobile ();
        obj2.brand="samsung";
        obj2.price=1700;
        Mobile.name="smartphone";

        Mobile.name="phone";

        obj1.show();
        obj2.show();


    }
}
*/

