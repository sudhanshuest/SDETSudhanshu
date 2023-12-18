package com.maven.SDET.maven;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MakeMyTripTestNG {
	
	private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to the ChromeDriver executable
        // Update this path with the location where you have downloaded ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();

        // Navigate to the MakeMyTrip website
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void testFlightsBooking() {
        // Click on Flights
        clickElementByXPath("//li[@data-cy='menu_Flights']");

        // Click on OneWay
        clickElementByXPath("//li[@data-cy='oneWayTrip']");

        // Enter FROM location
        enterTextByXPath("//input[@id='fromCity']", "YourFROMLocation");

        // Enter TO location
        enterTextByXPath("//input[@id='toCity']", "YourTOLocation");
    }

    @Test
    public void testLogoPresence() {
        // Locate the logo element by its class name (you may need to inspect the webpage to find the correct selector)
        WebElement logoElement = driver.findElement(By.className("your-logo-class-name"));

        // Check if the logo element is displayed
        assert logoElement.isDisplayed() : "MakeMyTrip logo is not present on the page.";
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser window
        driver.quit();
    }

    // Generic function to click an element by XPath
    private void clickElementByXPath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

    // Generic function to enter text into an element by XPath
    private void enterTextByXPath(String xpath, String text) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys(text);
    }
	

}
