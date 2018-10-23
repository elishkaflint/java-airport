package airport;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    @Test
    public void testGround() {
        Plane plane = new Plane();
        plane.ground();
        assertTrue(plane.isGrounded);
    }

}