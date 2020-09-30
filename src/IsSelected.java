
import java.awt.Color;
import java.awt.Component;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author ARIS
 */
public class IsSelected {

    String choice1;
    String choice2;
    JLabel box1;
    JLabel box2;
    int index1;
    int currentMatches;

    public IsSelected() {
        choice1 = null;
        choice2 = null;
        box1 = null;
        box2 = null;
        currentMatches = 15;
    }

    public void boxClicked(Component event, String insidetheBlock[], JLabel arrayBlocks[], int index) {
        if ( theGame.isEnable[index]){
            JLabel clickedBlock = (JLabel) event;
            

            if (choice1 == null) {
                choice1 = insidetheBlock[index];
                clickedBlock.setText(choice1);
                box1 = clickedBlock;
                index1 = index;
            } else if (choice2 == null) {
                choice2 = insidetheBlock[index];
                clickedBlock.setText(choice2);
                box2 = clickedBlock;

                Timer t = new Timer();
                t.schedule(new TimerTask() {

                    @Override
                    public void run() {

                        String a = box1.getText();
                        String b = box2.getText();
                            if ( box1 == box2 ) {
                                box1.setText("");
                                clickedBlock.setText("");
                            } 
                            else if ( ! a.equals(b) ) {
                                box1.setText("");
                                clickedBlock.setText("");
                            } 
                            else  {
                                currentMatches--;
                                theGame.matches.setText(String.valueOf(currentMatches));
                                theGame.isEnable[index] = false;
                                theGame.isEnable[index1] = false;
                                
                                box1.setOpaque(true);
                                box2.setOpaque(true);
                                
                                box1.setForeground(new Color(50,242,114));
                                box2.setForeground(new Color(50,242,114));
                                
                                box1.setBackground(Color.LIGHT_GRAY);
                                box2.setBackground(Color.LIGHT_GRAY);
                                
                                if ( currentMatches == 0)
                                    currentMatches = 15;
                                    
                                
                            }

                    }
                }, 300);

                choice1 = null;
                choice2 = null;
            }

        }
    }

    
}
