package com.maven.SDET.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTripLogoVerification {

	public static void main(String[] args) {
		
		 // Set the path to the GeckoDriver executable
        // Update this path with the location where you have downloaded GeckoDriver
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sudhanshu\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the MakeMyTrip website
        driver.get("https://www.makemytrip.com/");

        try {
            // Locate the logo element by its class name (you may need to inspect the webpage to find the correct selector)
            WebElement logoElement = driver.findElement(By.className("your-logo-class-name"));

            // Check if the logo element is displayed
            if (logoElement.isDisplayed()) {
                System.out.println("MakeMyTrip logo is present on the page.");
            } else {
                System.out.println("MakeMyTrip logo is not present on the page.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser window
            driver.quit();
        }
    }

	}

