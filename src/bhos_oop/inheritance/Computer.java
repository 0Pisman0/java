package inheritance;

class Computer extends Device {
    final String operatingSystem;

    public Computer(String brand, String operatingSystem) {
        super(brand);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void powerOn() {
        System.out.println(brand + " computer is booting up with " + operatingSystem + ".");
    }

    public void compileCode() {
        System.out.println(brand + " is compiling code...");
    }
}
