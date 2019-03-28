package belstu.markovsky.car;

import belstu.markovsky.enums.*;
import belstu.markovsky.exception.*;


public abstract class Car implements Comparable<Car> {

    // ==========================================================================

    private String manufacturer;
    private int length;
    private int weight;
    private WheelDrive wheelDrive;
    private int fuelConsum;
    private int maxSpeed;
    private int price;

    // ==========================================================================

    public String getManufacturer() {
        return manufacturer;
    }

    public int getLength() {
        return length;
    }

    private void setLength(int length) throws CarException {
        if (length < 100 )
            throw new CarException("Length can't be less than 500 st.");
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws CarException {
        if (weight < 0 )
            throw new CarException("Weight can't be less than 0 kg.");
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private void setMaxSpeed(int maxSpeed) throws CarException {
        if (maxSpeed < 0 )
            throw new CarException("Max Speed can't be less than 0 km/h");
        this.maxSpeed = maxSpeed;
    }

    public WheelDrive getWheelDrive() {
        return wheelDrive;
    }

    public int getFuelConsum() {
        return fuelConsum;
    }

    private void setFuelConsum(int fuelConsum) throws CarException {
        if (fuelConsum < 0 )
            throw new CarException("Fuel consumption can't be less than 0.");
        this.fuelConsum = fuelConsum;
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) throws CarException {
        if (price < 0 )
            throw new CarException("Price can't be less than 0.");
        this.price = price;
    }

    // ==========================================================================

    public Car() {
        manufacturer = "N/A";
        length = 2000;
        weight = 1200;
        wheelDrive = WheelDrive.FRONT_DRIVE;
        maxSpeed = 120;
        fuelConsum = 10;
        price = 10000;
    }

    public Car(String manufacturer, int length, int weight, WheelDrive wheelDrive,
               int maxSpeed, int fuelConsum, int price) throws CarException {
        this.manufacturer = manufacturer;
        setLength(length);
        setWeight(weight);
        this.wheelDrive = wheelDrive;
        setMaxSpeed(maxSpeed);
        setFuelConsum(fuelConsum);
        setPrice(price);
    }

    // ==========================================================================

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer = '" + manufacturer + '\'' +
                ", price = " + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.fuelConsum, o.fuelConsum);
    }
}
