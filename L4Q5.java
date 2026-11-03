/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;
import java.util.Random;

/**
 *
 * @author USER
 */
public class L4Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] score = {0,0};
        int player = 0;
        boolean gameOver = false;
        
        while(!gameOver){
            boolean rollAgain;
            do{
                int dice = rand.nextInt(6)+1;
                score[player] += dice;
                System.out.println("Player" + (player + 1 ) + " rolls " + dice + " total =  " + score[player]);
                
                if(score[player] > 100){
                    gameOver = true;
                    break;
                }
                rollAgain = (dice == 6);
              }
            while(rollAgain);
            if(!gameOver){
                player = 1 - player;
            }
        }
        System.out.println("The winner is Player : " + (player + 1));
    }
    
}
