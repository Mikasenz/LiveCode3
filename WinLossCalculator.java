/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sm3tugasmodul3;
import java.util.Scanner;

/**
 * This class, WinLossCalculator, is a simple Java program that calculates the number
 * of wins and losses based on the total number of games played and the current win rate.
 * It takes input from the user for the total number of games and the win rate, and then
 * calculates and displays the number of wins and losses.
 * 
 * The class provides a command-line interface for the user to input the required data and
 * handles scenarios where the input win rate is outside the valid range of 0 to 100.
 * 
 * @author Your Name
 * @version 1.0
 */
public class WinLossCalculator {
    /**
     * The main method of the WinLossCalculator class, which serves as the entry point for
     * the program. It takes user input for the total number of games and the win rate,
     * calculates the number of wins and losses, and then displays the results.
     * 
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the total number of games
        System.out.print("Enter the total number of games: ");
        int totalGames = input.nextInt();

        // Prompt the user to enter the current win rate
        System.out.print("Enter the current win rate (0-100): ");
        double winRate = input.nextDouble();

        // Check if the win rate is within the valid range
        if (winRate < 0 || winRate > 100) {
            System.out.println("Win rate must be in the range of 0 to 100.");
        } else {
            // Calculate the number of wins and losses
            double wins = (winRate / 100) * totalGames;
            double losses = totalGames - wins;

            // Display the results
            System.out.println("Number of Wins: " + wins);
            System.out.println("Number of Losses: " + losses);
        }

        // Close the Scanner to release resources
        input.close();
    }
}











