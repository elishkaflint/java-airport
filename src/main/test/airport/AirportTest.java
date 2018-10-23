package airport;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

public class AirportTest {

    @Test
    public void testLand() throws Exception {
        Airport airport = new Airport();
        airport.land("plane");
        ArrayList hangar = airport.getPlanes();
        assertThat(hangar, hasItem("plane"));
    }

}