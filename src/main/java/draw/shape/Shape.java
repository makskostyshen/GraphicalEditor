package draw.shape;

import draw.shape.properties.ShapeProperties;
import tools.ToolArgument;


public abstract class Shape implements ToolArgument {

    protected ShapeProperties shapeProperties;

    public Shape(ShapeProperties shapeProperties) {
        this.shapeProperties = shapeProperties;
    }

    public void draw() {
        String classShortName = getClassShortName(this.getClass().getName());

        System.out.println(classShortName);
    }


    private String getClassShortName(String longName){
        String[] packageNames = longName.split("\\.");
        return packageNames[packageNames.length -1];
    }
}
