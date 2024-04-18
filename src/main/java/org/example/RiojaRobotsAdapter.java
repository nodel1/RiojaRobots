package org.example;

class RiojaRobotsAdapter implements RiojaRobotsInterface {
    private USRobotsInterface usRobot;

    public RiojaRobotsAdapter(USRobotsInterface usRobot) {
        this.usRobot = usRobot;
    }

    public double velocidadActualEnKmh() {
        double milesPerHour = usRobot.currentSpeedInMilesPerHour();
        return milesPerHour * 1.6;
    }

    public void salta(double distancia) {
        double feet = distancia / 0.3;
        usRobot.jump(feet);
    }
}
