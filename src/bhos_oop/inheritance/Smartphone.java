package inheritance;

class Smartphone extends Device {
    final boolean has5G;

    public Smartphone(String brand, boolean has5G) {
        super(brand);
        this.has5G = has5G;
    }

    @Override
    public void powerOn() {
        System.out.println(brand + " smartphone is turning on.");
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + " using " + (has5G ? "5G" : "LTE") + " network.");
    }
}
