import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class GetVersion {
    public static void main(String[] arguments) {
        ScriptEngineManager manager = new ScriptEngineManager(GetVersion.class.getClassLoader());
        ScriptEngine engine = manager.getEngineByName("Graal.js");
        System.out.println(engine.getFactory().getEngineVersion());
    }
}
