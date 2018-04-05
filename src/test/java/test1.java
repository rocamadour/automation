
import org.junit.Test;

/**
 * Created by rocamadour on 05/04/18.
 */
public class FirstTestCase {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Launch the Online Store Website
        driver.get("http://www.store.demoqa.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

        //Wait for 5 Sec
        Thread.sleep(5000);

        // Close the driver
        driver.quit();
    }
}