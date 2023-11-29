package Interface;

interface MethodInterface {
    public static void staticmethod() {
        System.out.println("static method");
    };

    default void methodDefault() {
        System.out.println("default method");
    }

    abstract void abstractMethod();
}
