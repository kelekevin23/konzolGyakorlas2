package konzol;

import java.text.Collator;
import java.util.Comparator;

public class NevComparator implements Comparator<Eszkoz> {

    @Override
    public int compare(Eszkoz egyik, Eszkoz masik) {
        Collator col = Collator.getInstance();
        return col.compare(egyik.getNev(), masik.getNev());
    }

}
