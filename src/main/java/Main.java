public class Main {

    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        new Manufacture(showroom).start();

        new Thread(null, showroom::sellCar, "клиент 1").start();
        new Thread(null, showroom::sellCar, "клиент 2").start();
        new Thread(null, showroom::sellCar, "клиент 3").start();
        new Thread(null, showroom::sellCar, "клиент 4").start();
        try {
            Thread.sleep(16000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(null, showroom::sellCar, "клиент 5").start();
        new Thread(null, showroom::sellCar, "клиент 6").start();
        new Thread(null, showroom::sellCar, "клиент 7").start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(null, showroom::sellCar, "клиент 8").start();
        new Thread(null, showroom::sellCar, "клиент 9").start();
        new Thread(null, showroom::sellCar, "клиент 10").start();

    }
}
