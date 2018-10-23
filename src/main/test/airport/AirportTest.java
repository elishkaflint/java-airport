package airport;

import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class AirportTest {

    Airport airport;

    @Before
    public void initialize() {
        airport = new Airport(20);
    }

    @Test
    public void testLand() {
        airport.land("plane");
        assertTrue(airport.planes.contains("plane"));
    }

    @Test
    public void testTakeOff() {
        airport.land("plane");
        airport.takeOff("plane");
        assertFalse(airport.planes.contains("plane"));
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testTooManyLandingsRaisesError() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Airport is full!");
        for(int i = 0; i <= airport.capacity; i++) { airport.land("plane"); };
    }

    @Test
    public void testTakeOffWhenNoPlaneRaisesError() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("No plane to take off!");
        airport.takeOff("plane");
    }

}