package ru.amakhov.hw6.Task1;
import ru.amakhov.hw6.Task1.climbers.Climber;
import ru.amakhov.hw6.Task1.climbers.Group;
import ru.amakhov.hw6.Task1.climbers.Mountain;

public class Application {
    public static void main(String[] args) {
        Climber climber1 = new Climber("John", "Baker str 66");
        Climber climber2 = new Climber("Jack", "Nevsky 22");
        Climber climber3 = new Climber("Mike", "Nevsky 33");
        Climber climber4 = new Climber("Alex", "Nevsky 44");
        Climber climber5 = new Climber("Greg", "Nevsky 55");
        Climber climber6 = new Climber("Daniel", "Nevsky 64");
        Climber climber7 = new Climber("Kate", "Nevsky 75");

        Mountain mountain1 = new Mountain("Everest", "Russia", 1683);
        Mountain mountain2 = new Mountain("Himalayas", "China", 2617);
        Mountain mountain3 = new Mountain("Everest 3", "Italy", 163);

        Group group1 = new Group();
        group1.addClimber(climber1);
        group1.addClimber(climber2);
        group1.addClimber(climber3);
        group1.addMountain(mountain1);
        System.out.println(group1);

        Group group2 = new Group();
        group2.addMountain(mountain2);
        group2.addClimber(climber4);
        group2.addClimber(climber5);
        System.out.println(group2);

        Group group3 = new Group();
        group3.addMountain(mountain1);
        group3.addClimber(climber6);
   //     group3.addClimber(climber7);
        System.out.println(group3);


    }
}
