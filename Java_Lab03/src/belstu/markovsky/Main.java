package belstu.markovsky;

import belstu.markovsky.car.Car;
import belstu.markovsky.car.CarHeavy;
import belstu.markovsky.car.CarLite;
import belstu.markovsky.enums.WheelDrive;
import belstu.markovsky.exception.CarException;
import belstu.markovsky.manager.ManagerTaxiPark;
import belstu.markovsky.park.ParkTaxi;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static {
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(Main.class);


    public static void main(String[] args) {

        LOG.info("Program start...");

        ManagerTaxiPark manager = new ManagerTaxiPark("Henry", 4);
        ParkTaxi park = new ParkTaxi(manager);


        List<Car> auto = new ArrayList<>();
        try {
            auto.add(new CarHeavy());
            auto.add(new CarLite("Volvo", 3000, 2, WheelDrive.BACK_DRIVE, 230, 15, 35000, 5));
        }
        catch (CarException exc) {
            System.out.println(exc.getMessage());
        }
        park.setAutoPark(auto);



        Scanner in = new Scanner(System.in);
        System.out.print("Input a max speed: ");
        int num = in.nextInt();

        List<Car> newCarArray = park.getManager().maxSpeedMoreThan(auto, num);
        for (Car item : newCarArray) {
            System.out.println(item);
        }

    }
}
