package draw.shape.vertex.quadrangle.rectangle;

import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;
import draw.shape.vertex.quadrangle.Quadrangle;
import draw.shape.properties.ShapeProperties;

public class Rectangle extends Quadrangle {

    public Rectangle(ShapeProperties shapeProperties, Vertex[] vertices, Edge[] edges) {
        super(shapeProperties, vertices, edges);
        checkRectangleLogic();
    }

    private void checkRectangleLogic() {
    }
}
