public class VarExample {
    public static void main (String args[]) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z = x + y;
        System.out.println("x + y = " + z);
        z = x - y;
        System.out.println("x - y = " + z);
        z = x * y;
        System.out.println("x * y = " + z);
        z = x / y;
        System.out.println("x / y = " + z); // Division results round down in java
    }
}