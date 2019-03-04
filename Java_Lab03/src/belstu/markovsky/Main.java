package belstu.markovsky;

import belstu.markovsky.car.CarHeavy;
import belstu.markovsky.enums.WheelDrive;
import belstu.markovsky.exception.CarException;

public class Main {

    public static void main(String[] args) {

        try {
            CarHeavy carHeavy = new CarHeavy("Mercedes", 7000, 4000,
                    WheelDrive.FULL_DRIVE, 180, 9, 8000, 4000);





        } catch (CarException e) {
            e.printStackTrace();
        }


    }
}
