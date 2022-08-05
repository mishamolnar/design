package strategy;

import strategy.behaviors.UnsubscribeBehavior;

public abstract class User {
    private String name;

    public UnsubscribeBehavior getUnsubscribeBehavior() {
        return unsubscribeBehavior;
    }

    public void setUnsubscribeBehavior(UnsubscribeBehavior unsubscribeBehavior) {
        this.unsubscribeBehavior = unsubscribeBehavior;
    }

    private UnsubscribeBehavior unsubscribeBehavior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void register() {
        System.out.printf("User with name %s registered%n", this.name);
    }

    public void performUnsubscribe() {
        unsubscribeBehavior.unsubscribe();
    }
}
