package Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] players = new Player[n];
        Checker checker = new Checker();
        for (int i = 0; i < n; i++) {
            players[i] = new Player(sc.next(),sc.nextInt());
        }
        sc.close();
        Arrays.sort(players,checker);
        for (int i = 0; i < n; i++) {
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }
}
