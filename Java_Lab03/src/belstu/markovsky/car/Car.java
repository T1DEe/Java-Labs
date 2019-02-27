package belstu.markovsky.car;

import belstu.markovsky.enums.*;
import belstu.markovsky.exception.*;


public abstract class CarAbstract {

    private String manufacturer;
    private int length;
    private int weight;
    private WheelDrive wheelDrive;
    private int maxSpeed;


    public String getManufacturer() {
        return manufacturer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 500 )
            throw new CarException("Length can't be less then 500 st.");
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0 )
            throw new CarException("Weight can't be less then 0 kg.");
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0 )
            throw new CarException("Max Speed can't be less then 0 km/h");
        this.maxSpeed = maxSpeed;
    }

    public WheelDrive getWheelDrive() {
        return wheelDrive;
    }


    public CarAbstract() {
        manufacturer = "N/A";
        length = 2000;
        weight = 1200;
        wheelDrive = WheelDrive.FRONT_DRIVE;
        maxSpeed = 120;
    }

    public CarAbstract(String manufacturer, int length, int weight, WheelDrive wheelDrive, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.length = length;
        this.weight = weight;
        this.wheelDrive = wheelDrive;
        this.maxSpeed = maxSpeed;
    }
}
