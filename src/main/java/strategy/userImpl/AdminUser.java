package strategy.userImpl;

import strategy.User;
import strategy.behaviors.AdminUnsubscribe;

public class AdminUser extends User {
    private Long staffId;

    public AdminUser(String name, Long staffId) {
        super(name);
        this.staffId = staffId;
        setUnsubscribeBehavior(new AdminUnsubscribe());
    }
}
