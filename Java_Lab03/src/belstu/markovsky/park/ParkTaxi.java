package belstu.markovsky.park;

import belstu.markovsky.car.Car;
import belstu.markovsky.manager.ManagerTaxiPark;

import java.util.ArrayList;
import java.util.List;

public class ParkTaxi {

    // ==========================================================================

    private List<Car> autoPark;
    private ManagerTaxiPark manager;

    // ==========================================================================

    public List<Car> getAutoPark() {
        return autoPark;
    }

    public void setAutoPark(List<Car> autoPark) {
        this.autoPark = autoPark;
    }

    public ManagerTaxiPark getManager() {
        return manager;
    }

    public void setManager(ManagerTaxiPark manager) {
        this.manager = manager;
    }

    // ==========================================================================

    public ParkTaxi(ManagerTaxiPark manager)
    {
        autoPark = new ArrayList<>();
        this.manager = manager;
    }

    // ==========================================================================


}
