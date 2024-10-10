package taudemo;


//junit automatically imported dependencies.
import dev.failsafe.internal.util.Assert;
import org.example.helpers.Helpers;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

//sample grayed imported class is not in use
//dont keep anything unused in your class
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;


public class SeleniumTest {
    //Field
    //ctrl + space for field name suggestion
    private static WebDriver driver;
    private Helpers helper = new Helpers();




    @BeforeAll
    public static void beforeAll() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(300);
        System.out.println("@BeforeAll method will run before all");
    }

    @AfterAll
    public static void afterAll(){

        System.out.println("@AfterAll method will run after all");
        driver.quit();
    }

    @Test
    public void openThePageAndCheckTheTitle() throws InterruptedException {
        //Create a variable
        //Press S and see suggestions
        //grayed method/variable/import name means it's not used anywhere
        //Variables
        String expectedString ="The Internet";

        //Wait for 3 seconds
        Thread.sleep(3000);

        System.out.println("@Test method is my test method1");
        Assertions.assertEquals(helper.getTitle(driver),expectedString);
    }


}
