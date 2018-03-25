import java.util.Timer;
import java.util.TimerTask;

public class TestMatrix{
	public static void main(String [] args){
		Matrix prueba = new Matrix();
		Timer timer = new Timer();
		TimerTask myTask = new TimerTask() {
    		@Override
    		public void run() {
        // whatever you need to do every 2 seconds
    			System.out.print("\033[H\033[2J");
				System.out.flush();
				prueba.getMatrix();
    		}
		};
		timer.schedule(myTask, 100, 100);
	}
}