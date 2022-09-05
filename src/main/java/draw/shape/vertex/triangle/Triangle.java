package draw.shape.vertex.triangle;

import draw.shape.vertex.VertexShape;
import draw.shape.properties.ShapeProperties;
import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;

public class Triangle extends VertexShape {

    public Triangle(ShapeProperties shapeProperties, Vertex[] vertices, Edge[] edges) {
        super(shapeProperties, vertices, edges);
        checkTriangleLogic();
    }


    private void checkTriangleLogic(){
        if(vertices.length != 3 || edges.length != 3){
            throw new IllegalArgumentException();
        }
    }
}
