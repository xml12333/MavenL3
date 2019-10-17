import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
@Inherited
@Retention(value = RetentionPolicy.RUNTIME)
@interface SaveTo2 {
    String path();
}

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Saver2 {
}

@SaveTo2(path = "c:\\file.txt")
class TestConteiner {
    String text = "text from textContainer";

    @Saver2
    public void save(String text1, String path) throws IOException {
        FileWriter w = new FileWriter(path);
        try {
            w.write(text1);
        } finally {
            w.close();
        }
    }
}
public class Main {

    @Target(value = ElementType.METHOD)
    @Retention(value = RetentionPolicy.RUNTIME)
    @interface  MyAnnotation {
        String x1();
        String x2();
    }

    @MyAnnotation (x1 = "1", x2 = "2")
    public static void myMethod(String x1,String x2)
    {
        System.out.println(x1+" "+x2);
    }
    public static void main(String[] args) throws NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        //task 1.
        // Создать аннотацию, которая принимает параметры для метода.
        // Написать код, который вызовет метод, помеченный этой аннотацией,
        // и передаст параметры аннотации в вызываемый метод.
        final Class<?> someClass = Main.class;
        Method[] methods = someClass.getMethods();

        for (Method method:methods){
            if (method.isAnnotationPresent(MyAnnotation.class)){
                try {
                    method.invoke(null,method.getAnnotation(MyAnnotation.class).x1(),method.getAnnotation(MyAnnotation.class).x2());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        //task 2.
        // 2. Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
        //1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
        //который сохранит поле класса TextContainer в указанный файл."
        final Class<?> someClass2 = TextContainer.class;
        Saver obj = new Saver();
        obj.save(someClass2);

        //task3
        TestConteiner testConteiner = new TestConteiner();
        Class<?> classClass = testConteiner.getClass();

        if (!classClass.isAnnotationPresent(SaveTo2.class)) {
            System.out.println("Class is not annotated");
        } else {
            Method[] masMethods = classClass.getMethods();
            for (Method method : masMethods) {
                if (method.isAnnotationPresent(Saver2.class)) {
                    SaveTo2 saveTo = classClass.getAnnotation(SaveTo2.class);
                    method.invoke(testConteiner, testConteiner.text, saveTo.path());
                } else {
                    System.out.println("method is not annotated");
                }
            }
        }
    }
}


