// instance variable-- these variable are declared within a class but outside a method 
// local variable-- these variable are declared within a method but do not get any default value.
//In java it is not allowed to declare two or more variable having same name inside a class or scope
// The preference is always given to the local variable .
// This keyword represent the current object 
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
        this.age /*(instance variable)*/ = age /*(local variable)*/;
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