package 강사님자동차만들기;

public class Bus extends Car {
    public Bus(String name) {
        this.name = name;
        maxSpeed = 150;
        fuelEff = 5;
        fuelTank = 100;
        seatCnt = 20;
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) fuelEff +=30;
    }
}
