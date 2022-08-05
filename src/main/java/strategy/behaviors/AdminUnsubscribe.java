package strategy.behaviors;

public class AdminUnsubscribe implements UnsubscribeBehavior{
    @Override
    public void unsubscribe() {
        System.out.println("Admin cannot be unsubscribed");
    }
}
