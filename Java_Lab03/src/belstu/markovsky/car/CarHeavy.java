package belstu.markovsky.car;

import belstu.markovsky.enums.WheelDrive;
import belstu.markovsky.exception.CarException;

public class CarHeavy extends Car {

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

    private void setCapacity(int capacity) throws CarException{
        if (capacity < 0 )
            throw new CarException("Capacity can't be less than 0 kg.");
        this.capacity = capacity;
    }

    @Override
    public void setWeight(int weight) throws CarException {
        if (weight > 3500) {
            super.setWeight(weight);
        } else {
            throw new CarException("Weight of heavy car can't be less than 3500 kg.");
        }
    }

    // ==========================================================================
}
