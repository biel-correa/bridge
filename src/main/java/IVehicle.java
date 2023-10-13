public interface IVehicle {
    String accelerate();
    String start();
    IMotor getMotor();
    void setMotor(IMotor motor);
}
