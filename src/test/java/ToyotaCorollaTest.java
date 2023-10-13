import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaCorollaTest {

    private ToyotaCorolla car;

    @BeforeEach
    void setUp() {
        CombustionMotor motor = new CombustionMotor();
        this.car = new ToyotaCorolla(motor);
    }

    @Test
    void shouldAccelerate() {
        assertEquals("Accelerating Combustion Motor", car.accelerate());
    }

    @Test
    void shouldStart() {
        assertEquals("Starting Combustion Motor", car.start());
    }
}