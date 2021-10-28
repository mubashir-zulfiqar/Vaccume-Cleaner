@SuppressWarnings("CommentedOutCode")
public interface EnvironmentInterface {
    public int moveLeft();
    public int moveRight();
    // public int moveUp();
    // public int moveDown();
    public void suck();          // clean current cell
    public boolean isDirty();    // is current cell dirty?
    public int getScore();       // returns penalty score
}
