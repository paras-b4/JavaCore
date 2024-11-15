import java.util.Scanner;
class Computer 
{
    public void playmusic() // Void means not expecting anything in return 
    {
        System.out.println("music playing");

    } 
    public String getmypen(int cost) // string or int means that expecting some return value: 
    {
        //System.out.println("cost is = " + cost);
        if (cost>10)
            return"pen";

        return "Nothing";
    }
}
class main
{
    public static void main(String[] args)
    {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter cost of a pen = ");
        int cost= obj1.nextInt();
        Computer obj=new Computer();
        obj.playmusic();
        String n = obj.getmypen(cost);
        System.out.println(n);

    }
}