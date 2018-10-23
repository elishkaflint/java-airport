package airport;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AirportTest {

    @Test
    public void testLand() throws Exception {
        Airport airport = new Airport();
        airport.land("plane");
        assertTrue(airport.planes.contains("plane"));
    }

}