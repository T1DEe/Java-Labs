package belstu.markovsky.car;

import belstu.markovsky.enums.WheelDrive;
import belstu.markovsky.exception.CarException;

import java.io.Serializable;

public class CarHeavy extends Car implements Serializable {

    // ==========================================================================

    private int capacity;

    // ==========================================================================

    public CarHeavy() {
        super();
        this.capacity = 200;
    }

    public CarHeavy(String manufacturer, int length, int weight, WheelDrive wheelDrive,
                    int maxSpeed, int fuelConsum, int price, int capacity) throws CarException {

        super(manufacturer, length, weight, wheelDrive, maxSpeed, fuelConsum, price);
        this.capacity = capacity;
    }

    // ==========================================================================

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        if (capacity < 0 )
            this.capacity = 1;
        else
            this.capacity = capacity;
    }

    @Override
    public void setWeight(int weight) {
        if (weight > 3500) {
            super.setWeight(weight);
        } else {
            super.setWeight(3501);
        }
    }

    // ==========================================================================
}
