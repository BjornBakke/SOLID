package fsm;

public class YesApp extends State {
    public void init(StateMachine stateMachine) {
        System.out.println("YesApp + initial  = YesApp");
        stateMachine.changeState(2);
    }

    public void create(StateMachine stateMachine) {
        System.out.println("YesApp + yesCreate = YesApp");
        stateMachine.changeState(2);
    }

    public void delete(StateMachine stateMachine) {
        System.out.println("YesApp + yesApp = YesApp");
        stateMachine.changeState(2);
    }
}
