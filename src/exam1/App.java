package exam1;

import exam1.base.Client;
import exam1.base.Fitness;
import exam1.base.Subscription;
import exam1.enums.FitnessZone;
import exam1.enums.Type;

public class App {
    public static void main(String[] args) {
        Fitness fitness = new Fitness();

        Client client1 = new Client("James", "Lee", 1999);
        Client client2 = new Client("Jessica", "Hype", 1985);
        Client client3 = new Client("Jorge", "Loo", 2000);
        Client client4 = new Client("Alex", "Kee", 1990);
        Client client5 = new Client("Kate", "Ryan", 1973);
        Client client6 = new Client("Michael", "Flash", 1983);
        Client client7 = new Client("Alma", "Key", 2000);
        Client client8 = new Client("Jack", "Swim", 2000);
        Client client9 = new Client("Jorge", "Loo", 2000);
        Client client10 = new Client("Jorge", "Left", 2000);

        Subscription subscription1 = new Subscription(client1, Type.FULlTIME);
        Subscription subscription2 = new Subscription(client2, Type.DAYTIME);
        Subscription subscription3 = new Subscription(client3, Type.ONETIME);
        Subscription subscription4 = new Subscription(client4, Type.FULlTIME);
        Subscription subscription5 = new Subscription(client5, Type.FULlTIME);
        Subscription subscription6 = new Subscription(client6, Type.FULlTIME);
        Subscription subscription7 = new Subscription(client7, Type.FULlTIME);
        Subscription subscription8 = new Subscription(client8, Type.FULlTIME);
        Subscription subscription9 = new Subscription(client9, Type.FULlTIME);
        Subscription subscription10 = new Subscription(client10, Type.FULlTIME);

        fitness.choseZone(subscription1, FitnessZone.SWIM);
        fitness.choseZone(subscription2, FitnessZone.GYM);
        fitness.choseZone(subscription3, FitnessZone.GROUP_EXERCISE);
        fitness.choseZone(subscription4, FitnessZone.GROUP_EXERCISE);
        fitness.choseZone(subscription5, FitnessZone.GROUP_EXERCISE);
        fitness.choseZone(subscription6, FitnessZone.GYM);
        fitness.choseZone(subscription7, FitnessZone.GYM);
        fitness.choseZone(subscription8, FitnessZone.GYM);
        fitness.choseZone(subscription9, FitnessZone.GYM);
        fitness.choseZone(subscription10, FitnessZone.GYM);

        fitness.visitors();
    }
}
