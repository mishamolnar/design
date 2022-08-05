package strategy.behaviors;

public class IdentityUnsubscribe  implements UnsubscribeBehavior{
    @Override
    public void unsubscribe() {
        System.out.println("really unsubscribed");
    }
}
