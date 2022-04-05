public class Main {
    public static void main(String[] arg) {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    public static int factorial(int num) {
        int total = 1;
        while (num != 0) {
            total*=num;
            num--;
        }
        return total;
    }


}
