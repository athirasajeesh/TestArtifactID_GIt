package TestProject.TestArtifactID;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Successfully .....!!!!");
        LaunchChrome ch = new LaunchChrome();
        LaunchChrome.launchChromeBrowser();
		ch.maximiseWindow();
		try {
			ch.mandatorySleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LaunchChrome.manageImplicitWait();
		ch.manageExplicitWait();
		ch.quitBrowser();
    }
}
