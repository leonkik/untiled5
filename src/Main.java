public class Main {
   static metod metod;
   static int[] mass = new int[] {1,2,3,4,5,6};
    public static void main(String[] args)
    {
        metod = new metod();
        System.out.println( "fac:"+metod.Factorial(0));
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        metod.inversmass(mass);
        for (int i = 0; i < mass.length; i++) {
            System.out.println("after"+mass[i]);
        }
    }


}