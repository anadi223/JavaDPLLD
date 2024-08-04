package DesignPatterns.Strategy.st2;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("SportsDriveStrategy");
    }
}
