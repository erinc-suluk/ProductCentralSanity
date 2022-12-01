package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;

public class ResellerPage extends HelperFunctions {
	public ResellerPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement pageTitle;
	
	@FindBy(xpath="//a[@href='/us/en/automation/reseller-demo/check-in.html']")
	private WebElement checkInLink;
	
	@FindBy(xpath="//a[@href='/us/en/automation/reseller-demo/check-in/resell-offering-overview.html']")
	private WebElement resellOfferingOverviewLink;
	
	@FindBy(xpath="//span[@class='cmp-pdf-highlights__title']")
	private WebElement resellOfferingOverviewTitle;
	
	@FindBy(xpath="//a[@href='/content/pc/us/en/automation/reseller-demo/check-in.html']")
	private WebElement backtoCheckinBreadcrumb;
	
	@FindBy(xpath="//a[@href='/content/pc/us/en/automation/reseller-demo.html']")
	private WebElement backtoResellerDemoBreadcrumb;
	
	
	public void setBreadcrumbs() {
		
		HelperFunctions.waitForPageTitle("Reseller Demo");
		checkInLink.click();
		HelperFunctions.waitForPageTitle("Check-in");
		resellOfferingOverviewLink.click();
		HelperFunctions.waitForPageTitle("Resell offering overview");
		backtoCheckinBreadcrumb.click();
		HelperFunctions.waitForPageTitle("Check-in");
		backtoResellerDemoBreadcrumb.click();
		HelperFunctions.waitForPageTitle("Reseller Demo");}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
