package geekbrains.lesson2_1_homework;

public class Wall extends Obstacle {
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    String doIt(Competitors competitors) {
        return competitors.jump(heigth);
    }
}