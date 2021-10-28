import java.util.Random;

public class test {
    public static void main(String[] args) {
        environment obj = new environment();
        if (obj.moveRight() == 1) {
            obj.moveLeft();
        }
        obj.suck();
        obj.moveLeft();
        obj.suck();


    }
}
