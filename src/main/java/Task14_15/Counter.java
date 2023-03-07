package Task14_15;

public class Counter implements AutoCloseable {

    static int sum;
    {
        sum = 0;
    }

    public static void add() {
        sum++;
    }

    public static int getSum() {
        return sum;
    }

    @Override
    public void close() {
        System.out.println("Counter closed");
    }
}
