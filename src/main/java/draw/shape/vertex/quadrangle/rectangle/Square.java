package draw.shape.vertex.quadrangle.rectangle;

import draw.shape.properties.ShapeProperties;
import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;

public class Square extends Rectangle{

    public Square(ShapeProperties shapeProperties, Vertex[] vertices, Edge[] edges) {
        super(shapeProperties, vertices, edges);
        checkSquareLogic();
    }

    private void checkSquareLogic() {
    }
}
