package Override;

public class OverrideStatic {
    public static void main(String[] args) {
        ChildrenClass childrenClass = new ChildrenClass();
        childrenClass.method1();
        ChildrenClass.method2();

        childrenClass.testSuperInChildren();

        System.out.println("age::" + childrenClass.age);

        ChildrenClass childrenClass2 = new ChildrenClass(10);
        System.out.println("age::" + childrenClass2.age);
    }

}

/*
 * lớp con kế thừa lớp cha
 * method của lớp con giống signature (tên, loại tham số, số lượng tham số..)
 * nếu giống của lớp cha thì sẽ ghi đè method lớp cha
 * static không thể ghi đè
 * 
 * gọi constructor của lớp cha qua từ khóa super
 * khi tạo một đối tượng của lớp con, constructor của lớp cha tự động được gọi,
 * nếu có 2 constructor trong lớp cha và lớp con không chỉ định super cụ thể
 * constructor nào
 * thì sẽ ưu tiên constructor không có tham số
 * 
 */

class SuperClass {
    protected String name = "test";

    protected int age;

    public SuperClass() {
        System.out.println("constructor super");
    }

    public SuperClass(int age) {
        System.out.println("constructor super 3");
        this.age = age;
    }

    protected void methodtestSuper() {
        System.out.println("super keyword");
    }

    public void method1() {
        System.out.println("Superclass");
    }
}

class ChildrenClass extends SuperClass {

    ChildrenClass() {

        System.out.println("constructor chil");
    }

    ChildrenClass(int age) {
        // super(age);
    }

    public void method1() {
        System.out.println("Children class");
    }

    public static void method2() {
        System.out.println("method2");
    }

    public void testSuperInChildren() {
        System.out.println(super.name);
        super.methodtestSuper();

    }

}