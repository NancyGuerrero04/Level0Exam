
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("What's your age?");
		int numAge =Integer.parseInt(age);
		
		//for(int i=0; i < 5; i++){
			
			//Math.subtractExact(2016, age);
		//	JOptionPane.showMessageDialog(null, ""  +year);
		
		//}
		
		
		if(numAge > 30){
			JOptionPane.showMessageDialog(null, "You are too old for this game!");
		}
	}

}
