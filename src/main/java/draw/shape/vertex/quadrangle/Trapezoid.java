package draw.shape.vertex.quadrangle;

import draw.shape.properties.ShapeProperties;
import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;

public class Trapezoid extends Quadrangle{

    public Trapezoid(ShapeProperties shapeProperties, Vertex[] vertices, Edge[] edges) {
        super(shapeProperties, vertices, edges);
        checkTrapezoidLogic();
    }

    private void checkTrapezoidLogic() {
    }
}
