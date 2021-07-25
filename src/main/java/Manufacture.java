public class Manufacture extends Thread implements Runnable {

    public static final int PRODUCTION_TIME = 2000;
    public static final int NUMBER_OF_CARS = 10;

    private Showroom showroom;


    public Manufacture(Showroom showroom) {
        this.showroom = showroom;
    }

    int id = 0;

    @Override
    public void run() {
        for (int i = 0; i < NUMBER_OF_CARS; i++) {
            showroom.receiveCar(produce());
        }

    }

    private Car produce() {
        try {
            System.out.println("Производство машины началось");
            Thread.sleep(PRODUCTION_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Car("VV".concat(String.valueOf(id++)), "Corola");
    }
}
