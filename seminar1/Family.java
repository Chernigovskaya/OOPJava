package seminar1;

import java.util.HashSet;
import java.util.Set;

public class Family extends Human{
    private Set<Family> familySet = new HashSet<>();


    public Family(String name, String sex, boolean liveStatus, Set<Family> familySet) {
        super(name, sex, liveStatus);
        this.familySet = familySet;

    }
}

