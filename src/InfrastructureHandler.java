import gui.ComponentBuilder;

public class InfrastructureHandler {
    public static void consoleOutput(String string) {
        gui.ComponentBuilder builder = new ComponentBuilder();
        builder.putCommandOntoConsole(string);
    }
}
