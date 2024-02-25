import programmers.Bandage;

public class Main {

    public static void main(String[] args) {

        Bandage bandage = new Bandage();

        int[] bandageData = {3, 2, 7};
        int health = 20;
        int[][] damage = {{1, 15}, {5, 16}, {8, 6}};

        int result = bandage.solution(bandageData, health, damage);

        System.out.println("result = " + result);

    }
}
