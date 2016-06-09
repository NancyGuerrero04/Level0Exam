

import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Colors.Blues;
import org.teachingextensions.logo.Colors.Greens;
import org.teachingextensions.logo.PenColors.Reds;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {
	 
    public static void main(String[] args) {
    	Robot nancy = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
    	
    	String color = JOptionPane.showInputDialog("What color would you like the Robot to draw?");
    	
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	
    	if(color.equalsIgnoreCase("Red")){
    		nancy.setPenColor(org.teachingextensions.logo.Colors.Reds.Red);
    	}
    	else if(color.equalsIgnoreCase("Green")){
    		nancy.setPenColor(Greens.Green);
    	}
    	else if(color.equalsIgnoreCase("Blue")){
    		nancy.setPenColor(Blues.DarkBlue);
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "Sorry, don't have that color!");
    	
    	}
    	
   	 // 2. set the pen width to 10
    	nancy.setPenWidth(10);
   	 // 1. make the Robot draw a shape
    
     for(int i=0; i<4; i++){
    	 nancy.penDown();
    	 nancy.move(100);
    	 nancy.turn(90);
     }
    }
    }



