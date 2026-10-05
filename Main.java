public class Main {
    public static void main(String[] args) {

        ThrustConfig thrust = new ThrustConfig(
            10000, 1000, 200, 15000);
        
            LiftConfig lift = new LiftConfig(
                10.0,
                20.0,
                1.225,
                1.2,
                50.0
            );

            DragConfig drag = new DragConfig(
                10.0,
                20.0,
                1.225,
                0.3,
                50.0
            );

            double liftForce = lift.liftForce();
            double dragForce = drag.dragForce();

            ElevatorConfig elevator = new ElevatorConfig(18, -18);


            // THRUST INFORMATION

            System.err.println("Minimum thrust: " + thrust.getMinThrust());
            System.err.println("Maximum thrust: "+ thrust.getMaxThrust());

            System.err.println("Maximum speed: "+ thrust.getMaxSpeed());

            // TAKING OFF

            System.out.println("");
                    System.out.println("Lift / Drag = "
                + (liftForce / dragForce));

        thrust.autoTakeOffControl(
                50,
                1.2,
                0.3
        );

        elevator.autoPilotControl(
                0,
                1.2,
                0.3
        );
    }

}
