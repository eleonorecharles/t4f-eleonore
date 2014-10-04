package be.eleonore.wiheries;

public class ChartConsole {

    private static final int MAX_X = 200;
    private static final String MARKER = "*";

    public static void main(String[] args) {
        for (int x = 0; x < MAX_X; x++) {
            int y = f(x);
            print(y);
        }
    }

    private static int f(int x) {
        return x * 2;
    }

    private static void print(int y) {
        for (int i = 0; i < y; i++) {
            System.out.print(MARKER);

        }
        System.out.println();
    }

}
