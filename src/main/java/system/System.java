package system;

import tools.Tool;
import tools.ToolArgument;

public class System {

    public void act(Tool tool, ToolArgument toolArgument){
        tool.accomplish(toolArgument);
    }
}
