package metanit;

import java.security.spec.ECField;

public final class MyMath {
    static final double PI = 3.14;
    static void obratnyOtchet(int num) {
        if (num == 0) {
            return;
        }
        System.out.printf(" " + num);
        obratnyOtchet(num - 1);
    } //Рекурсия

    static void delenyeUmensheniyem(double a, double b) {
        try{
            double i = b;
            while(i >= 0) {
                if (i == 0) {
                    throw new Exception("Deleniye na nol");
                }
                double c = a / i;
                System.out.println(" " + c);
                i--;
            }
        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
        } finally {
            System.out.printf("konec");
        } // обработка ошибок
    }
    public static class Factorial{

        private int result;
        private int key;

        public Factorial(int number, int x){

            result=number;
            key = x;
        }

        public int getResult(){
            return result;
        }

        public int getKey(){
            return key;
        }
    }

    public static Factorial getFactorial(int x){

        int result=1;
        for (int i = 1; i <= x; i++){

            result *= i;
        }
        return new Factorial(result, x);
    }
}
