import java.util.Random;

public class Room {
    public boolean dirty;
    public boolean agentPosition = new Random().nextInt(2) != 0;

    public Room(boolean dirty) {
        this.dirty = dirty;
    }
}
