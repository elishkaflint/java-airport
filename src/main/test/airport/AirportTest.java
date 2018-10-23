package airport;

import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

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

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testTooManyLandingsRaisesError() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Airport is full!");
        for(int i = 0; i <= airport.capacity; i++) { airport.land("plane"); };
    }

}