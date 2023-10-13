public class TeslaX implements IVehicle {
    private IMotor motor;

    public TeslaX(IMotor motor) {
        this.motor = motor;
    }

    @Override
    public String accelerate() {
        return motor.accelerate();
    }

    @Override
    public String start() {
        return motor.start();
    }

    @Override
    public IMotor getMotor() {
        return motor;
    }

    @Override
    public void setMotor(IMotor motor) {
        this.motor = motor;
    }
}
