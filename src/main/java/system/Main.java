package system;

import draw.Drawer;
import draw.shape.Shape;
import draw.shape.differential.DifferentialShape;
import draw.shape.differential.Equation;
import draw.shape.differential.ellipse.Circle;
import draw.shape.differential.ellipse.Ellipse;
import draw.shape.properties.Border;
import draw.shape.properties.Coordinates;
import draw.shape.properties.Font;
import draw.shape.properties.ShapeProperties;
import draw.shape.vertex.VertexShape;
import draw.shape.vertex.properties.Edge;
import draw.shape.vertex.properties.Vertex;
import draw.shape.vertex.quadrangle.Quadrangle;
import draw.shape.vertex.quadrangle.Trapezoid;
import draw.shape.vertex.quadrangle.rectangle.Rectangle;
import draw.shape.vertex.quadrangle.rectangle.Square;
import draw.shape.vertex.triangle.RightTriangle;
import draw.shape.vertex.triangle.Triangle;
import draw.shape.vertex.triangle.isosceles.EquilateralTriangle;
import draw.shape.vertex.triangle.isosceles.IsoscelesTriangle;

import java.util.LinkedList;
import java.util.List;

/**
 @author Maksym Kostyshen

 System - performs actions
 Drawer - actioner, draws a shape

 instances of shape are created based on their logic. Input is checked based on the Shape type.

 */
public class Main {

    public static void main(String[] args) {
        try{
            System system = new System();


            List<Shape> shapes = getTestingShapes();

            for(Shape shape: shapes){
                system.act(new Drawer(), shape);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    private static List<Shape> getTestingShapes(){
        ShapeProperties shapeProperties = new ShapeProperties(new Font(), new Border(), new Coordinates());

        Edge[] quadrangleEdges = new Edge[]{new Edge(), new Edge(), new Edge(), new Edge()};
        Edge[] triangleEdges  = new Edge[]{new Edge(), new Edge(), new Edge()};

        Vertex[] quadrangleVertices = new Vertex[]{new Vertex(), new Vertex(), new Vertex(), new Vertex()};
        Vertex[] triangleVertices  = new Vertex[]{new Vertex(), new Vertex(), new Vertex()};



        DifferentialShape differentialShape = new DifferentialShape(shapeProperties, new Equation());

        Ellipse ellipse = new Ellipse(shapeProperties, new Equation());

        Circle circle = new Circle(shapeProperties, new Equation());

        VertexShape vertexShape = new VertexShape(shapeProperties, new Vertex[]{}, new Edge[]{});

        Quadrangle quadrangle = new Quadrangle(shapeProperties, quadrangleVertices, quadrangleEdges);

        Trapezoid trapezoid = new Trapezoid(shapeProperties, quadrangleVertices, quadrangleEdges);

        Triangle triangle = new Triangle(shapeProperties, triangleVertices, triangleEdges);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(shapeProperties, triangleVertices, triangleEdges);

        RightTriangle rightTriangle = new RightTriangle(shapeProperties, triangleVertices, triangleEdges);

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(shapeProperties, triangleVertices, triangleEdges);

        Square square = new Square(shapeProperties, quadrangleVertices, quadrangleEdges);

        Rectangle rectangle = new Rectangle(shapeProperties, quadrangleVertices, quadrangleEdges);

        List<Shape> shapes = new LinkedList<>(){{
            add(differentialShape);
            add(ellipse);
            add(circle);
            add(vertexShape);
            add(quadrangle);
            add(trapezoid);
            add(triangle);
            add(rightTriangle);
            add(isoscelesTriangle);
            add(equilateralTriangle);
            add(square);
            add(rectangle);
        }};

        return shapes;
    }

}
