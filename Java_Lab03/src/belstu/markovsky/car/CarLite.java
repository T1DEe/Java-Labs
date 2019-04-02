package belstu.markovsky.car;

import belstu.markovsky.enums.WheelDrive;
import belstu.markovsky.exception.CarException;

import java.io.Serializable;

public class CarLite extends Car implements Serializable {

    // ==========================================================================

    private int seatingPlaces;

    // ==========================================================================

    public CarLite() {
        super();
        this.seatingPlaces = 2;
    }

    public CarLite(String manufacturer, int length, int weight, WheelDrive wheelDrive,
                   int maxSpeed, int fuelConsum, int price,  int seatPlaces) {

        super(manufacturer, length, weight, wheelDrive, maxSpeed, fuelConsum, price);
        this.seatingPlaces = seatPlaces;
    }

    // ==========================================================================

    public int getSeatingPlaces() {
        return seatingPlaces;
    }

    private void setSeatingPlaces(int seatingPlaces) {
        if (seatingPlaces < 0 || seatingPlaces > 9 )
            this.seatingPlaces = 2;
        else
            this.seatingPlaces = seatingPlaces;
    }

    @Override
    public void setWeight(int weight) {
        if (weight < 3500)
            super.setWeight(weight);
        else
            super.setWeight(3500);
    }

    // ==========================================================================
}
