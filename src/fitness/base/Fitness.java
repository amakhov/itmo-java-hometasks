package fitness.base;

import fitness.enums.FitnessZone;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import static fitness.enums.FitnessZone.*;

public class Fitness {

    Subscription subscription;
    public Subscription[] zoneSwim = new Subscription[5];
    public Subscription[] zoneGym = new Subscription[5];
    public Subscription[] zoneGroup = new Subscription[5];
    static LocalTime startWork = LocalTime.of(8, 00);
    static LocalTime finishWork = LocalTime.of(22,00);

    public void choseZone (Subscription subscription, FitnessZone zoneChose) {

        if (checkSubscriptionTerm(subscription) == 0) {
            System.out.println("Абонемент неактивен");
            return;
        }


        if (checkZone(subscription, zoneChose) == 1) {
            System.out.println("Доступ в зону открыт");
        } else {
            System.out.println("Нет доступа");
            return;
        }

        System.out.println(checkOccupancy(zoneChose));
        if (checkOccupancy(zoneChose) == 0) {
            System.out.println("Зал переполнен");
            return;
        }

        if (zoneChose == SWIM) {
            for (int i = 0; i < zoneSwim.length; i++) {
                if(zoneSwim[i] == null) {
                    zoneSwim[i] = subscription;
                    System.out.println("Абонемент " + subscription.getClient() + " зарегистрирован в бассейне");
                    return;
                }
            }
        } else if (zoneChose == GYM) {
            for (int i = 0; i < zoneSwim.length; i++) {
                if(zoneGym[i] == null) {
                    zoneGym[i] = subscription;
                    System.out.println("Абонемент " + subscription.getClient() + " зарегистрирован в тренажерном зале");
                    return;
                }
            }

        } else if (zoneChose == GROUP_EXERCISE) {
            for (int i = 0; i < zoneSwim.length; i++) {
                if(zoneGym[i] == null) {
                    zoneGym[i] = subscription;
                    System.out.println("Абонемент " + subscription.getClient() + " зарегистрирован в зале групповых занятий");
                    return;
                }
            }

        } else {
            System.out.println("Не выбрана зона");
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
        int visitors = zoneSwim.length;
        if (zoneChoice == SWIM) {
          for (Subscription i: zoneSwim) {
              visitors--;
              if (i == null) {
                  return visitors;
              }
            }
        }

        if (zoneChoice == GYM) {
            for (Subscription i: zoneGym) {
                visitors--;
                if (i == null) {
                    return visitors;
                }
            }
        }

        if (zoneChoice == GROUP_EXERCISE) {
            for (Subscription i: zoneGroup) {
                visitors--;
                if (i == null) {
                    return visitors;
                }
            }
        }
        return 0;
    }

    public void visitors() {
        System.out.println("Посетители тренажерного зала: " + LocalDate.now() );
        for (Subscription i: zoneGym) {
            if (i == null) break;
            System.out.println(i.getClient());
        }

        System.out.println("\nПосетители бассеина: " + LocalDate.now());
        for (Subscription i: zoneSwim) {
            if (i == null) break;
            System.out.println(i.getClient());
        }

        System.out.println("\nПосетители групповых занятий: " + LocalDate.now());
        for (Subscription i: zoneGroup) {
            if (i == null) break;
            System.out.println(i.getClient());
        }
    }

    public static void isWorkFitness() {
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        if (timeNow.isAfter(startWork) && timeNow.isBefore(finishWork)) {
            System.out.println("Фитнес работает");
        } else {
            System.out.println("Не работает.");
        }
    }

    public static void main(String[] args) {
        isWorkFitness();

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
