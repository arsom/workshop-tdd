import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class IdGenerateServiceTest {


    @Test
    public void getData(){
        MyRandom random = new MyRandom(){
            @Override
            public int nextInt(int bound) {
                return 6;
            }
        };
        IdGenerateService service = new IdGenerateService();
        service.setRandom(random);
        String result = service.getData();
        assertEquals("CODE6",result);
    }

    @Test
    public void getData2() {
        SpyRandom spy = new SpyRandom(); // Dependency
        IdGenerateService service
                = new IdGenerateService();
        service.setRandom(spy);
        service.getData();
        // Assert
        spy.verify(1);
    }


}

class SpyRandom implements MyRandom {
    private int count;

    @Override
    public int nextInt(int bound) {
        if(bound >= 5) {
            count++;
        } else {
            fail("Bound in valid");
        }
        return 6;
    }

    public void verify(int expectedCount) {
        assertTrue(count == expectedCount);
    }

}
