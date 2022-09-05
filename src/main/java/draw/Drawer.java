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
        shape.draw();
    }

}
