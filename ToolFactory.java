import java.util.HashMap;

/**
 * Created by Josh on 01/12/2018.
 */
public class ToolFactory {

    public static final HashMap<String, Hammer> hammerMap = new HashMap<>();

    public static Tool getHammer(String colour) {
        Hammer hammer = hammerMap.get(colour);
        if(hammer == null) {
            hammer = new Hammer(colour);
            hammerMap.put(colour, hammer);
            System.out.println("Creating a " + colour + " hammer");
        }
        return hammer;
    }

}
