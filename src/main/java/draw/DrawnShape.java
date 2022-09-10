package draw;

import lombok.Getter;

@Getter
public class DrawnShape {

    private String shapeClass;

    public DrawnShape(String shapeClass) {
        this.shapeClass = shapeClass;
    }

    @Override
    public String toString() {
        return shapeClass;
    }
}
