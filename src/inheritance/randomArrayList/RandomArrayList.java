package inheritance.randomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {

    private Random random;

    public RandomArrayList(Random random) {
        this.random = random;
    }

    public Object getRandomElement() {
        int randomElement = random.nextInt(this.size());
        Object object = this.remove(randomElement);
        return object;
    }
}
