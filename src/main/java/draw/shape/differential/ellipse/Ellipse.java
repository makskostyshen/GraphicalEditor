package draw.shape.differential.ellipse;

import draw.shape.differential.Equation;
import draw.shape.differential.DifferentialShape;
import draw.shape.properties.ShapeProperties;

public class Ellipse extends DifferentialShape {

    public Ellipse(ShapeProperties shapeProperties, Equation equation) {
        super(shapeProperties, equation);
        checkEllipseEquation();
    }

    private void checkEllipseEquation(){}
}
