package seminar1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Human {
    private String name;
    private String sex;
    private boolean liveStatus;
    private Human child;
    private Human mother;
    private Human father;

    public Human(String name, String sex, boolean liveStatus) {
        this.name = name;
        this.sex = sex;
        this.liveStatus = liveStatus;

    }
    public void mother(Human human) {
        this.mother = human;
        human.child = this;
    }
    public void father(Human human) {
        this.father = human;
        human.child = this;
    }

    public void child(Human human) {
        this.child = human;
        human.father = this;
        human.mother = this;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", liveStatus=" + liveStatus +
//                ", child=" + child +
//                ", mother=" + mother +
//                ", father=" + father +
                '}';
    }
}
