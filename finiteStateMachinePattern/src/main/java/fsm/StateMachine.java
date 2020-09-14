package fsm;

public class StateMachine {
    private State[] states = {new Initial(), new YesCreate(), new YesApp()};

    private int current = 0;

    public void initial() {
        states[current].init(this);
    }

    public void yesCreate() {
        states[current].create(this);
    }

    public void yesApp() {
        states[current].delete(this);
    }

    public void changeState(int index) {
        current = index;
    }

}
