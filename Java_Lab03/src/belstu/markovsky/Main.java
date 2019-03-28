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
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static {
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(Main.class);


    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

//        LOG.info("Program start...");
//
//        ManagerTaxiPark manager = new ManagerTaxiPark("Henry", 4);
//        ParkTaxi park = new ParkTaxi(manager);
//
//
//        List<Car> auto = new ArrayList<>();
//        try {
//            auto.add(new CarHeavy());
//            auto.add(new CarLite("Volvo", 3000, 2000, WheelDrive.BACK_DRIVE, 230, 15, 35000, 5));
//        }
//        catch (CarException exc) {
//            System.out.println(exc.getMessage());
//        }
//        park.setAutoPark(auto);
//
//
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a max speed: ");
//        int num = in.nextInt();
//
//        List<Car> newCarArray = park.getManager().maxSpeedMoreThan(auto, num);
//        for (Car item : newCarArray) {
//            System.out.println(item);
//        }


        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        SaxParser.AdvancedXMLHandler handler = new SaxParser.AdvancedXMLHandler();
        parser.parse(new File("files/car.xml"), handler);

        for (Car item : SaxParser.cars)
            System.out.println(item.toString());



//        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.dat")))
//        {
//            CarLite car = new CarLite("Volvo", 3000, 2, WheelDrive.BACK_DRIVE, 230, 15, 35000, 5);
//            oos.writeObject(car);
//        }
//        catch(Exception ex){
//
//            System.out.println(ex.getMessage());
//        }
//
//        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.dat")))
//        {
//            CarLite c = (CarLite)ois.readObject();
//            System.out.printf(c.getManufacturer());
//        }
//        catch(Exception ex) {
//
//            System.out.println(ex.getMessage());
//        }
    }
}
