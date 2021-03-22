package ru.geekbrains.hw8;

public class Human implements Participant {
    protected boolean inCompetition = true;
    protected int maxDistance;
    protected double maxHeight;
    protected String name;
    protected String being = "Человек";

    public Human(String name, int maxDistance, double maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (maxDistance >= treadmill.getLength() && inCompetition) {
            System.out.println(being + " " + name + " успешно пробежал дистанцию " + treadmill.getLength() + " м.");
        } else if (maxDistance < treadmill.getLength() && inCompetition) {
            inCompetition = false;
            System.out.println(being + " " + name + "  не смог пробежать " + treadmill.getLength() + " и выбыл из соревнований.");
        }
    }

    @Override
    public void jump(Wall wall) {
        if (maxDistance >= wall.getHeight() && inCompetition) {
            System.out.println(being + " " + name + " успешно перепрыгнул препятствие высотой " + wall.getHeight() + " м.");
        } else if (maxDistance < wall.getHeight() && inCompetition) {
            inCompetition = false;
            System.out.println(being + " " + name + "  не смог перепрыгнуть препятствие высотой " + wall.getHeight() + " м. и выбыл из соревнований.");
        }

    }
}
