package com.sg.foundations.scanner;
import java.util.*;

/**
 *
 * @author Manny
 */
public class MiniMadLibs {
    
    public static String getInput(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        return input.nextLine();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words = new String[10];
        
        System.out.println("Let's play madlibs!");
        words[0] = getInput("I need a noun");
        words[1] = getInput("Now an adjective");
        words[2] = getInput("Another noun");
        words[3] = getInput("And a number");
        words[4] = getInput("Another adjective");
        words[5] = getInput("A plural noun");
        words[6] = getInput("Another one");
        words[7] = getInput("One more");
        words[8] = getInput("A verb (infinitive form)");
        words[9] = getInput("Same verb (past participle)");
        
        System.out.println(words[0] + ": the " + words[1] + " frontier. These are the voyages of the "
                + "starship " + words[2] + ". Its " + words[3] + "-year mission: to explore strange "
                + words[4] + " " + words[5] + ", to seek out " + words[4] + " " + words[6] + " and " + words[4] 
                + " " + words[7] + ", to boldly " + words[8] + " where no one has " + words[9] + " before.");
    }
    
}
