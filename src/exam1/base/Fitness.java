package exam1.base;

import exam1.enums.FitnessZone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import static exam1.enums.FitnessZone.*;

public class Fitness {

    Subscription subscription;
    public Subscription[] zoneSwim = new Subscription[5];
    public Subscription[] zoneGym = new Subscription[5];
    public Subscription[] zoneGroup = new Subscription[5];
    static LocalTime startWork = LocalTime.of(8, 00);
    static LocalTime finishWork = LocalTime.of(22,00);

    public void choseZone (Subscription subscription, FitnessZone zoneChose) {

        if (!isWorkFitness()) return;

        if (checkSubscriptionTerm(subscription) == 0) {
            System.out.println("Абонемент неактивен");
            return;
        }

        if (checkZone(subscription, zoneChose) == 1) {
            System.out.println("Доступ в зону " + zoneChose + " открыт для " + subscription.getClient());
        } else {
            System.out.println("Нет доступа в " + zoneChose + " для " + subscription.getClient() + "\n");
            return;
        }

        if (checkOccupancy(zoneChose) == 0) {
            System.out.println("Зал переполнен\n");
            return;
        }

        if (zoneChose == SWIM) {
            for (int i = 0; i < zoneSwim.length; i++) {
                if(zoneSwim[i] == null) {
                    zoneSwim[i] = subscription;
                    System.out.println("Абонемент " + subscription.getClient() + " зарегистрирован в бассейне\n");
                    return;
                }
            }
        } else if (zoneChose == GYM) {
            for (int i = 0; i < zoneSwim.length; i++) {
                if(zoneGym[i] == null) {
                    zoneGym[i] = subscription;
                    System.out.println("Абонемент " + subscription.getClient() + " зарегистрирован в тренажерном зале\n");
                    return;
                }
            }

        } else if (zoneChose == GROUP_EXERCISE) {
            for (int i = 0; i < zoneGroup.length; i++) {
                if(zoneGroup[i] == null) {
                    zoneGroup[i] = subscription;
                    System.out.println("Абонемент " + subscription.getClient() + " зарегистрирован в зале групповых занятий\n");
                    return;
                }
            }

        } else {
            System.out.println("Не выбрана зона\n");
        }
    }

    private int checkSubscriptionTerm (Subscription subscription) {
        LocalDate today = LocalDate.now();
        if (today.isEqual(subscription.dateReg) || (today.isAfter(subscription.dateReg) && today.isBefore(subscription.dateEnd))) {
            return 1;
        } else {
            return 0;
        }
    }

    private int checkZone(Subscription subscription, FitnessZone zoneChoice) {

        for (FitnessZone i: subscription.getZone(subscription)) {
            if (zoneChoice == i) {
                return 1;
            }
        }
        return 0;
    }

    private int checkOccupancy(FitnessZone zoneChoice) {
        int visitorsSwim = zoneSwim.length, visitorsGym = zoneSwim.length, visitorsGroup = zoneSwim.length;

        if (zoneChoice == SWIM) {
          for (Subscription i: zoneSwim) {
              visitorsSwim--;
              if (i == null) {
                  return visitorsSwim;
              }
            }
        }

        if (zoneChoice == GYM) {
            for (Subscription i: zoneGym) {
                visitorsGym--;
                if (i == null) {
                    return visitorsGym;
                }
            }
        }

        if (zoneChoice == GROUP_EXERCISE) {
            for (Subscription i: zoneGroup) {
                visitorsGroup--;
                if (i == null) {
                    return visitorsGroup;
                }
            }
        }
        return 0;
    }

    public static String formatDateAndTime() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        String localDateTimeString = localDateTime.format(DateTimeFormatter.ofPattern("dd MMM hh:mm"));
        return localDateTimeString;
    }

    public void visitors() {
        System.out.println("Посетители тренажерного зала - " + formatDateAndTime());
        
        for (Subscription i: zoneGym) {
            if (i == null) break;
            System.out.println(i.getClient());
        }

        System.out.println("\nПосетители бассеина - " + formatDateAndTime());
        for (Subscription i: zoneSwim) {
            if (i == null) break;
            System.out.println(i.getClient());
        }

        System.out.println("\nПосетители групповых занятий - " + formatDateAndTime());
        for (Subscription i: zoneGroup) {
            if (i == null) break;
            System.out.println(i.getClient());
        }
    }

    private boolean isWorkFitness() {
        LocalTime timeNow = LocalTime.now();
        if (timeNow.isAfter(startWork) && timeNow.isBefore(finishWork)) {
            return true;
        } else {
            System.out.println("Фитнес не работает");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Fitness{" +
                "zoneSwim=" + Arrays.toString(zoneSwim) +
                ", zoneGym=" + Arrays.toString(zoneGym) +
                ", zoneGroup=" + Arrays.toString(zoneGroup) +
                '}';
    }
}
