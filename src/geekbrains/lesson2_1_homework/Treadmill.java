package geekbrains.lesson2_1_homework;

public class Treadmill extends Obstacle{
    private int length;

    public Treadmill (int length) {
        this.length = length;
    }

    @Override
    String  doIt(Competitors competitors) {
        return competitors.run(length);
    }
}
