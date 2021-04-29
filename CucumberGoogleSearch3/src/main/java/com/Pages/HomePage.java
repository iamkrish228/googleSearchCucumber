package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {

	// Page Elements
	WebElement search = driver.findElement(By.name("q"));
	WebElement link = driver.findElement(By.className("yuRUbf"));
	WebElement linkText = driver.findElement(By.linkText("About Ducks Unlimited"));

	public String getTitle() {
		return driver.getTitle();
	}

	public HomePage searchWord() {

		// Enter text ducks in the search text box
		if (search.isDisplayed()) {
			search.clear();
			search.sendKeys("ducks");
		}

		search.sendKeys(Keys.ENTER);

		return new HomePage();

	}

	public boolean linkIsPresent() {
		boolean result = link.isEnabled();
		return result;
	}

	public void clickLink() {
		
		if (link.isEnabled()) {
			link.click();
		}

	}

	public void checkLinkDetails() {

		linkText.getText();
	}
	
	public HomePage searchOtherWord() {

		if (search.isDisplayed()) {
			search.clear();
			search.sendKeys("eagle");
		}

		search.sendKeys(Keys.ENTER);

		return new HomePage();

	}
	public HomePage searchSpecialChars() {

		if (search.isDisplayed()) {
			search.clear();
			search.sendKeys("#$%&");
		}

		search.sendKeys(Keys.ENTER);

		return new HomePage();

	}

}
