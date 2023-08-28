//package 이재원자동차;
//
//import java.util.Scanner;
//
//public class CarMain {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주");
//        int destinationChoice = scanner.nextInt();
//        int distance = 0;
//        switch (destinationChoice) {
//            case 1:
//                distance = 400;
//                break;
//            case 2:
//                distance = 150;
//                break;
//            case 3:
//                distance = 200;
//                break;
//            case 4:
//                distance = 300;
//                break;
//        }
//
//        System.out.print("이동할 승객 수 입력 : ");
//        int passengerCount = scanner.nextInt();
//
//        System.out.println("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스");
//        int carChoice = scanner.nextInt();
//        Car car;
//        if (carChoice == 1) {
//            System.out.print("차량 이름 입력: ");
//            String carName = scanner.next();
//            car = new SportCar(carName);
//        } else if (carChoice == 2) {
//            System.out.print("차량 이름 입력: ");
//            String carName = scanner.next();
//            car = new Sedan(carName);
//        } else {
//            System.out.print("차량 이름 입력: ");
//            String carName = scanner.next();
//            car = new Bus(carName);
//        }
//
//        System.out.println("부가 기능 [1]ON [2]OFF");
//        int featureChoice = scanner.nextInt();
//        if (carChoice == 1 && featureChoice == 1) {
//            ((SportCar) car).toggleTurbo();
//        } else if (carChoice == 2 && featureChoice == 1) {
//            ((Sedan) car).toggleTrunkToSeat();
//        } else if (carChoice == 3 && featureChoice == 1) {
//            ((Bus) car).toggleAuxFuelTank();
//        }
//
//        car.refuel(car.getFuelTankSize());
//        double totalCost = car.calculateCost(distance);
//        double totalTravelTime = distance / car.getSpeed();
//
//        System.out.println("=".repeat(6) + car.getName() + "=".repeat(6));
//        System.out.println("총 비용 : " + totalCost + "원");
//        System.out.println("총 주유 횟수 : " + (int) (car.getFuelTankSize() / car.getFuelEfficiency()) + "회");
//        System.out.println("총 이동 시간 : " + String.format("%.2f", totalTravelTime));
//    }
//}
//
//
