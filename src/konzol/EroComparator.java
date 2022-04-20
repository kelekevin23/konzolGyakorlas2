package konzol;

import java.util.Comparator;

public class EroComparator implements Comparator<Harcos> {

    @Override
    public int compare(Harcos egyik, Harcos masik) {
        return egyik.getEro() - masik.getEro();
    }

}
