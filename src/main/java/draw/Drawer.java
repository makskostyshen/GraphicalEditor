package draw;

import draw.shape.Shape;
import tools.Tool;
import tools.ToolArgument;

public class Drawer implements Tool {

    @Override
    public void accomplish(ToolArgument toolArgument) {

        if(! (toolArgument instanceof Shape)){
            throw new IllegalArgumentException();
        }

        Shape shape = (Shape) toolArgument;
        DrawnShape drawnShape = getDrawnShape(shape);
        System.out.println(drawnShape);
    }


    public DrawnShape getDrawnShape(Shape shape){
        String classFullName = shape.getClass().getName();

        String[] packageNames = classFullName.split("\\.");
        String classShortName = packageNames[packageNames.length -1];

        return new DrawnShape(classShortName);
    }

}
