package Interface;

public class ImplementMethodInterface implements MethodInterface {

    @Override
    // abstractmethod bắt buộc phải triển khai nếu implements interface
    public void abstractMethod() {
        System.out.println("Abstract method phải bắt buộc triển khai");
    }

    public static void main(String[] args) {
        ImplementMethodInterface implementMethodInterface = new ImplementMethodInterface();
        // default method trong interface được gọi mà không cần triển khai nhưng vẫn cần
        // tạo đối tượng
        implementMethodInterface.methodDefault();

        // static method gọi từ tên của method mà không cần triển khai
        MethodInterface.staticmethod();

        // abstract method ta phải triển khai và vẫn phải tạo đối tượng để gọi
        implementMethodInterface.abstractMethod();

        MethodInterface methodInterface = new MethodInterface() {

            @Override
            public void abstractMethod() {
                System.out.println("Anonymous class implements Interface");
            }

        };
        methodInterface.abstractMethod();
    }
}
