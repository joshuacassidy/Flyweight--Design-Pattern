/**
 * Created by Josh on 01/12/2018.
 */
public class Main {

    private static final String colors[] = { "Red", "Yellow", "Green", "Purple", "Pink", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Tool hammer = ToolFactory.getHammer(getRandomColor());
            hammer.create();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
