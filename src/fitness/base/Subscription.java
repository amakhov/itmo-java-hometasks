package fitness.base;

import fitness.enums.FitnessZone;
import fitness.enums.Type;

import java.time.LocalDate;
import java.util.Arrays;

import static fitness.enums.FitnessZone.*;
import static fitness.enums.Type.*;

public class Subscription {

    private Client client;
    private final Type typeSubscription;
    public LocalDate dateReg;
    public LocalDate dateEnd;

    public FitnessZone zoneAccess[] = new FitnessZone[3];

    public Subscription(Client client, Type typeSubscription) {
        setClient(client);
        this.typeSubscription = typeSubscription;

        dateReg = LocalDate.now();

        if (typeSubscription == ONETIME) {
             dateEnd = LocalDate.now();
             zoneAccess[0] = SWIM;
             zoneAccess[1] = GYM;
        } else if (typeSubscription == DAYTIME) {
             dateEnd = LocalDate.now().plusDays(365);
             zoneAccess[0] = GYM;
             zoneAccess[1] = GROUP_EXERCISE;
        } else if (typeSubscription == FULlTIME) {
             dateEnd = LocalDate.now().plusDays(180);
             zoneAccess[0] = GYM;
             zoneAccess[1] = GROUP_EXERCISE;
             zoneAccess[2] = SWIM;
        } else {
            throw new IllegalArgumentException("Не выбран тип абонемента");
        }

    }

    public void setClient(Client client) {
        if (client == null) {
            throw  new IllegalArgumentException("client не может быть null");
        }
        this.client = client;
    }

    public FitnessZone[] getZone (Subscription subscription) {
        if (subscription.typeSubscription == ONETIME) {
            return subscription.zoneAccess;
        } else if (subscription.typeSubscription == DAYTIME) {
            return subscription.zoneAccess;
        } else if (subscription.typeSubscription == FULlTIME) {
            return subscription.zoneAccess;
        } else {
            throw new IllegalArgumentException("Не выбран тип абонемента");
        }

    }

    public String getClient() {
        return client.getFirstLastName();
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "client=" + client +
                ", typeSubscription=" + typeSubscription +
                ", dateReg=" + dateReg +
                ", dateEnd=" + dateEnd +
                ", zoneAccess=" + Arrays.toString(zoneAccess) +
                '}';
    }
}
