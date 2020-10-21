package geekbrains.lesson2_1_homework;

public class Cat implements Competitors {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeigth;
    private boolean active;

    public Cat (String name,int maxRunDistance,int maxJumpHeigth) {  //
        this.name =name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
        this.active = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return ("Кот " + name + " удачно приодолел дистанцию на беговой дорожке!");
        } else {
            active = false;
            return ("Кот " + name + " не справился с забегом!Кот " + name + " выбывает...");

        }
    }
    @Override
    public String jump(int height) {
        if (height <= maxJumpHeigth) {
            return ("Кот " + name + " справился с высотой!");
        } else {
            active = false;
            return ("Кот " + name + " не справился с высотой!Кот " + name + " выбывает...");
        }
    }
    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}


