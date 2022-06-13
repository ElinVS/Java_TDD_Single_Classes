public class WaterBottle {

    //property
    private int volume;

    //constructor
    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getDecreasedVolume() {
        return this.volume - 10;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}




