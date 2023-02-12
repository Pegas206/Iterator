import java.util.Iterator;
import java.util.Random;

public class Randoms implements java.lang.Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }


    @Override
    public Iterator<Integer> iterator() {
        Random random = new Random();
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Object next() {
                return min + random.nextInt(max - min);
            }
        };
    }
}
