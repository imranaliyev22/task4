import java.util.ArrayList;
import java.util.List;

public class Test<T> {
    private T value;


    public Test(T value) {
        this.value = value;
    }

    public Test() {

    }

    public void add(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
