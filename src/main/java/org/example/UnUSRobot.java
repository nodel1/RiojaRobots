package org.example;

class UnUSRobot implements USRobotsInterface {
    private double currentSpeed;

    public UnUSRobot(double speed) {
        this.currentSpeed = speed;
    }

    public double currentSpeedInMilesPerHour() {
        return currentSpeed;
    }

    public void spin(double angle) {
        System.out.println("I spin an angle: " + angle);
    }

    public void jump(double distance) {
        System.out.println("I jump a distance: " + distance);
    }
}
