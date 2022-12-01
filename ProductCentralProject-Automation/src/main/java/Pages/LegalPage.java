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
	
	@FindBy(xpath="//a[@href='/us/en/products/change-navigator/offering-overview.html']")
	private WebElement changeNavigatorLink;
	
	@FindBy(xpath="/us/en/automation/legal/data-processing-addendum.html")
	private WebElement dataProcessingLink;
	
	@FindBy(xpath="//a[@href='/us/en/products/customer-link/maintenance---support.html']")
	private WebElement customerLink;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement maintenanceAndSupportTitle;
	
	@FindBy(xpath="//a[@href='https://productcentral-qa.products.pwc.com/us/en/automation/legal/maintenance---support.html']")
	private WebElement maintenanceAndSupportBreadcrumb;
	
	@FindBy(xpath="//a[@href='/us/en/automation/legal.html']")
	private WebElement backtoLegalBreadcrumb;
	
	@FindBy(xpath="//div[@class='cmp-document-tiles__entries']")
	private static List<WebElement> legalTiles;
	
	@FindBy(xpath="//div[@class='cmp-legal-product-listing__tiles']")
	private static List<WebElement> legalTilesOffering;
	
	@FindBy(xpath="//span[@class='cmp-breadcrumb__link-title']")
	private WebElement offeringOverviewBreadcrumb;
	
	
	
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
	
	
	
	
	
	
	
	

}
