/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseudorandnumgen;

import java.util.Scanner;

/**
 *
 * @author arieltodoki
 */
public class PseudorandNumGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner user = new Scanner(System.in);
        System.out.println("Enter seed (integer) of length 2,4, or 6: ");
        String input = user.nextLine();
        
        long seed = Integer.parseInt(input);
        int length = input.length();
        
        System.out.println("Enter how many numbers to generate: ");
        input = user.nextLine();
        int amt = Integer.parseInt(input);
        System.out.println("Random numbers generated: ");
        middleSquare(seed,length,amt);
    }
    
    static void middleSquare(long seed, int length, int amt){
        //limit the amount of numbers it produces
        int[] divide = {0,10,100,1000};
        for(int i = 0; i < amt; i++){
            long sqr = seed*seed;
            seed = (sqr/divide[length/2])%(divide[length/2]*divide[length/2]);
            System.out.println(seed);
        }
    }
    
}
