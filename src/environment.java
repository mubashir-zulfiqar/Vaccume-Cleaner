@SuppressWarnings("ConstantConditions")
public class environment implements EnvironmentInterface{
    Room[] room;

    environment() {
        room = new Room[2];
        room[0] = new Room(true);
        room[1] = new Room(false);
    }

    @Override
    public int moveLeft() {
        if(room[0].agentPosition) {
            System.out.println("Agent is already in left room.");
            return 1;
        }
        else if(!room[0].agentPosition) {
            room[1].agentPosition = false;
            room[0].agentPosition = true;
            System.out.println("Agent is now moved to Left room.");
        }
        return 0;
    }

    @Override
    public int moveRight() {
        if(room[1].agentPosition) {
            System.out.println("Agent is already in Right room.");
            return 1;
        }
        else if(!room[1].agentPosition) {
            room[0].agentPosition = false;
            room[1].agentPosition = true;
            System.out.println("Agent is now moved to Right room.");
        }
        return 0;
    }

    @Override
    public void suck() {
        int currentRoom = 0;
        if (room[0].agentPosition) currentRoom = 0; // Left
        else if (room[1].agentPosition) currentRoom = 1; // Right
        System.out.println("Room[" + currentRoom + "] " +
                (currentRoom == 0 ? "(Left)" : "(Right)") +
                "is now clean.");
        room[currentRoom].dirty = false;
    }

    @Override
    public boolean isDirty() {
        int currentRoom = 0;
        if (room[0].agentPosition) currentRoom = 0; // Left
        else if (room[1].agentPosition) currentRoom = 1; // Right
        /*System.out.println("Room[%s] " +
                (currentRoom == 0 ? "(Left)" : "(Right)") +
                "is now clean.");*/
        return room[currentRoom].dirty;
    }

    @Override
    public int getScore() {
        return 0;
    }
}
