import java.util.Random;

public class test {
    public static void main(String[] args) {
        environment obj = new environment();
        System.out.println(obj.getScore());
        if (obj.moveRight() == 1) {
            System.out.println(obj.getScore());
            obj.moveLeft();
            System.out.println(obj.getScore());
        }
        obj.suck();
        System.out.println(obj.getScore());
        obj.moveLeft();
        System.out.println(obj.getScore());
        obj.suck();
        System.out.println(obj.getScore());


    }
}
