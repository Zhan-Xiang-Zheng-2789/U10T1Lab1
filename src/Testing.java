public class Testing {
    public static void main(String[] args) {
        System.out.println();
        simpleRecursion(2);
    }
    public static void simpleRecursion(int n)
    {
        System.out.println(n);
        simpleRecursion(n+1);
    }
}
