package OOP;

import java.time.LocalDate;

public class TestCar {
    public static void main(String[] args) {
        var malibu = new Car("Malibu", 30000000, 200, LocalDate.of(2015, 5, 15));
        System.out.println("Car Name:" + malibu.getName() + ", Price: " + malibu.getPrice() + ", Speed: " + malibu.getSpeed() + ", Manufactory Date: " + malibu.getManufactoryDate());
        System.out.println("After the car is update");
        malibu.setName("Malibu");
        malibu.setPrice(450000000);
        malibu.setSpeed(220);
        malibu.setManufactoryDate(LocalDate.of(2020, 5, 30));
        System.out.println("Car name:" + malibu.getName() + ", Price: " + malibu.getPrice() + ", Speed: " + malibu.getSpeed() + " Manufactory Date:" + malibu.getManufactoryDate());
        var cobalt = new Car("Cobalt", 140000000, 180, LocalDate.of(2016, 5, 16));
        System.out.println("Car name:" + cobalt.getName() + ", Price:" + cobalt.getPrice() + ",Speed:" + cobalt.getSpeed() + ",Mabufactory Date:" + malibu.getManufactoryDate());
        cobalt.setName("Cobalt");
        cobalt.setPrice(170000000);
        cobalt.setSpeed(200);
        cobalt.setManufactoryDate(LocalDate.of(2020, 11, 11));
        System.out.println("After the car is update");
        System.out.println("Car name:" + cobalt.getName() + ",Price:" + cobalt.getPrice() + ",Speed:" + cobalt.getSpeed() + ",Manufactory Date:" + cobalt.getManufactoryDate());

    }
}
