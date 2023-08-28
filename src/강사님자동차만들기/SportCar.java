package 강사님자동차만들기;

public class SportCar extends Car {
    public SportCar(String name) {
        this.name = name;
        maxSpeed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) maxSpeed *= 1.2;
    }
}
