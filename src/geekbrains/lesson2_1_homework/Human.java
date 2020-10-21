package geekbrains.lesson2_1_homework;

public class Human implements Competitors {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeigth;
    private boolean active;
public  Human(String name,int maxRunDistance,int maxJumpHeigth) {
    this.name = name;
    this.maxRunDistance = maxRunDistance;
    this.maxJumpHeigth = maxJumpHeigth;
    this.active = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return ("Человек " + name + " удачно приодолел дистанцию на беговой дорожке!");
        } else {
            active = false;
            return ("Человек " + name + " не справился с забегом!Человек " + name + " выбывает...");

        }
    }
    @Override
    public String jump(int height) {
        if (height <= maxJumpHeigth) {
            return ("Человек " + name + " справился с высотой!");
        } else {
            active = false;
            return (name + " не справился с высотой!Человек " + name + " выбывает...");
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



