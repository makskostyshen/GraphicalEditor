package draw.shape.vertex;

import draw.shape.Shape;
import draw.shape.properties.ShapeProperties;
import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;

public class VertexShape extends Shape {

    protected Vertex[] vertices;
    protected Edge[] edges;

    public VertexShape(ShapeProperties shapeProperties, Vertex[] vertices, Edge[] edges) {
        super(shapeProperties);
        this.vertices = vertices;
        this.edges = edges;
        checkTriangleLogic();
    }


    private void checkTriangleLogic(){
        if(vertices.length != edges.length){
            throw new IllegalArgumentException();
        }
    }
}
