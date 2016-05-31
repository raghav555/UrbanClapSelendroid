import java.util.Timer;
import java.util.TimerTask;

public class testing {
	static int val =1;
public static void main(String args[]) 
{
	
	int MINUTES = 1; // The delay in minutes
	Timer timer = new Timer();
	 timer.schedule(new TimerTask() {
	    @Override
	    public void run() { // Function runs every MINUTES minutes.
	        // Run the code you want here
	        try {
				func();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // If the function you wanted was static
	    }
	 }, 0, 1000 * 60 * MINUTES);
}

static void func() throws Exception
{
	System.out.println(val);
	val++;
	throw new Exception("test");
}
}