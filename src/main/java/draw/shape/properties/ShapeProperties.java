package draw.shape.properties;

public class ShapeProperties {

    private Font font;
    private Border border;
    private Coordinates coordinates;

    public ShapeProperties(Font font, Border border, Coordinates coordinates) {
        this.font = font;
        this.border = border;
        this.coordinates = coordinates;
    }
}
