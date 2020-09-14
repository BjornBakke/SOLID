package fsm;

public abstract class State {
    // 6. Default behavior
    public void init(StateMachine stateMachine) {
        System.out.println("error");
    }

    public void create(StateMachine stateMachine) {
        System.out.println("error");
    }

    public void delete(StateMachine stateMachine) {
        System.out.println("error");
    }
}

