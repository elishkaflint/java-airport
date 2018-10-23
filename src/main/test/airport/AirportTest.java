package airport;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class AirportTest {

    @Test
    public void testLand() {
        Airport airport = new Airport(20);
        airport.land("plane");
        assertTrue(airport.planes.contains("plane"));
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testTooManyLandingsRaisesError() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Airport is full!");
        Airport airport = new Airport(20 );
        for(int i = 0; i <= airport.capacity; i++) { airport.land("plane"); };
    }

}