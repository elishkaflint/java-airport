package airport;

public class Plane {

    boolean isGrounded;

    public Plane() {
        this.isGrounded = false;
    }

    public void ground() {
        this.isGrounded = true;
    }
}
