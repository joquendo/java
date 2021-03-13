public class VarExample {
    public static void main (String args[]) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z = x + y;
        System.out.println("x + y = " + z);
        z = x - y;
        System.out.println("x - y = " + z);
        z = x * y;
        System.out.println("x * y = " + z);
        z = x / y;
        System.out.println("x / y = " + z); // Double number results in java Ex: 3.23583174523
    }
}