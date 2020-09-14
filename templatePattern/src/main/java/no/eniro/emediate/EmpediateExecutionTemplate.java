package no.eniro.emediate;

public abstract class EmpediateExecutionTemplate {
    ValueObject valueObject = new ValueObject();
    boolean exists;

    abstract void init();

    abstract String add(String id);

    abstract String search(String id);

    abstract String update(String id);

    protected abstract String value();

    /* A template method : */
    public final void execute(String id) {
        init();
        // maintain order?
        String searchId = search(id);
        add(searchId);
        update(searchId);
    }
}
