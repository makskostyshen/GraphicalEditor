package draw.shape.differential.ellipse;

import draw.shape.differential.Equation;
import draw.shape.properties.ShapeProperties;

public class Circle extends Ellipse{

    public Circle(ShapeProperties shapeProperties, Equation equation) {
        super(shapeProperties, equation);
        checkCircleEquation();
    }

    private void checkCircleEquation(){}
}
