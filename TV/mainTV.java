package TV;

public class mainTV {
    public static void main(String[] args) {
        tv T = new tv("Sony", 42, 10, true);
        T.turnOn();
        T.turnOff();
        T.decreaseVolume();
        T.increaseVolume();
    }
}
