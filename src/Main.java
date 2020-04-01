/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James Holmes
 */
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        StudyHabits test = new StudyHabits(reader);
        test.start();       
        
    }
    
}
