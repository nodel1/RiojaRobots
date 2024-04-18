package org.example;

public class Main {
    public static void main(String[] args) {

        USRobotsInterface usRobot = new UnUSRobot(10);   //en millas

        RiojaRobotsInterface riojaRobot = new RiojaRobotsAdapter(usRobot); //adaptador

        System.out.println("Velocidad actual: " + riojaRobot.velocidadActualEnKmh() + " Km/h");

        riojaRobot.salta(6);      //en metros y te lo saca en feet

    }
}