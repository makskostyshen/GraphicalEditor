package draw.shape.differential;

import draw.shape.Shape;
import draw.shape.properties.ShapeProperties;

public class DifferentialShape extends Shape {

    protected Equation equation;

    public DifferentialShape(ShapeProperties shapeProperties, Equation equation) {
        super(shapeProperties);
        this.equation = equation;
    }

    private void checkEquation(){
        System.out.println("equationIsChecked");
    }
}
