package no;


import java.util.Set;

public class Transition {
    State from;
    Set<Condition> conditions;
    State to;

    public Transition(State from, Set<Condition> conditions) {
        this.from = from;
        this.conditions = conditions;
    }
}
