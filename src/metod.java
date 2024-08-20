public class metod {
    public static int Factorial(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        return b;
    }
    public void inversmass(int[] mass){
        for (int i = 0; i < mass.length / 2; i++) {
            Integer answer = mass[i];
            mass[i] = mass[mass.length - 1 -i];
            mass[mass.length - 1 -i] = answer;
        }
    }
}
