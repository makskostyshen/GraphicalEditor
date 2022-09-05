package draw.shape.vertex.triangle.isosceles;

import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;
import draw.shape.vertex.triangle.Triangle;
import draw.shape.properties.ShapeProperties;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(ShapeProperties shapeProperties, Vertex[] vertices, Edge[] edges) {
        super(shapeProperties, vertices, edges);
        checkIsoscelesTriangleLogic();
    }

    private void checkIsoscelesTriangleLogic() {
    }
}
