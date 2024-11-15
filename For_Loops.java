
class For
{
    public static void main(String[] a)
    {
       
        for(int i= 1;i<=5;i++)
        {
            System.out.println("DAY - "+i);

            for(int j=1;j<=9;j++)
            {
                System.out.println(" "+ (j+8)+  "-" + (j+9) );
            }
        }
    }
}

/*
class For
{
    public static void main(String[] a)
    {
       int i= 1;
        for(;i<=5;)
        {
            System.out.println("DAY - "+i);
            i++;

            int j=1;
            for(;j<=9;)
            {
                System.out.println(" "+ (j+8)+  "-" + (j+9) );
                j++;
            }
        }
    }
}*/