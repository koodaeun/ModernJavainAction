package basic.section09.koo.overriding;

public class CarMain {
        public static void main(String[] args) {
            ElectricCar electricCar = new ElectricCar();
            electricCar.move();
            GasCar gasCar = new GasCar();
            gasCar.move();
        }

}
