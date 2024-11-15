/*when we create an object then in the heap memory it will create a black object .
if you dont assign the value than the default values will be assigned like '0' for int; and 'NULL' for String ;
1. properties of constructor 
-- constructor is almost similar to method it has a name and it also have a round brackets .
-- the change in the constructor with respect to the method is that in the constructor we do not spectifies the return type .
-- the name of a constructor must be the same as the class name  
*/
//                  Default constructor 
/*
class Human
{
    private int age;
    private String name;

    public Human() // This is a constructor 
    {
        age=21;
        name="paras";
    }

    public int getAge()
    {
        return age ;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name ;
    }
    public void setName(String name)
    {
        this.name=name;
    }


}
class main
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
        //obj.setAge(21);
        //obj.setName("paras");
        //System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
*/

//                         parametrized constructor
class Human
{
    private int age;
    private String name;
    
    public Human() // This is a constructor
    {
        age=24;
        name="paras";
        System.out.println("This is a default constructor");
    } 

    public Human(int age , String name) // This is a constructor 
    {
        this.age=age;
        this.name=name;
    }

    public int getAge()
    {
        return age ;
    }
    public void setAge(int age)
    {
        this.age = age ;
    }
    public String getName()
    {
        return name ;
    }
    public void setName(String name)
    {
        this.name=name;
    }


}
class main
{
    public static void main(String[] args)
    {
        Human obj = new Human(23, "paras_yadav");
        Human obj1=new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
        //obj.setAge(21);
        //obj.setName("paras");
        //System.out.println(obj.getName() + " : " + obj.getAge());
    
    }
}
