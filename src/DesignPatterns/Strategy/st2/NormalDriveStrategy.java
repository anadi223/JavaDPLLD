package DesignPatterns.Strategy.st2;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("NormalDriveStrategy");
    }
}
