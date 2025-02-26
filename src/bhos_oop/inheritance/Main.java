package inheritance;

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer("HP","Linux");
        pc.powerOn();
        pc.compileCode();
        pc.powerOff();
        System.out.println();

        Smartphone phone = new Smartphone("Samsung",true);
        phone.powerOn();
        phone.makeCall("0501110000");
        phone.powerOff();

    }
}
