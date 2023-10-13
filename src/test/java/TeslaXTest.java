import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeslaXTest {
    private TeslaX car;

    @BeforeEach
    void setUp() {
        ElectricMotor motor = new ElectricMotor();
        this.car = new TeslaX(motor);
    }

    @Test
    void shouldAccelerate() {
        assertEquals("Accelerating Electric Motor", car.accelerate());
    }

    @Test
    void shouldStart() {
        assertEquals("Starting Electric Motor", car.start());
    }
}