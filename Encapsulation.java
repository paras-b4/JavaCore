// 1. what is encapsulation ?
//binding data with method to make your program secure is known as encapsulation
// 2.How to acchive encapsulation ?
//we can acchive encapsulation through access specifiers private,protected,public
// 3. benifit of encapsulation ?
// a. helpful in data abstraction ?
// b. for security point of view it is most beneficial ?
// 4. How to use private data ?
// using setters and getters method we can set and get the value of variable
// insted if using getter and setter method we can also use any mathod name like abc or xyz but the reason behind using getter and setter is that they define a specific role.
class HUman
{
    private int age;
    private String name;

    public int getAge()
    {
        return age ;
    }
    public void setAge(int age)
    {
        this.age=age;
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
        HUman obj = new HUman();
        obj.setAge(21);
        obj.setName("paras");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
class HUmans
{
    private int age;
    private String name;

    public int abc()
    {
        return age ;
    }
    public void xyz(int age)
    {
        this.age=age;
    }
    public String pqrs()
    {
        return name ;
    }
    public void def(String name)
    {
        this.name=name;
    }


}
class mains
{
    public static void main(String[] args)
    {
        HUmans obj = new HUmans();
        obj.xyz(23);
        obj.def("paras_yadav");
        System.out.println(obj.pqrs() + " : " + obj.abc());
    }
}