package draw.shape.vertex.quadrangle;

import draw.shape.vertex.VertexShape;
import draw.shape.properties.ShapeProperties;
import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;


public class Quadrangle extends VertexShape {


    public Quadrangle(ShapeProperties shapeProperties, Vertex[] vertices, Edge[] edges) {
        super(shapeProperties, vertices, edges);
        checkQuadrangleLogic();
    }

    private void checkQuadrangleLogic() {
        if(vertices.length != 4 || edges.length != 4){
            throw new IllegalArgumentException();
        }
    }


}
