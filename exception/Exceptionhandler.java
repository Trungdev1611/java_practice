package exception;

import java.util.Random;

public class Exceptionhandler {
    public static void main(String[] args) {
        // testException();
        Random random = new Random(1);
        System.out.println(random.nextInt(100));
    }

    static public int testException() {
        try {
            int divide = 1 / 0;
            return divide;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            return 0;
        }

    }

}
