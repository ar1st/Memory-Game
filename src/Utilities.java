
import java.util.*;
import javax.swing.JLabel;

/**
 *
 * @author ARIS
 */
public class Utilities {
    
    public static void setTimer(int sec,JLabel[] arrayBlocks){
        Timer t = new Timer();
        TimerTask task ;
        
        if ( sec == 2 ){
            task = new TwoSecondTimer(sec,arrayBlocks);
            t.schedule(task, 0,1000);
        }
        else if ( sec == 0.5){
            task = new TwoSecondTimer(sec, arrayBlocks);
            t.schedule(task, 0,500);
        }
    }
    
   
    public static void setInvisible(JLabel[] arrayBlocks){
        for ( int i =0 ; i < arrayBlocks.length; i++)
            arrayBlocks[i].setText("");
    }
       
}

