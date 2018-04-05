
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by rocamadour on 05/04/18.
 */
public class test1 {

    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/rocamadour/Automation/Chromedriver/chromedriver");
        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        //Launch the Online Store Website
        driver.get("http://www.store.demoqa.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

        // Close the driver
        driver.quit();
}