package belstu.markovsky.manager;

import belstu.markovsky.car.Car;
import belstu.markovsky.car.CarHeavy;
import belstu.markovsky.car.CarLite;
import belstu.markovsky.enums.WheelDrive;
import belstu.markovsky.park.ParkTaxi;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManagerTaxiParkTest {

    @Test
    public void countParkPrice() {
        ManagerTaxiPark manager = new ManagerTaxiPark("Garry", 3);
        ParkTaxi park = new ParkTaxi(manager);


        List<Car> auto = new ArrayList<>();
        auto.add(new CarHeavy());
        auto.add(new CarLite());

        Assert.assertTrue(manager.countParkPrice(auto) == 20000);
    }


    @Test
            (timeout = 100)
    public void sortParkByFuelConsum() {
        ManagerTaxiPark manager = new ManagerTaxiPark("Vladimir", 3);
        ParkTaxi park = new ParkTaxi(manager);

        List<Car> carList = new ArrayList<>();
        carList.add(new CarLite("Volvo", 3000, 2000, WheelDrive.BACK_DRIVE, 230,
                17, 35000, 5));
        carList.add(new CarHeavy());


        List<Car> newList = manager.sortParkByFuelConsum(carList);


        List<Car> resultList = new ArrayList<>();
        carList.add(new CarHeavy());
        carList.add(new CarLite("Volvo", 3000, 2000, WheelDrive.BACK_DRIVE, 230,
                17, 35000, 5));

        Assert.assertEquals(resultList, newList);
    }
}