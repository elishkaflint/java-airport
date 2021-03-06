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

    public void takeOff(Plane plane) {
        if (this.planes.isEmpty()) {
            throw new RuntimeException("No plane to take off!");
        } else {
            this.planes.remove(plane);
        }
    }

    public void land(Plane plane) {
        if(this.planes.size() == this.capacity) {
            throw new RuntimeException("Airport is full!");
        } else {
            this.planes.add(plane);
        }
    }

    // TODO work out how to get grounded plane into the array
    public void ground(Plane plane) {
        int index = this.planes.indexOf(plane);

    }
}
