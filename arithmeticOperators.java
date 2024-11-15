class Arithmetic
{
    public static void main( String arg[])
    {
        int num1=25;
        int num2=5;
        int result=num1+num2;
        int result1=num1-num2;
        int result2=num1*num2;
        int result3=num1/num2;
        int result4=num2 % num1 ;
        /*public static int floordiv(int num1,int num2)
        public static long floordiv(long num1,long num2)*/
        System.out.println(Math.floorDiv(num1,num2));
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        
        //int j=num2++;
        //System.out.println(j);
        int i=++num2;
        System.out.println(i);
    }
}