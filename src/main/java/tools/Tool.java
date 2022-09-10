package tools;

public interface Tool <T extends ToolArgument>{
    void accomplish(T toolArgument);
}
