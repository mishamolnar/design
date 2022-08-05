package seventeen;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Future {
    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> System.out.println("FUTURE" + Thread.currentThread().getName()))
                .join();

        CompletableFuture<Integer> integerCompletableFuture =
                CompletableFuture.supplyAsync(Future::getRandom);

    }

    public static int getRandom() {
        return new Random().nextInt(100);
    }
}
