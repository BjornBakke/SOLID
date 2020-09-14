package fsm;

public class Runner {

    public static final int DELETE = 2;
    public static final int CREATE = 1;
    public static final int INITIAL = 0;

    public static void main(String[] args) {
        StateMachine stateMachine = new StateMachine();
        int[] transitions = {INITIAL, DELETE, INITIAL, CREATE, DELETE, DELETE};
        for (int transition : transitions)
            if (transition == INITIAL) {
                stateMachine.initial();
            } else if (transition == CREATE) {
                stateMachine.yesCreate();
            } else if (transition == DELETE) {
                stateMachine.yesApp();
            }
    }
}
