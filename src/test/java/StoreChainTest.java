import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import io.javalin.Javalin;
import util.CommandLine;

public class StoreChainTest {

	//Driver driver = new Driver();
	Javalin app = WebSocket.getInstance();

	/*@Test
	public void testConnection() {
		boolean hasConnection = driver.testConnection();
		Assert.assertEquals(hasConnection, false);
	}*/

	@Before
    public void beforeEach() throws InterruptedException{
        app.start(7000);
        Thread.sleep(3000);
    }

    @After
    public void afterEach(){
        app.stop();
    }

	@Test
	public void testJavalin() throws InterruptedException {
		String expectedResult = "Hello World";
        String actualResult = CommandLine.executeCommandPrompt("curl http://localhost:7000");

        if(actualResult.isEmpty()){
            Assert.fail("No response from server");
        }

        Assert.assertEquals(expectedResult, actualResult);
	}
}