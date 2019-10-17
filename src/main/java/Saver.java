import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Saver {
    @Target(value = ElementType.METHOD)
    @Retention(value = RetentionPolicy.RUNTIME)
    @interface SaverAnnotation {
    }

    @SaverAnnotation()
    public void save(Class<?> someClass) throws NoSuchFieldException {

        SaveTo someAnnotation = someClass.getAnnotation(SaveTo.class);
        String pathToSave = someAnnotation.path();
        Field sField = someClass.getField("s");
        String someText = sField.toString();
        System.out.println("Path to save = "+pathToSave);
        System.out.println("Text to save = "+someText);
        // дальше должно быть сохранение в файл

    }
}
