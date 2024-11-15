class Type_Conversion
{
    public static void main (String arg[])
    {
        int a=258;
        byte b=(byte) a; //This is type casting we explicitaly convert int value to byte . if it goes out of range the default value is calculated by taking modulas   
        
        float f = 5.6f;
        int t = (int) f ; // explicit type casting --  means done by programes


        int j=876;
        long l = j;// This is implicit type conversion . Automatically done by compiler
        System.out.println(b);
        System.out.println(t);
        System.out.println(l);

    }
}
