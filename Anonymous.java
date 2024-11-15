/*in jvm we have both stack and heap memory
- object is created in the heap memory that contain variable and methods it also have some address.
- every time you create an object then a constructor is call as well.
Anonymous objects are simply created by using the new keywoed 
it does not have any refrence for an anonymous object
*/
class A 
{
    public A()
    {
        System.out.println("object is created");
    }
    public void show()
    {
        System.out.println("this is method");
    }
    public void show_1()
    {
        System.out.println("this is second method ");
    }
}
class main{
    public static void main(String[] args)
    {
        new A().show();
        new A().show(); // anonymous object are thoes object that is created without giving it a name 
        //obj.show();


    }
}