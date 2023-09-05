//package 개인적으로만든게임;
//
//import java.util.Scanner;
//
//public class RpgGame {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("===== 간단한 RPG 게임 =====");
//        System.out.print("플레이어의 이름을 입력하세요: ");
//        String playerName = scanner.nextLine();
//
//        Player player = new Player(playerName);
//
//        System.out.println("게임을 시작합니다!");
//        System.out.println("========================");
//
//        while (true) {
//            System.out.println("1. 싸우기");
//            System.out.println("2. 종료하기");
//            System.out.print("선택: ");
//            int choice = scanner.nextInt();
//
//            if (choice == 1) {
//                Monster monster = new Monster();
//                System.out.println(player.getName() + "이(가) 몬스터와 싸우기 시작했습니다!");
//
//                while (player.isAlive() && monster.isAlive()) {
//                    player.attack(monster);
//                    if (monster.isAlive()) {
//                        monster.attack(player);
//                    }
//                }
//
//                if (!player.isAlive()) {
//                    System.out.println(player.getName() + "이(가) 졌습니다!");
//                    break;
//                } else {
//                    System.out.println(player.getName() + "이(가) 이겼습니다!");
//                    player.gainExperience(10);
//                }
//            } else if (choice == 2) {
//                System.out.println("게임을 종료합니다.");
//                break;
//            } else {
//                System.out.println("잘못된 선택입니다. 다시 선택하세요.");
//            }
//        }
//
//        System.out.println("========================");
//        System.out.println(player.getName() + "의 최종 경험치: " + player.getExperience());
//    }
//}
//
//class Monster {
//    private int health;
//
//    public Monster() {
//        this.health = 50;
//    }
//
//    public int getHealth() {
//        return health;
//    }
//
//    public boolean isAlive() {
//        return health > 0;
//    }
//
//    public void takeDamage(int damage) {
//        health -= damage;
//    }
//
//    public void attack(Player player) {
//        int damage = (int) (Math.random() * 15) + 1;
//        player.takeDamage(damage);
//        System.out.println("몬스터가 " + player.getName() + "을(를) 공격했습니다! " + player.getName() + "의 체력: " + player.getHealth());
//    }
//}
//
//class Player {
//    private String name;
//    private int experience;
//    private int health;
//
//    public Player(String name) {
//        this.name = name;
//        this.experience = 0;
//        this.health = 100;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getExperience() {
//        return experience;
//    }
//
//    public boolean isAlive() {
//        return health > 0;
//    }
//
//    public void takeDamage(int damage) {
//        health -= damage;
//        System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다. 남은 체력: " + health);
//        if (!isAlive()) {
//            System.out.println(name + "이(가) 죽었습니다.");
//        }
//    }
//
//    public void attack(Monster monster) {
//        int damage = (int) (Math.random() * 20) + 1;
//        monster.takeDamage(damage);
//        System.out.println(name + "이(가) 몬스터를 공격했습니다! 몬스터의 체력: " + monster.getHealth());
//    }
//
//    public void gainExperience(int amount) {
//        experience += amount;
//        System.out.println(name + "이(가) " + amount + "의 경험치를 획득했습니다!");
//    }
//}