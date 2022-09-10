package draw.shape;

import draw.shape.properties.ShapeProperties;
import tools.ToolArgument;


public abstract class Shape implements ToolArgument {

    protected ShapeProperties shapeProperties;

    protected Shape(ShapeProperties shapeProperties) {
        this.shapeProperties = shapeProperties;
    }
}
