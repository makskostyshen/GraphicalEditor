package draw;

import draw.shape.Shape;
import tools.Tool;

public class Drawer implements Tool<Shape> {

    @Override
    public void accomplish(Shape shape) {
        DrawnShape drawnShape = getDrawnShape(shape);
        System.out.println(drawnShape);
    }


    private DrawnShape getDrawnShape(Shape shape){
        String classFullName = shape.getClass().getName();

        String[] packageNames = classFullName.split("\\.");
        String classShortName = packageNames[packageNames.length -1];

        return new DrawnShape(classShortName);
    }

}
