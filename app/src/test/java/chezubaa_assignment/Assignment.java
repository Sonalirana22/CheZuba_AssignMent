package chezubaa_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

    public static void main(String[] args){
        // Set up the ChromeDriver
       System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();


       // Navigate to the web page 
       driver.get("https://www.flipkart.com/");


       // Maximaize the window
       driver.manage().window().maximize();


       // Locating the search box and entering a search query into the search box field and submitting
       String searchTerm = "Selenium";
       WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']")); 
       searchBox.sendKeys(searchTerm);
       searchBox.submit();

       
       // Locating the results text
       WebElement resultArea = driver.findElement(By.xpath("//span[@class='BUOuZu']"));


       // Verify that the results area is displayed
       if (resultArea.isDisplayed()) {
           System.out.println("Results area is displayed.");
       }
       
       // Retrieving the text from the result area
       String actualText = resultArea.getText();  


        // Check if the actual text contains the search term
           if (actualText.toLowerCase().contains(searchTerm.toLowerCase())) {
               System.out.println("Search result contains the expected search term.");
           } else {
               System.out.println("Search result does not contain the expected search term.");
           }
           

       // Close the browser
       driver.quit();



   }
    
}
