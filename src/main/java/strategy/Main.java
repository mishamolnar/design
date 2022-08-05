package strategy;

import strategy.behaviors.AdminUnsubscribe;
import strategy.userImpl.IdentityUser;


//The Strategy Pattern defines a family of algorithms,
//encapsulates each one, and makes them interchangeable.
//Strategy lets the algorithm vary independently from
//clients that use it.
public class Main {
    public static void main(String[] args) {
       User identityUser = new IdentityUser("Bob");
       identityUser.register();
       identityUser.performUnsubscribe();
       identityUser.setUnsubscribeBehavior(new AdminUnsubscribe());
       identityUser.performUnsubscribe();
    }
}
