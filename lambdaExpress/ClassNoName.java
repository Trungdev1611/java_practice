package lambdaExpress;

public class ClassNoName {
    public static void main(String[] args) {
        InterfaceFive interfaceFive = new InterfaceFive() {
            @Override
            public int caculate(int a) {
                return a + 5;
            }

        };
        System.out.println(interfaceFive.caculate(0));
        ;
    }
}
