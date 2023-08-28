//package 이재원자동차;
//
//public class Car {
//    private double speed;
//    private double fuelEfficiency;
//    private double fuelTankSize;
//    private int seatCount;
//    private String name;
//
//    public Car(double speed, double fuelEfficiency, double fuelTankSize, int seatCount, String name) {
//        this.speed = speed;
//        this.fuelEfficiency = fuelEfficiency;
//        this.fuelTankSize = fuelTankSize;
//        this.seatCount = seatCount;
//        this.name = name;
//    }
//
//
//    public double getSpeed() {
//        return speed;
//    }
//
//    public double getFuelEfficiency() {
//        return fuelEfficiency;
//    }
//
//    public double getFuelTankSize() {
//        return fuelTankSize;
//    }
//
//    public int getSeatCount() {
//        return seatCount;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void refuel(double liters) {
//        fuelTankSize += liters;
//        // Refuel logic here
//    }
//
//    public boolean travel(double distance) {
//        double fuelNeeded = distance / fuelEfficiency;
//        if (fuelTankSize >= fuelNeeded) {
//            fuelTankSize -= fuelNeeded;
//            return true;
//        }
//        return false;
//        // Travel logic here
//
//    }
//
//    public double calculateCost(double distance, double fuelPricePerLiter) {
//        double fuelNeeded = distance / fuelEfficiency;
//        return fuelNeeded * fuelPricePerLiter;
//    }
//
//    public double calculateTime(double distance) {
//        return distance / speed;
//    }
//    public void setSeatCount(int seatCount) {
//        this.seatCount = seatCount;
//    }
//
//    public void setSpeed(double speed) {
//        this.speed = speed;
//    }
//
//    public void setFuelTankSize(double fuelTankSize) {
//        this.fuelTankSize = fuelTankSize;
//    }
//}
//
