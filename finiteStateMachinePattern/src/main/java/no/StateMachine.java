package no;

import java.util.List;
import java.util.Set;

public class StateMachine {
    List<Transition> transitions;
    State current;

    StateMachine(State start, List<Transition> transitions) {
        this.current = start;
        this.transitions = transitions;
    }

    void apply(Set<Condition> conditions) {
        current = getNextState(conditions);
    }

    State getNextState(Set<Condition> conditions) {
        for (Transition transition : transitions) {
            boolean currentStateMatches = transition.from.equals(current);
            boolean conditionsMatch = transition.conditions.equals(conditions);
            if (currentStateMatches && conditionsMatch) {
                return transition.to;
            }
        }
        return null;
    }
}
