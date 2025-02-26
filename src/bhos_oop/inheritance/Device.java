package inheritance;

abstract class Device {
        public String brand;
        public Device(String brand) {
            this.brand = brand;
        }
        public abstract void powerOn();

        public void powerOff() {
            System.out.println(brand + "'s power is off");
        }
}
