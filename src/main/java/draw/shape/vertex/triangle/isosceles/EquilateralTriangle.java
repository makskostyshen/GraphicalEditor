package draw.shape.vertex.triangle.isosceles;

import draw.shape.properties.ShapeProperties;
import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;

public class EquilateralTriangle extends IsoscelesTriangle{
    
    public EquilateralTriangle(ShapeProperties shapeProperties, Vertex[] vertices, Edge[] edges) {
        super(shapeProperties, vertices, edges);
        checkEquilateralTriangleLogic();
    }

    private void checkEquilateralTriangleLogic() {
    }
}
