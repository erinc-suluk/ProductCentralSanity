package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;

public class LegalPage extends HelperFunctions {
	public LegalPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(xpath="//a[@href='/us/en/automation/legal/maintenance---support.html']")
	private WebElement maintenanceAndSupportLink;
	
	@FindBy(xpath="//a[@href='/us/en/automation/legal/offering-overview.html']")
	private WebElement offeringOverviewLink;
	
	@FindBy(xpath="//a[@href='/us/en/automation/legal/data-processing-addendum.html']")
	private WebElement dataProcessingLink;
	
	@FindBy(xpath="//a[@href='/us/en/products/change-navigator/offering-overview.html']")
	private WebElement changeNavigatorLink;
	
	@FindBy(xpath="//a[@href='/us/en/products/customer-link/maintenance---support.html']")
	private WebElement customerLink;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement maintenanceAndSupportTitle;
	
	@FindBy(xpath="//a[@href='https://productcentral-qa.products.pwc.com/us/en/automation/legal/maintenance---support.html']")
	private WebElement maintenanceAndSupportBreadcrumb;
	
	@FindBy(xpath="//span[@class='cmp-pdf-highlights__title']")
	private WebElement ContentTitle;
	
	@FindBy(xpath="//div[@class='cmp-legal-product-listing__tiles']")
	private static List<WebElement> tilesComponents;
	
	@FindBy(xpath="//a[@href='/us/en/automation/legal.html']")
	private WebElement backtoLegalBreadcrumb;
	
	@FindBy(xpath="//div[@class='cmp-document-tiles__entries']")
	private static List<WebElement> legalTiles;
	
	@FindBy(xpath="//div[@class='cmp-legal-product-listing__tiles']")
	private static List<WebElement> legalTilesOffering;
	
	@FindBy(xpath="//span[@class='cmp-breadcrumb__link-title']")
	private WebElement offeringOverviewBreadcrumb;
	
	@FindBy(xpath="(//div[@class='cmp-document-tiles__entry-info-container'])//div[2]")
	private static List<WebElement> descriptionOfTiles;
	
	@FindBy(xpath="//a[@id='referrer-module']")
	private WebElement backtoLegalBreadcrumbfromContent;
	
	
	
	
	
	public void setlegalTiles() {
		HelperFunctions.waitForPageTitle("Legal");
		for(WebElement tiles:legalTiles) {
			if(tiles.isDisplayed()) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		maintenanceAndSupportLink.click();
		HelperFunctions.waitForPageToLoad(3);
		customerLink.click();
		HelperFunctions.waitForPageToLoad(3);
		maintenanceAndSupportBreadcrumb.click();
		HelperFunctions.waitForPageToLoad(3);
		backtoLegalBreadcrumb.click();
		HelperFunctions.waitForPageTitle("Legal");
		for(WebElement tiles:legalTiles) {
			if(tiles.isDisplayed()) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		offeringOverviewLink.click();
		HelperFunctions.waitForPageToLoad(3);
		changeNavigatorLink.click();
		HelperFunctions.waitForPageToLoad(3);
		offeringOverviewBreadcrumb.click();
		HelperFunctions.waitForPageToLoad(3);
		backtoLegalBreadcrumb.click();
	}
	public void setDescriptionOfTiles() {
		HelperFunctions.waitForPageTitle("Legal");
		for(WebElement eachDescription: descriptionOfTiles) {
			System.out.println(eachDescription.getCssValue("-webkit-line-clamp"));
			if(eachDescription.getCssValue("-webkit-line-clamp").equals("3")) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
				
			}
		}
	}
	
	public void setContentPageTags() {
		HelperFunctions.waitForPageTitle("Legal");
		maintenanceAndSupportLink.click();
		HelperFunctions.waitForPageToLoad(3);
		for(WebElement eachTiles: tilesComponents) {
			System.out.println(eachTiles.getText());
			if(eachTiles.getText().contains("Change Navigator") && eachTiles.getText().contains("Customer Link")
					&& eachTiles.getText().contains("Financial Wellness")
					&& eachTiles.getText().contains("21112Ínsights Platform")) {
				Assert.assertTrue(true);
				
			}else {
				Assert.assertTrue(false);
			}
		}
		customerLink.click();
		HelperFunctions.waitForPageToLoad(3);
		String actualContentTitle=ContentTitle.getText();
		String expectedContentTitle="Maintenance & Support";
		Assert.assertEquals(actualContentTitle, expectedContentTitle,"Actual and expected content Titles do not match");
		maintenanceAndSupportBreadcrumb.click();
		HelperFunctions.waitForPageToLoad(3);
		backtoLegalBreadcrumb.click();
		HelperFunctions.waitForPageTitle("Legal");
		offeringOverviewLink.click();
		HelperFunctions.waitForPageToLoad(3);
		for(WebElement eachTiles: tilesComponents) {
			System.out.println(eachTiles.getText());
			if(eachTiles.getText().contains("Change Navigator") && eachTiles.getText().contains("Customer Link")
					&& eachTiles.getText().contains("Financial Wellness")
					&& eachTiles.getText().contains("21112Ínsights Platform")) {
				Assert.assertTrue(true);
				
			}else {
				Assert.assertTrue(false);
			}
		}
		changeNavigatorLink.click();
		String actualContentTitle2=ContentTitle.getText();
		String expectedContentTitle2="Offering Overview";
		Assert.assertEquals(actualContentTitle2, expectedContentTitle2,"Actual and expected content Titles do not match");
	}
	public void setDisplayTilePerDocumentCat() {
		HelperFunctions.waitForPageToLoad(3);
		for(WebElement eachTile: legalTiles) {
			if(eachTile.getText().contains("Offering Overview")&& eachTile.getText().contains("Maintenance & Support")&& eachTile.getText().contains("Data Processing Addendum")
    				) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
	}
	
	public void setBreadcrumb() {
		HelperFunctions.waitForPageToLoad(3);
		maintenanceAndSupportLink.click();
		Assert.assertTrue(backtoLegalBreadcrumbfromContent.isDisplayed());
		backtoLegalBreadcrumbfromContent.click();
		HelperFunctions.waitForPageTitle("Legal");
		offeringOverviewLink.click();
		Assert.assertTrue(backtoLegalBreadcrumbfromContent.isDisplayed());
		backtoLegalBreadcrumbfromContent.click();
		dataProcessingLink.click();
		Assert.assertTrue(backtoLegalBreadcrumbfromContent.isDisplayed());
		backtoLegalBreadcrumbfromContent.click();
	}
	
	
	
	
	
	

}
