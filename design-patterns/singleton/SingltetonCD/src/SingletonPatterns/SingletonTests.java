package SingletonPatterns;
import org.junit.jupiter.api.Test;
public class SingletonTests {
    @Test
    public void testEagerInit(){
        System.out.println("Object id is : " + EagerInitialisation.getInitialisation());
        System.out.println("Object id is : " + EagerInitialisation.getInitialisation());
        System.out.println("Object id is : " + EagerInitialisation.getInitialisation());

    }
}
