import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class TrustwaveLogout {

    public static void logoutMain(){

        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("E:\\Projects\\Tutorials\\LearningJava\\TrustwaveQaTest\\src\\globals.properties");
        prop.load(fis);

        System.setProperty(prop.getProperty("browserDriver"), prop.getProperty("driverLoc"));
        WebDriver driver=new ChromeDriver();

        driver.findElement(By.name("logout_btn")).click();

        System.out.println("Test complete, you were logged out");
    }
}
