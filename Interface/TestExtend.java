package Interface;

public class TestExtend implements InnerMethodInterfaceExtend {

    @Override
    public void abstractMethod() {
        // TODO Auto-generated method stub
        System.out.println("abstract method triển khai");
    }

    public static void main(String[] args) {
        TestExtend testExtend = new TestExtend();
        testExtend.abstractMethod();

        testExtend.methodDefault();
        InnerMethodInterfaceExtend.staticmethod2();
        MethodInterface.staticmethod();
    }

}
