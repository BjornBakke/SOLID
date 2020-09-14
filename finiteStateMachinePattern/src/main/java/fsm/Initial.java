package fsm;

public class Initial extends State {
    public void init(StateMachine stateMachine) {
        System.out.println("Initial + initial  = Initial");
        stateMachine.changeState(0);
    }

    public void create(StateMachine stateMachine) {
        System.out.println("Initial + yesCreate  = YesCreate");
        stateMachine.changeState(1);
    }


}
