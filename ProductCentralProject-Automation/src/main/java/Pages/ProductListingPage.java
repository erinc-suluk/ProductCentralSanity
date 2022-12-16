package Pages;

import java.io.IOException;


import java.util.List;
import java.util.UUID;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.github.javafaker.Faker;
import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;



public class ProductListingPage extends HelperFunctions {
	public ProductListingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	
	
	@FindBy(xpath="//div[@class='cmp-related-links__items']")
	private static List<WebElement> allLinks;
	
	@FindBy(xpath="//div[@class='cmp-related-links']")
	private static List<WebElement> allLinks2;
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/offering-overview.html']")
	private WebElement offeringOverviewFromCloud;
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/terms---conditions.html']")
	private WebElement termsAndConditionsLink;
	
	@FindBy(xpath="(//span[.='PricewaterhouseCoopers2'])[1]")
	private WebElement termsAndConditionsTitle;
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/maintenance---support.html']")
	private WebElement maintenanceAndSupportLink;
	
	@FindBy(xpath="(//span[.='sample (5)'])[1]")
	private WebElement headerForMaintenanceAndSupport;
	
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/offering-overview.html']")
	private WebElement offeringOverviewLink;
	
	@FindBy(xpath="(//span[.='PDF Template for AEM Testing'])[1]")
	private WebElement offeringOverviewLinkTitle;
	
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/documentation.html']")
	private WebElement documentationLink;
	
	@FindBy(xpath="(//span[.='PDF Template for AEM Testing'])[2]")
	private WebElement documentationTitle;
	
	@FindBy(xpath="//div[@class='HUDView__hudContainer___3mx_O HUDView__immersiveShow___1pWVE']")
	private WebElement offeringPdfIcon;
	
	@FindBy(xpath="//div[@class='HUDView__hudContainer___3mx_O HUDView__immersiveShow___1pWVE']")
	private WebElement pdfIcon;
	
	@FindBy(linkText="Back to Cloud")
	private WebElement backToCloudBreadcrumb;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement cloudTitle;
	
	@FindBy(linkText="Back to Products")
	private WebElement backToProductsBreadcrumb;
	
	@FindBy(xpath="//h1[@class='cmp-product-list__search-bar-title']")
	private WebElement productsTitle;
	
	@FindBy(xpath="//input[@aria-label='Search Product']")
	private WebElement searchProduct;
	
	@FindBy(xpath="//div[@class='ap-option-item']")
	private WebElement searchItem;
	
	@FindBy(xpath="//span[@class='cmp-product-list__card-title ']")
	private WebElement products;
	
	@FindBy(xpath="//a[@data-product-name='Strategic']")
	private WebElement strategicProduct;
	
	@FindBy(xpath="//a[@data-product-name='Cloud']")
	private WebElement cloudProduct;
	
	@FindBy(xpath="//a[@data-product-name='Risk']")
	private WebElement riskProduct;
	
	@FindBy(xpath="//input[@placeholder='Search Products']")
	private WebElement productSearchBar;
	
	@FindBy(xpath="//div[@class='has-no-results']")
	private WebElement noResult;
	
	@FindBy(xpath="//div[@class='cmp-document-tiles__entry-title']")
	private static List<WebElement> titleofTiles;
	
	@FindBy(xpath="//span[@class='cmp-pdf-highlights__title']")
	private WebElement contentTitle;
	
	
	
	
	
	
	
	



   

    public void setAllLinks() throws IOException { 
    	HelperFunctions.waitForPageToLoad(5);
    	offeringOverviewFromCloud.click();
    	HelperFunctions.waitForPageToLoad(5);
    	Driver.getDriver().switchTo().frame(0);
		
		String expectedLink1="Terms & Conditions";
		String expectedLink2="Maintenance & Support";
		String expectedLink3="Offering Overview";
		String expectedLink4="Documentation";
		
		for(WebElement link:allLinks) {
			if(link.getText().contains(expectedLink1)&& link.getText().contains(expectedLink2)
					&& link.getText().contains(expectedLink3) && link.getText().contains(expectedLink4)) {
				System.out.println("All the links are visible on the content page");
			}else {}}}


	
    
    public void setLinks() {
    	HelperFunctions.waitForPageToLoad(5);
    	offeringOverviewFromCloud.click();
    	HelperFunctions.waitForPageToLoad(5);
    	termsAndConditionsLink.click();
    	Driver.getDriver().switchTo().frame(0);
    	HelperFunctions.clickWithWait(termsAndConditionsTitle);
    	Assert.assertEquals(termsAndConditionsTitle.getText(), "PricewaterhouseCoopers2");
    	HelperFunctions.staticWait(3);
    	Driver.getDriver().switchTo().defaultContent();
    	HelperFunctions.staticWait(3);
    	offeringOverviewLink.click();
    	Driver.getDriver().switchTo().frame(0);
    	HelperFunctions.clickWithWait(offeringOverviewLinkTitle);
    	Assert.assertEquals(offeringOverviewLinkTitle.getText(), "PDF Template for AEM Testing");
    	Driver.getDriver().switchTo().defaultContent();
    	HelperFunctions.staticWait(3);
    	documentationLink.click();
    	Driver.getDriver().switchTo().frame(0);
    	HelperFunctions.clickWithWait(documentationTitle);
    	Assert.assertEquals(documentationTitle.getText(), "PDF Template for AEM Testing");
    	HelperFunctions.staticWait(3);
    	Driver.getDriver().switchTo().defaultContent();
    	maintenanceAndSupportLink.click();
    	Driver.getDriver().switchTo().frame(0);
    	HelperFunctions.clickWithWait(headerForMaintenanceAndSupport);
    	Assert.assertEquals(headerForMaintenanceAndSupport.getText(), "sample (5)");
    	
    	
    }
    
    public void setPdfControllers() {
    	HelperFunctions.waitForPageToLoad(5);
    	offeringOverviewFromCloud.click();
    	HelperFunctions.waitForPageToLoad(5);
    	termsAndConditionsLink.click();
    	Driver.getDriver().switchTo().frame(0);
    	HelperFunctions.clickWithWait(termsAndConditionsTitle);
    	Assert.assertEquals(termsAndConditionsTitle.getText(), "PricewaterhouseCoopers2");
    	HelperFunctions.staticWait(3);
    	Boolean verifyPdfController=pdfIcon.isDisplayed();
    	Assert.assertTrue(verifyPdfController);
    	Driver.getDriver().switchTo().defaultContent();
    	offeringOverviewLink.click();
    	Driver.getDriver().switchTo().frame(0);
    	HelperFunctions.clickWithWait(offeringOverviewLinkTitle);
    	Assert.assertEquals(offeringOverviewLinkTitle.getText(), "PDF Template for AEM Testing");
    	HelperFunctions.staticWait(3);
    	
    	Assert.assertTrue(verifyPdfController);
    	Driver.getDriver().switchTo().defaultContent();
    	documentationLink.click();
    	Driver.getDriver().switchTo().frame(0);
    	HelperFunctions.clickWithWait(documentationTitle);
    	Assert.assertEquals(documentationTitle.getText(), "PDF Template for AEM Testing");
    	HelperFunctions.staticWait(3);
    	
    	Assert.assertTrue(verifyPdfController);
    	Driver.getDriver().switchTo().defaultContent();
    	maintenanceAndSupportLink.click();
    	Driver.getDriver().switchTo().frame(0);
    	HelperFunctions.clickWithWait(headerForMaintenanceAndSupport);
    	Assert.assertEquals(headerForMaintenanceAndSupport.getText(), "sample (5)");
    	HelperFunctions.staticWait(3);
    	
    	Assert.assertTrue(verifyPdfController);
    	Driver.getDriver().switchTo().defaultContent();
    
    }

	

	public void setBreadcrumbs() {
		HelperFunctions.waitForPageToLoad(5);
    	offeringOverviewFromCloud.click();
    	HelperFunctions.waitForPageToLoad(5);
		
         backToCloudBreadcrumb.click();
         String actualCloudTitle=cloudTitle.getText();
         String expectedCloudTitle="Cloud";
         Assert.assertEquals(actualCloudTitle, expectedCloudTitle);
         backToProductsBreadcrumb.click();
         String actualProductTitle=productsTitle.getText();
         String expectedProductTitle="Products";
         Assert.assertEquals(actualProductTitle,expectedProductTitle);
         
			 
	
	
	}
	public void setLinkOfBreadcrumbs() {
		HelperFunctions.waitForPageToLoad(5);
    	offeringOverviewFromCloud.click();
    	HelperFunctions.waitForPageToLoad(5);
		if(backToCloudBreadcrumb.getAttribute("href").contains("/content/pc/us/en/automation/products/cloud.html")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		backToCloudBreadcrumb.click();
		if(backToProductsBreadcrumb.getAttribute("href").contains("/content/pc/us/en/automation/products.html")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	}
	
	public void setSearchBox() {
		HelperFunctions.waitForPageToLoad(5);
		searchProduct.click();
		searchProduct.sendKeys("Cloud");
		searchItem.click();
		if(cloudProduct.isDisplayed()) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		HelperFunctions.staticWait(3);
		searchProduct.clear();
		searchProduct.click();
		searchProduct.sendKeys("Strategic");
		searchItem.click();
		HelperFunctions.staticWait(3);
		if(strategicProduct.isDisplayed() ) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		HelperFunctions.staticWait(3);
		searchProduct.clear();
		searchProduct.click();
		searchProduct.sendKeys("Risk");
		searchItem.click();
		HelperFunctions.staticWait(3);
		if(riskProduct.isDisplayed() ) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
			
		
		
	}
	
	public void setSearchResult() {
		HelperFunctions.waitForPageToLoad(5);
		searchProduct.click();
		searchProduct.sendKeys("Cl");
		HelperFunctions.staticWait(3);
		searchItem.click();
		if(cloudProduct.isDisplayed()) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		HelperFunctions.staticWait(3);
		searchProduct.clear();
		searchProduct.click();
		searchProduct.sendKeys("St");
		HelperFunctions.staticWait(3);
		searchItem.click();
		HelperFunctions.staticWait(3);
		if(strategicProduct.isDisplayed() ) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		HelperFunctions.staticWait(3);
		searchProduct.clear();
		searchProduct.click();
		searchProduct.sendKeys("Ri");
		HelperFunctions.staticWait(3);
		searchItem.click();
		HelperFunctions.staticWait(3);
		if(riskProduct.isDisplayed() ) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
			
		
	}
	
	public void setSearchBarKeywordforNegativeTest() {
		HelperFunctions.waitForPageToLoad(5);
		productSearchBar.click();
		Faker faker=new Faker();
		productSearchBar.sendKeys(faker.name().firstName());
		if(noResult.isDisplayed() && noResult.getText().contains("Nothing matches your results")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
	}
	
	public void setDocumentTileLine() {
		HelperFunctions.waitForPageToLoad(5);
		cloudProduct.click();
		for(WebElement eachProductTitle: titleofTiles) {
			System.out.println(eachProductTitle.getCssValue("-webkit-line-clamp"));
			if(eachProductTitle.getCssValue("-webkit-line-clamp").equals("2")) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
				
			}
		}
	}
	public void setContentPageSameTab() {
		HelperFunctions.waitForPageToLoad(5);
		cloudProduct.click();
		offeringOverviewFromCloud.click();
		String actualTitle="Offering Overview";
		String expectedTitle=contentTitle.getText();
		Assert.assertEquals(actualTitle, expectedTitle, "Actual and expected title do not match");
	}
	
	
    
    
	
	
	
   
        
	
		
		
	     
     
	    
	      
	
	
	

}
