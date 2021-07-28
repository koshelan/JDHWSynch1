import java.util.ArrayList;
import java.util.List;

public class Stock {

    public static final int TIME_OF_SELLING = 500;

    Showroom showroom;
    List<Car> cars = new ArrayList<>();


    public Stock(Showroom showroom) {
        this.showroom = showroom;
    }

    public synchronized Car sellCar() {
        try {
            if (cars.isEmpty()) {
                System.out.printf("для клиента %s Нет авто в наличии! ждите\n", Thread.currentThread().getName());
                while (cars.isEmpty()) {
                    wait();
                }
            }
            System.out.println("Автомобиль " + cars.get(0) + " продан ");
            return cars.remove(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public synchronized void receiveCar(Car car) {
        try {
            System.out.println("Приход Авто в австосалон");
            cars.add(car);
            System.out.printf("на складе %s авто\n", cars.size());
            notify();
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

}
