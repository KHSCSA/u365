// main hint: there are *many* helpful methods in the GUI class

/**
 * Project 3.6.5
 *
 * The Memory Game shows a random sequence of "memory strings" in a variety of buttons.
 * After wathcing the memory strings appear in the buttons one at a time, the
 * player recreates the sequence from memory.
 */
public class MemoryGame{
    public static void main(String[] args){

        // Create the "memory strings" - an array of single character strings to 
        // show in the buttons, one element at a time. This is the sequence
        // the player will have to remember.
        // Use an array of length 3 or 4, you can change this later

        // Create the game and gameboard. Configure a randomized board with 3 buttons.
        // (Later, you can change options to configure more or less buttons
        // and turn randomization on or off.)

        // Play the game until user wants to quit.

            // Create a new array that will contain the randomly ordered memory strings.
            // Use your randomPermutations algorithm to randomize the array of Strings
 
        
            // Play one sequence, delaying half a second for the strings to show
            // in the buttons. Save the player's guess. 
            // (Later, you can speed up or slow down the game.)


            // Cleanup the guess - use string method .replace() to remove commas and spaces.
            // Determine if player's guess matches all elements of the random sequence.
            // If match, increase score, and signal a match, otherwise, try again.
            // NOTE: You're comparing a string and an array. You'll need 
            // to develop an algorithm to compare the two.
            

            // Ask if user wants to play another round of the game 
            // and track the number of games played.

        // When done playing, show score and end the game.

    } // close main
    
}
