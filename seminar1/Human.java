package seminar1;

import java.util.*;

public class Human {
    private String name;
    private String sex;
    private boolean liveStatus;
    private Human father;
    private Human mother;

    private LinkedHashSet<Human> children;

    public Human(String name, String sex, boolean liveStatus, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.liveStatus = liveStatus;
        this.father = father;
        this.mother = mother;

    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public boolean isLiveStatus() {
        return liveStatus;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public LinkedHashSet<Human> getChildren() {
        return children;
    }

    public void setChildrens(LinkedHashSet<Human> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                          '}';
    }

}
