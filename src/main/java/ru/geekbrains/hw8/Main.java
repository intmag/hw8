package ru.geekbrains.hw8;

public class Main {
    public static void main(String[] args) {
        Participant participant[] = new Participant[10];
        for (int i = 0; i < participant.length; i++) {
            if (i < 3) {
                participant[i] = new Human("Человек_" + (i + 1), (int) (500 + Math.random() * 3500), (0.5 + Math.random() * 1.54));
            } else if (i >= 3 && i <= 6) {
                participant[i] = new Cat("Котик_" + (i - 2), (int) (50 + Math.random() * 1500), (0.5 + Math.random() * 1));
            } else {
                participant[i] = new Robot("Робот_" + (i - 6), (int) (400 + Math.random() * 2500), (0.1 + Math.random() * 0.3));
            }
        }
        Treadmill treadmill[] = new Treadmill[5];
        Wall wall[] = new Wall[5];

        for (int i = 0; i < treadmill.length; i++) {
            treadmill[i] = new Treadmill((int) (50 + Math.random() * 3400));
        }
        for (int i = 0; i < wall.length; i++) {
            wall[i] = new Wall(0.1 + Math.random() + 1.44);
        }
        for (Participant itVal: participant) {
            for (int i = 0; i < treadmill.length; i++) {
                itVal.run(treadmill[i]);
            }
            for (int i = 0; i < wall.length; i++) {
                itVal.jump(wall[i]);
            }

        }

    }
}
