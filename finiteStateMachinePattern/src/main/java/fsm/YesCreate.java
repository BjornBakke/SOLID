package fsm;

public class YesCreate extends State {
    public void init(StateMachine stateMachine) {
        System.out.println("YesCreate + initial  = Initial");
        stateMachine.changeState(0);
    }

    public void create(StateMachine stateMachine) {
        System.out.println("YesCreate + yesCreate = YesCreate");
        stateMachine.changeState(1);
    }

    public void delete(StateMachine stateMachine) {
        System.out.println("YesCreate + yesApp = YesApp");
        stateMachine.changeState(2);
    }
}
