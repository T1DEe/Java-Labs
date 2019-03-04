package belstu.markovsky.car;

import belstu.markovsky.enums.WheelDrive;
import belstu.markovsky.exception.CarException;

public class CarLite extends Car {

    // ==========================================================================

    private int seatingPlaces;

    // ==========================================================================

    public CarLite() {
        super();
        this.seatingPlaces = 2;
    }

    public CarLite(String manufacturer, int length, int weight, WheelDrive wheelDrive,
                   int maxSpeed, int fuelConsum, int price,  int seatPlaces) throws CarException {

        super(manufacturer, length, weight, wheelDrive, maxSpeed, fuelConsum, price);
        this.seatingPlaces = seatPlaces;
    }

    // ==========================================================================

    public int getSeatingPlaces() {
        return seatingPlaces;
    }

    private void setSeatingPlaces(int seatingPlaces) throws CarException{
        if (seatingPlaces < 0 || seatingPlaces > 9 )
            throw new CarException("Seating places can't be less than 0 and more than 9");
        this.seatingPlaces = seatingPlaces;
    }

    @Override
    public void setWeight(int weight) throws CarException {
        if (weight > 3500) {
            throw new CarException("Weight of lite car can't be more than 3500 kg.");
        } else {
            super.setWeight(weight);
        }
    }

    // ==========================================================================
}
