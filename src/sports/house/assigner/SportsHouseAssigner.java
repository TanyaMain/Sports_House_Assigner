
package sports.house.assigner;

import java.util.Random;
import javax.swing.JOptionPane;


public class SportsHouseAssigner {

    public static void main(String[] args) {
        
        String[] sportsHouse = {"BLUE", "WHITE", "RED"};
        Random rand = new Random();
        
        String firstName = JOptionPane.showInputDialog(null,    "Please enter the first student name.");
        String secondName = JOptionPane.showInputDialog(null,   "Please enter the second student name.");
        String thirdName = JOptionPane.showInputDialog(null,    "Please enter the third student name.");
        
        
        
          JOptionPane.showMessageDialog(null,
                   "School House Assignment\n"
                  + "*********************************\n"
                  + firstName + " assigned to the " + sportsHouse[ rand.nextInt(sportsHouse.length)] 
                  + " house with student number "  + sportsHouse[ rand.nextInt(sportsHouse.length)] + rand.nextInt(1000) + "\n"
                  + secondName + " assigned to the " + sportsHouse[ rand.nextInt(sportsHouse.length)] 
                  + " house with student number " + sportsHouse[ rand.nextInt(sportsHouse.length)] + rand.nextInt(1000) + "\n" 
                  + thirdName + " assigned to the " + sportsHouse[ rand.nextInt(sportsHouse.length)]
                  + " house with student number "  + sportsHouse[ rand.nextInt(sportsHouse.length)] + rand.nextInt(1000)
          , "School House Assignment", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

