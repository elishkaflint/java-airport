package airport;

import java.util.ArrayList;

public class Airport {

    ArrayList planes;
    int capacity;

    public Airport(int capacity) {
        this.planes = new ArrayList();
        this.capacity = capacity;
    }

    public void land(String plane) {
        this.planes.add(plane);
    }

    public ArrayList getPlanes() {
        return this.planes;
    }
}
