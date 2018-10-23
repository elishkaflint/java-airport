package airport;

import java.util.ArrayList;

public class Airport {

    ArrayList planes;

    public Airport() {
        this.planes = new ArrayList();
    }

    public void land(String plane) {
        this.planes.add(plane);
    }

    public ArrayList getPlanes() {
        return this.planes;
    }
}
