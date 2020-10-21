package geekbrains.lesson2_1_homework;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        Competitors[] competitors = team.getCompetitors();
        if(competitors.length == 0) {
            System.out.println("В команде никого нет =(...");
            return;
        }
        for (Competitors c: competitors) {
            for (Obstacle o:obstacles) {
                team.setResult(o.doIt(c));
                if(!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}