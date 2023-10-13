public class ElectricMotor implements IMotor {

    @Override
    public String accelerate() {
        return "Accelerating Electric Motor";
    }

    @Override
    public String start() {
        return "Starting Electric Motor";
    }
}
