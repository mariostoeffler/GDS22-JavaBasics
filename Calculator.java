public class Calculator {

    public static void main(String[] args) {

        int resultadd = add(5, 3);
        System.out.println("result add = " + resultadd);

        int resultsub = sub(5, 3);
        System.out.println("result sub = " + resultsub);

        int resultmult = mult(5, 3);
        System.out.println("result mult = " + resultmult);

        double resultdiv = div(5, 3);
        System.out.println("result div = " + resultdiv);

        double resultmod = mod(5, 3);
        System.out.println("result mod = " + resultmod);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int mult(int a, int b) {
        int result = a * b;
        return result;
    }

    public static double div(double a, double b) {
        double result = a / b;
        return result;
    }

    public static double mod(double a, double b) {
        double result = a % b;
        return result;
    }


}
