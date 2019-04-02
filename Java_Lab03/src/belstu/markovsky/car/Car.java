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
    public int getWeight() {
        return weight;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public WheelDrive getWheelDrive() {
        return wheelDrive;
    }
    public int getPrice() {
        return price;
    }
    public int getFuelConsum() {
        return fuelConsum;
    }


    private void setLength(int length) {
        if (length < 100 )
            this.length = 100;
        else
            this.length = length;
    }

    public void setWeight(int weight) {
        if (weight < 0 )
            this.weight = 1000;
        else
            this.weight = weight;
    }

    private void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0 )
            this.maxSpeed = 30;
        else
            this.maxSpeed = maxSpeed;
    }

    private void setFuelConsum(int fuelConsum) {
        if (fuelConsum < 0 )
            this.fuelConsum = 7;
        else
            this.fuelConsum = fuelConsum;
    }

    private void setPrice(int price) {
        if (price < 0 )
            this.price = 500;
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
               int maxSpeed, int fuelConsum, int price) {
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
