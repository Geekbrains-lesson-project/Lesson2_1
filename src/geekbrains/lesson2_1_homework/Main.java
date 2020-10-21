package geekbrains.lesson2_1_homework;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Дымок",900,300);
        Cat cat2 = new Cat("Базазилио",650,200);
        Human human1 = new Human("Роман",5000,500);
        Human human2 = new Human("Иван",4000,300);
        Robot robot1 = new Robot ("T-1000",10000,1000);
        Robot robot2 = new Robot ("Валли",55000,100);

        Course c = new Course(new Treadmill(1000), new Wall(300),new Treadmill(100)); // Создаем полосу препятствий
        Team team = new Team("Пестрая команда",robot2,cat1,human1,cat2,human2,robot1); // Создаем команду
            c.doIt(team); // Просим команду пройти полосу испытаний
            team.showResults(); // Показываем результаты
    }
}
