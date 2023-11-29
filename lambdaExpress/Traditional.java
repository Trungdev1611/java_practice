package lambdaExpress;

public class Traditional implements InterfaceFive {

    @Override
    public int caculate(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        Traditional traditional = new Traditional();
        System.out.println(traditional.caculate(0));
    }
}
