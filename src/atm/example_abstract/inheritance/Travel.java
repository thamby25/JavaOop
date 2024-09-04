package atm.example_abstract.inheritance;

public class Travel {
    public static void main(String[] args) {
        A320 flight = new A320();
        flight.startEngine();
        flight.boarding();
        flight.fly();
        flight.altitude();
    }
}
