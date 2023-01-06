package HomeWork2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drevo {

    public static void addHuman(Human[] human) {
        List<Human[]> humans = new ArrayList<>();
        for (int i = 0; i < humans.size(); i++) {
            humans.addAll(Collections.singleton(human));
        }

    }
}
