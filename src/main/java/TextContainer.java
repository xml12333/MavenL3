import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface  SaveTo {
    String path();
}

@SaveTo(path = "c:\\file.txt")
public class TextContainer {
    public String s = "some string";
}
