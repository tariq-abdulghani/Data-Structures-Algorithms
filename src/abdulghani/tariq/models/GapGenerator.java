package abdulghani.tariq.models;
import java.util.Iterator;

public class GapGenerator implements Iterable<Integer>{

    private  int arrayLength;
    private  int gap;
    private Sequence sequence;

    public GapGenerator(int arrayLength) {
        this.arrayLength = arrayLength;
        gap = arrayLength;
        sequence = new Sequence();
    }

    @Override
    public Iterator iterator() {
        return sequence;
    }

    private class Sequence implements Iterator<Integer>{

        @Override
        public boolean hasNext() {
            return gap > 1;
        }

        @Override
        public Integer next() {
            gap /= 2;
            return gap;
        }

    }
}
