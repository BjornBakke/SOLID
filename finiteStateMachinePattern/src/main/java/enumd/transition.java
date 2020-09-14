package enumd;

import java.util.ArrayList;
import java.util.List;

public class transition {
    public static void main(String[] args) {
        State transition[][] = {
                //  YesApp               YesCreate               Initial
                {
                        State.Initial, State.Final, State.Error
                }, {
                State.Final, State.Initial, State.Error
        }
        };

        List<State> states = new ArrayList<State>();
        states.add(State.Initial);


    }
}
