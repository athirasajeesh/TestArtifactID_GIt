package TestProject.TestArtifactID;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        System.out.println("Successfully .....!!!!");
        LaunchChrome ch = new LaunchChrome();
        LaunchChrome.launchChromeBrowser();
		ch.maximiseWindow();
		ch.mandatorySleep();
		LaunchChrome.manageImplicitWait();
		ch.manageExplicitWait();
		ch.quitBrowser();
    }
}
