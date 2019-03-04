package belstu.markovsky.manager;

import belstu.markovsky.car.Car;
import belstu.markovsky.park.ParkTaxi;

import java.util.ArrayList;
import java.util.List;

public class ManagerTaxiPark {

    private String name;
    private int experience;

    // ==========================================================================

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    // ==========================================================================

    public ManagerTaxiPark(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    // ==========================================================================

    public int countParkPrice(List<Car> autoPark) {
        int sum = 0;
        for (Car item : autoPark) {
            sum += item.getPrice();
        }
        return sum;
    }

    public List<Car> sortParkByFuelConsum(List<Car> autoPark) {
        autoPark.sort(Car::compareTo);
        return autoPark;
    }

    public List<Car> maxSpeedMoreThan(List<Car> autoPark, int maxSpeed) {
        List<Car> resultList = new ArrayList<>();
        for (Car item : autoPark) {
            if (item.getMaxSpeed() > maxSpeed)
                resultList.add(item);
        }
        return resultList;
    }


}
