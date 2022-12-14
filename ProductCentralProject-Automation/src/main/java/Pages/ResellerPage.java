package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	
	@FindBy(xpath="//div[@class='cmp-product-list__cards-container']")
	private static List<WebElement> productList;
	
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
	
	public void setPageTitleAndProducts() {
		HelperFunctions.waitForPageToLoad(3);
		String actualTitle=pageTitle.getText();
		String expectedTitle="Reseller Demo";
		Assert.assertTrue(pageTitle.isDisplayed());
		Assert.assertEquals(actualTitle, expectedTitle, "Actual and expected title do not match");
		
		for(WebElement each: productList) {
			System.out.println(each.getText());
			if(each.getText().contains("Check-in") && each.getText().contains("Compliance")&& each.getText().contains("Microsoft Alliance")) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
