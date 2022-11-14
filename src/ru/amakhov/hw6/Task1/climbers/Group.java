package ru.amakhov.hw6.Task1.climbers;

import java.util.Arrays;

public class Group {
    public boolean isRecruiting;
    private String[] climbers = new String[3];
    private Mountain mountain;

    public Group() {
        isRecruiting = true;
        if (this.climbers.length > 3) {
            throw new IllegalArgumentException("В группе могут быть только 3 альпиниста");
        } else if (this.climbers.length == 3) {

        }
    }

    public void addMountain(Mountain mountain) {
        this.mountain = mountain;
    }


        public void addClimber (Climber climber) {

            for (int i = 0; i < climbers.length; i++) {
                if (climbers[i] == null) {
                    climbers[i] = String.valueOf(climber);
                    return;
                }
            }
            isRecruiting = false;
            System.out.println("Набор закрыт!");
        }

    @Override
    public String toString() {
        return "Group{" +
                "isRecruiting=" + isRecruiting +
                ", climbers=" + Arrays.toString(climbers) +
                ", mountain=" + mountain +
                '}';
    }
}
