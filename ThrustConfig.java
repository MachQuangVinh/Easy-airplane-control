public class ThrustConfig {
    private int maxThrust;
    private int minThrust;
    private int maxSpeed;
    private int weight;

    public ThrustConfig(int maxThrust, int minThrust, int maxSpeed, int weight) {
        this.maxThrust = maxThrust;
        this.minThrust = minThrust;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public int getMaxThrust() {
        return maxThrust;
    }

    public int getMinThrust() {
        return minThrust;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxThrust(int maxThrust) {
        this.maxThrust = maxThrust;
    }

    public void setMinThrust(int minThrust) {
        this.minThrust = minThrust;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void autoTakeOffControl(int currentSpeed, double CoefficientLift, double CoefficientDrag){
        if(CoefficientLift/CoefficientDrag > 1){
            System.err.println("Taking off speed acquired!");
        }else if(CoefficientLift/CoefficientDrag < 1){
            System.err.println("Increase thrust to generate lift!");
        }else{
            System.err.println("Stall");
        }
    }

}
