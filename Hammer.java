/**
 * Created by Josh on 01/12/2018.
 */
public class Hammer implements Tool {

    private Integer width, height;
    private String colour;


    public Hammer(String colour) {
        this.colour = colour;
    }

    public Hammer(Integer width, Integer height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    @Override
    public void create() {
        if(height == null || width == null) {
            System.out.println("A " + colour  + " Hammer has been created.");
        } else {
            System.out.println("A " + colour  + " Hammer has been created that is: \n " + width + "cm in width" + height + "cm in height\n");


        }
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
