package belstu.markovsky;

import belstu.markovsky.car.CarHeavy;
import belstu.markovsky.enums.WheelDrive;
import belstu.markovsky.exception.CarException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

    static {
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(Main.class);


    public static void main(String[] args) {

        LOG.info("Program start...");
        try {
            CarHeavy carHeavy = new CarHeavy("Mercedes", 7000, 4000,
                    WheelDrive.FULL_DRIVE, 180, 9, 8000, 4000);


        } catch (CarException e) {
            e.printStackTrace();
        }


    }
}
