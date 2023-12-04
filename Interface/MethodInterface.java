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

@FunctionalInterface
/**
 * InnerMethodInterface
 */
interface InnerMethodInterfaceExtend extends MethodInterface {

    public static void staticmethod2() {
        System.out.println("static method");
    };

    default void methodDefault2() {
        System.out.println("default method");
    }

    abstract void abstractMethod();

}