public class Showroom {

    Stock stock = new Stock(this);

    public void receiveCar(Car car) {
        stock.receiveCar(car);
    }

    public void sellCar() {
        if (stock.sellCar() != null) {
            System.out.printf("клиент %s купил автомобиль\n", Thread.currentThread().getName());
        }
    }

}
