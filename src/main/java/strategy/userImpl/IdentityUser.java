package strategy.userImpl;

import strategy.User;
import strategy.behaviors.IdentityUnsubscribe;

import java.util.UUID;

public class IdentityUser extends User {
    private UUID uuid;

    public IdentityUser(String name) {
        super(name);
        this.uuid = new UUID(123L, 123L);
        setUnsubscribeBehavior(new IdentityUnsubscribe());
    }
}
