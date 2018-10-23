package airport;

import java.util.ArrayList;
import java.lang.RuntimeException;

public class Airport {

    ArrayList planes;
    int capacity;

    public Airport(int capacity) {
        this.planes = new ArrayList();
        this.capacity = capacity;
    }

    public void land(String plane) {
        if(this.planes.size() == this.capacity) {
            throw new RuntimeException("Airport is full!");
        } else {
            this.planes.add(plane);
        }
    }

    public ArrayList getPlanes() {
        return this.planes;
    }
}
