
import java.util.TimerTask;
import javax.swing.JLabel;


/**
 *
 * @author ARIS
 */
public class TwoSecondTimer extends TimerTask{
    int stopat;
    int seconds;
    JLabel[] arrayBlocks;
    
    TwoSecondTimer(int sec,JLabel[] arrayBlocks){
        this.arrayBlocks = arrayBlocks;
        stopat = sec;
        seconds = 0;
    }

    
   public void run() {
       
       if ( seconds == stopat){
           Utilities.setInvisible(arrayBlocks);
           this.cancel();
       }
       seconds++;
   }
    
}
