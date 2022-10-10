package ru.amakhov.hw6.Task1.climbers;

import java.util.Arrays;

public class Group {
    private boolean isRecruiting;
    private String[] climbers = new String[3];
    private Mountain mountain;

    public Group() {
        if (this.climbers.length > 3) {
            throw new IllegalArgumentException("В группе могут быть только 3 альпиниста");
        }


    }

    public void addMountain(Mountain mountain) {
        this.mountain = mountain;
    }





        public void addClimber (Climber climber){

            for (int i = 0; i < climbers.length; i++) {
                if (i == climbers.length) {
                    isRecruiting = true;
                }

                if (climbers[i] == null) {
                    climbers[i] = String.valueOf(climber);
                    return;
                }


            }

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
