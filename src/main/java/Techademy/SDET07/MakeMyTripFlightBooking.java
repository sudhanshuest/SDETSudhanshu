package com.maven.SDET.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripFlightBooking {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		
		 // Set the path to the ChromeDriver executable
        // Update this path with the location where you have downloaded ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhanshu\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();

        // Navigate to the MakeMyTrip website
        driver.get("https://www.makemytrip.com/");

        try {
            // Click on Flights
            clickElementByXPath("//li[@data-cy='menu_Flights']");

            // Click on OneWay
            clickElementByXPath("//li[@data-cy='oneWayTrip']");

            // Enter FROM location
            enterTextByXPath("//input[@id='fromCity']", "YourFROMLocation");

            // Enter TO location
            enterTextByXPath("//input[@id='toCity']", "YourTOLocation");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser window
            driver.quit();
        }
    }

    // Generic function to click an element by XPath
    private static void clickElementByXPath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

    // Generic function to enter text into an element by XPath
    private static void enterTextByXPath(String xpath, String text) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys(text);
    }
		

	}


