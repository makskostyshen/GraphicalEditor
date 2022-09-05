package draw.shape.vertex.triangle;

import draw.shape.properties.ShapeProperties;
import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;

public class RightTriangle extends Triangle{

    public RightTriangle(ShapeProperties shapeProperties, Vertex[] vertices, Edge[] edges) {
        super(shapeProperties, vertices, edges);
        checkRightTriangleLogic();
    }


    private void checkRightTriangleLogic(){}
}
