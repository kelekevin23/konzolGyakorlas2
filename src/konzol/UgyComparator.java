package konzol;

import java.util.Comparator;

public class UgyComparator implements Comparator<Harcos> {

    @Override
    public int compare(Harcos egyik, Harcos masik) {

        return egyik.getUgyesseg() - masik.getUgyesseg();
    }

}
