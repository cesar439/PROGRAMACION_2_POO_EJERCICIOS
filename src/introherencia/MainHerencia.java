package introherencia;

public class MainHerencia {
    static void main() {
        ClaseC obj1 = new ClaseC(1,2,3,4);
        System.out.println(obj1);
        obj1.num1 = -20;
        System.out.println(obj1);
    }
}