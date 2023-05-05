package b;

import a.A;

public class B {
    public static void main(String[] args) {
        A obj = new A(12);

        System.out.print("A的值为：");
        obj.showData();
    }
}
