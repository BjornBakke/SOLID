package epilar;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;


public enum Transition {
    // valid transitions definition
    INITIAL(FacebookStatus.INITIAL, FacebookStatus.INITIAL),
    YES_CREATE(FacebookStatus.YES_CREATE, FacebookStatus.INITIAL),
    YES_APP(FacebookStatus.YES_APP, FacebookStatus.YES_CREATE, FacebookStatus.INITIAL),
    NO_NOT_WANTED(FacebookStatus.NO_NOT_WANTED, FacebookStatus.YES_APP, FacebookStatus.YES_CREATE, FacebookStatus.INITIAL),
    YES_CREATED(FacebookStatus.CREATED, FacebookStatus.CREATED);


    public static final Map<FacebookStatus, Map<FacebookStatus, Transition>> TRANSITION_MAP = new EnumMap<FacebookStatus, Map<FacebookStatus, Transition>>(FacebookStatus.class);

    static {
        for (FacebookStatus cs : FacebookStatus.values()) {
            TRANSITION_MAP.put(cs, new EnumMap<FacebookStatus, Transition>(FacebookStatus.class));
        }
        for (Transition trans : Transition.values()) {
            for (FacebookStatus src : trans.source) {
                TRANSITION_MAP.get(src).put(trans.destination, trans);
            }
        }
    }

    private final Collection<FacebookStatus> source;
    private final FacebookStatus destination;


    Transition(FacebookStatus destination, FacebookStatus... source) {
        this.source = Arrays.asList(source);
        this.destination = destination;
    }

    public static Map<FacebookStatus, Transition> validTransitionsFrom(FacebookStatus source) {
        return TRANSITION_MAP.get(source);
    }

    public static Transition from(FacebookStatus source, FacebookStatus destination) {
        return TRANSITION_MAP.get(source).get(destination);
    }


}
