/*
class While
{
    public static void main(String a[])
    {
        int i =1;
        
        while(i<=5)
        {
            System.out.println("hi : "+ i);
            i++;
            int j=1;
            while(j<=3)
            {
                System.out.println("hello : "+j);
                j++;
            }
        }
    }
}

/*

class While
{
    public static void main(String a[])
    {
        int i =1;
        
        while(true)
        {
            System.out.println("hi : "+ i);
            i++;
            
        }
    }
}
*/
class While
{
    public static void main(String a[])
    {
        int i =1;
        //This is do while
        do
        {
            System.out.println("hi : "+ i);
            i++;
            int j= 1;
            do{
                System.out.println("hello : " + j);
                j++;
            }while(j<=3);
            
        }while(i<=5);

    }
}