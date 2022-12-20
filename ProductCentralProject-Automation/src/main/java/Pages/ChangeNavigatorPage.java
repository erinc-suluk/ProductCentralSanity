package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;

public class ChangeNavigatorPage extends HelperFunctions {
	public ChangeNavigatorPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(xpath="//*[@id=\"globalnav-start-home-collection\"]/coral-masonry-item[2]/div")
	private WebElement sites;
	
	@FindBy(xpath="(//div[contains(@title, 'productcentral')])[2]")
	private WebElement productcentral;
	
	@FindBy(xpath="//div[@title='us']")
	private WebElement us;
	
	@FindBy(xpath="//div[@title='en']")
	private WebElement en;
	
	@FindBy(xpath="//coral-columnview-item[@data-foundation-collection-item-id='/content/pc/us/en/products']")
	private WebElement Products;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/products/change-navigator.thumb.48.48.png?ck=']")
	private WebElement ChangeNavigator;
	
	@FindBy(xpath="//button[@class='betty-ActionBar-item cq-siteadmin-admin-actions-edit-activator foundation-collection-action coral-Button--graniteActionBar coral3-Button coral3-Button--quiet']")
	private WebElement edit;
	
	@FindBy(xpath="//h1[.='Fluid Forecast']")
	private WebElement pageTitle;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/products/change-navigator/jcr:content/root/container/container/title']")
	private WebElement changeProductsTitle;
	
	@FindBy(xpath="(//input[@name='./jcr:title'])[2]")
	private WebElement titleEdit;
	
	@FindBy(xpath="//button[@icon='edit']")
	private WebElement editButton;
	
	@FindBy(xpath="//button[@class='cq-dialog-header-action cq-dialog-submit coral3-Button coral3-Button--minimal']")
	private WebElement checkButton;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/products/change-navigator/jcr:content/root/container/container/text']")
	private WebElement changeNavigatorDescription;
	
	@FindBy(xpath="//div[@class='cq-RichText-editable coral-RichText-editable coral-RichText coral-DecoratedTextfield-input is-edited webkit chrome']")
	private WebElement navigatorDescriptionEdit;
	
	@FindBy(xpath="//button[@class='cq-dialog-header-action cq-dialog-submit coral3-Button coral3-Button--minimal']")
	private WebElement checkButton2;
	
	@FindBy(xpath="//button[@data-layer='Preview']")
	private WebElement previewButton;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement actualNavigatorTitle;
	
	@FindBy(xpath="//div[@class='cmp-text']")
	private WebElement actualNavigatorDescription;
	
	@FindBy(xpath="(//coral-columnview-column[@data-foundation-layout-columnview-columnid='/content/pc/us/en'])//coral-columnview-item")
	private static List<WebElement> contentOptions;
	
	@FindBy(xpath="//*[@id=\"coral-id-496\"]/div[1]")
	private WebElement automation;
	@FindBy(xpath="//coral-columnview-item[@data-granite-collection-item-id='/content/pc/us/en/automation/my-products']")
	private WebElement myproduct;
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/my-products/fluid-forecast.thumb.48.48.png?ck=']")
	private WebElement fluidForecast;
	
	@FindBy(xpath="(//div[@class='cmp-for-you__tiles'])/a")
	private static List<WebElement> foryouAssets;
	
	@FindBy(xpath="((//div[@class='cmp-for-you__tiles'])/a)[position()=1 or position()=2 or position()=3 or position()=4 or position()=5]")
	private static List<WebElement> first5Assets;
	
	@FindBy(xpath="((//div[@class='cmp-for-you__tiles'])/a)[position()=6 or position()=7 or position()=8 or position()=9 or position()=10]")
	private static List<WebElement> last5Assets;
	
	@FindBy(xpath="//button[@id='showMore']")
	private WebElement viewMoreButton;
	
	@FindBy(xpath="//button[@id='showLess']")
	private WebElement viewLessButton;
	
	@FindBy(xpath="//button[@class='granite-collection-create foundation-toggleable-control coral3-Button coral3-Button--primary']")
	private WebElement createButton;
	
	@FindBy(xpath="(//coral-list-item-content[.='Page'])[1]")
	private WebElement pageButton;
	
	@FindBy(xpath="//img[@src='/conf/pc/settings/wcm/templates/product-listing-page-template-product-central/thumbnail.png']")
	private WebElement productListingPageTemplate;
	
	@FindBy(xpath="//coral-button-label[.='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath="//coral-tab-label[.='Product Central']")
	private WebElement productCentralTab;
	
	@FindBy(xpath="//select[@name='./documentCategory']")
	private static List<WebElement> documentCategoryTag;
	
	@FindBy(xpath="//select[@name='./productFeatureTag']")
	private static List<WebElement> productFeatureTags;
	
	@FindBy(xpath="//select[@name='./portfolioTag']")
	private static List<WebElement> portfolioTags;
	
	@FindBy(xpath="//div[@title='Products']")
	private WebElement products;
	
	@FindBy(xpath="//div[@title='Change Navigator']")
	private WebElement changeNavigatorLink;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[6])//coral-columnview-item)[position()=1]")
	private WebElement firstPositionAuthor;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[6])//coral-columnview-item)[position()=2]")
	private WebElement secondPositionAuthor;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[6])//coral-columnview-item)[position()=3]")
	private WebElement thirdPositionAuthor;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[6])//coral-columnview-item)[position()=4]")
	private WebElement forthPositionAuthor;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[6])//coral-columnview-item)[position()=9]")
	private WebElement fifthPositionAuthor;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[6])//coral-columnview-item)[position()=10]")
	private WebElement sixthPositionAuthor;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=1]")
	private WebElement firstTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=2]")
	private WebElement secondTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=3]")
	private WebElement thirdTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=4]")
	private WebElement forthTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=5]")
	private WebElement fifthTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=6]")
	private WebElement sixthTitle;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/products/change-navigator/offering-overview.thumb.48.48.png?ck=1665588252']")
	private WebElement offerinfOverviewImage;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/products/change-navigator/terms---conditions.thumb.48.48.png?ck=']")
	private WebElement termsAndConditionsImage;
	
	@FindBy(xpath="//a[@href='/us/en/products/change-navigator/offering-overview.html']")
	private WebElement offeringOverviewLink;
	
	
	
	
	

	
	
	
	@FindBy(xpath="((//div[@class='cmp-all-resources__cards-page ap-page-container'])//div//a)[position()=1 or position()=2 or position()=3 or position()=4 or position()=5]")
	private static List<WebElement> first5resources;
	
	@FindBy(xpath="((//coral-columnview-column-content[@role='presentation'])[4])//coral-columnview-item//div")
	private static List<WebElement> contentOptions2;
	
	

	
	
	
	String expectedNavigatorTitle="new title";
	String expectedNavigatorDescription="New Description";
	





	public void aemTitle() {Assert.assertEquals(Driver.getDriver().getTitle(), "AEM Start", "AEM title verification has been failed");}
	
    public void setSites() {
    	sites.click();
    	productcentral.click();
    	us.click();
    	en.click();
    	HelperFunctions.staticWait(10);
    	automation.click();
    	myproduct.click();
    	fluidForecast.click();
    	HelperFunctions.staticWait(3);
		edit.click();
		 Set<String> allWindows4=Driver.getDriver().getWindowHandles();
	        List<String> windowsList4=new ArrayList<>(allWindows4);
	        Driver.getDriver().switchTo().window(windowsList4.get(1));
	        HelperFunctions.staticWait(15);
	        Driver.getDriver().switchTo().frame(0);
	        //HelperFunctions.clickWithWait(pageTitle);
	        int count=foryouAssets.size();
	        System.out.println(count);
	        HelperFunctions.staticWait(3);
	        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	        
	  
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        if(viewMoreButton.isDisplayed()) {
	        	for(WebElement eachAsset: first5Assets) {
	        		if(eachAsset.isDisplayed()) {
	        			Assert.assertTrue(true);
	        		}
	        	}
	        	for(WebElement eachAsset2:last5Assets) {
	        		if(!eachAsset2.isDisplayed()) {
	        			Assert.assertTrue(true);
	        		}
	        	}
	        }else {
	        	Assert.assertTrue(false);
	        }
	        
	
	      
	        HelperFunctions.staticWait(3);
	        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
	        executor.executeScript("arguments[0].click();", viewMoreButton);
	        if(viewLessButton.isDisplayed()) {
	        	for(WebElement eachAsset: first5Assets) {
	        		if(eachAsset.isDisplayed()) {
	        			Assert.assertTrue(true);
	        		}
	        	}
	        	for(WebElement eachAsset2:last5Assets) {
	        		if(eachAsset2.isDisplayed()) {
	        			Assert.assertTrue(true);
	        		}
	        	}
	        }else {
	        	Assert.assertTrue(false);
	        }
	        
	        
	        
	        
	        
    
    
    	}
	
	

    public void setChangeProductsTitle() {
		Actions a = new Actions(Driver.getDriver());
		a.doubleClick(changeProductsTitle).build().perform();
		HelperFunctions.staticWait(3);
		Set<String> allWindows5=Driver.getDriver().getWindowHandles();
        List<String> windowsList5=new ArrayList<>(allWindows5);
        Driver.getDriver().switchTo().window(windowsList5.get(1));
        System.out.println(changeProductsTitle.getText());
        
	}
	public void setTitleEdit() {
		Set<String> allWindows5=Driver.getDriver().getWindowHandles();
        List<String> windowsList5=new ArrayList<>(allWindows5);
        Driver.getDriver().switchTo().window(windowsList5.get(1));
		titleEdit.click();
		titleEdit.clear();
		titleEdit.sendKeys(expectedNavigatorTitle);
		HelperFunctions.staticWait(3);
		
	}
	
	public void setCheckButton() {checkButton.click();HelperFunctions.staticWait(3);}
	
	public void setChangeNavigatorDescription() {
        Driver.getDriver().switchTo().defaultContent();
        Actions a = new Actions(Driver.getDriver());
		a.doubleClick(changeNavigatorDescription).build().perform();
		HelperFunctions.staticWait(3);
	}
	public void setNavigatorDescriptionEdit() {
		Set<String> allWindows5=Driver.getDriver().getWindowHandles();
        List<String> windowsList5=new ArrayList<>(allWindows5);
        Driver.getDriver().switchTo().window(windowsList5.get(1));
        HelperFunctions.staticWait(3);
		navigatorDescriptionEdit.click();
		navigatorDescriptionEdit.clear();
		navigatorDescriptionEdit.sendKeys(expectedNavigatorDescription);
		HelperFunctions.staticWait(3);
	}
	
	public void setCheckButton2() {checkButton2.click();HelperFunctions.staticWait(3);}
	
	public void setPreviewButton() {previewButton.click();}

    public void setActualNavigatorTitle() {
    	Driver.getDriver().switchTo().frame(0);
    	Assert.assertEquals(actualNavigatorTitle.getText(),expectedNavigatorTitle,"Actual and expected Navigator Title do not match");
	}

    public void setActualNavigatorDescription() {
		Assert.assertEquals(actualNavigatorDescription.getText(),expectedNavigatorDescription,"Actual and expected Navigator description do not match");
	}
    public void setDocCategory() {
    	sites.click();
    	productcentral.click();
    	us.click();
    	en.click();
    	createButton.click();
    	pageButton.click();
    	HelperFunctions.waitForPageToLoad(5);
    	productListingPageTemplate.click();
    	nextButton.click();
    	HelperFunctions.waitForPageToLoad(5);
    	productCentralTab.click();
    	
    	
    	for(WebElement each: documentCategoryTag) {
    		
    		if(each.getText().contains("Hosted Software Terms") && each.getText().contains("Patent Marking")&& each.getText().contains("Tool License Terms")
    				&& each.getText().contains("SMS Terms & Acceptable Use Policy")&& each.getText().contains("Terms of Use")&& each.getText().contains("Offering Overview")
    				&& each.getText().contains("Maintenance & Support")&& each.getText().contains("Data Processing Addendum")
    				&& each.getText().contains("Security")&& each.getText().contains("Compliance")&& each.getText().contains("Privacy")
    				&& each.getText().contains("Accessibility")&& each.getText().contains("Terms & Conditions")
    				&& each.getText().contains("Evaluation License")&& each.getText().contains("Documentation")) {
    			System.out.println(each.getText());
    			Assert.assertTrue(true);}else {Assert.assertTrue(false);}}
for(WebElement eachtag: productFeatureTags) {
	System.out.println(eachtag.getText());
    		if(eachtag.getText().contains("Check-in") && eachtag.getText().contains("Change Navigator")&& eachtag.getText().contains("Costumer Link")
    				&&eachtag.getText().contains("Digital on Demand")&& eachtag.getText().contains("Digital Operations Portal")&& eachtag.getText().contains("Disclosure Checklist")
    				&& eachtag.getText().contains("Enterprise Control")&& eachtag.getText().contains("Financial Wellness")
    				&& eachtag.getText().contains("Fluid Forecast")&& eachtag.getText().contains("Insights Platform")&& eachtag.getText().contains("Insights Officer")
    				&& eachtag.getText().contains("Interactions Hub")&& eachtag.getText().contains("International Tax View")
    				&& eachtag.getText().contains("LDTI E-Learns")&& eachtag.getText().contains("Listen Platform")
    				&& eachtag.getText().contains("Master Data Management")&& eachtag.getText().contains("Media Intelligence")
    				&& eachtag.getText().contains("Model Edge")&& eachtag.getText().contains("Origin Compliance")
    				&& eachtag.getText().contains("Partner Hub")&& eachtag.getText().contains("Performance Analyzer")
    				&& eachtag.getText().contains("ProEdge")&& eachtag.getText().contains("Ready Assess")
    				&& eachtag.getText().contains("Risk Detect - ABAC")&& eachtag.getText().contains("Saratoga")
    				&& eachtag.getText().contains("Third Party Tracker")&& eachtag.getText().contains("Transparency Hub")
    				&& eachtag.getText().contains("Workforce Architect")&& eachtag.getText().contains("Workforce Orchestrator")) {
    			
    			Assert.assertTrue(true);}else {Assert.assertTrue(false);}}
for(WebElement eachporttag: portfolioTags) {
	System.out.println(eachporttag.getText());
	
	if(eachporttag.getText().contains("Customer engagement") && eachporttag.getText().contains("Operational improvement")&& eachporttag.getText().contains("Risk mitigation")
			&& eachporttag.getText().contains("Strategic intelligence")&& eachporttag.getText().contains("Workforce experience")) {
		
		Assert.assertTrue(true);}else {Assert.assertTrue(false);}}
    	
    	
    	
    	
    	
    	
    }
    public void setDate() {
    	sites.click();
    	productcentral.click();
    	us.click();
    	en.click();
    	HelperFunctions.staticWait(5);
    	for(WebElement eachlink:contentOptions) {
    		System.out.println(eachlink.getText());
    	}
    	
    	
    
    
    }
    
    public void setDate2() {
    	sites.click();
    	productcentral.click();
    	us.click();
    	en.click();
    	HelperFunctions.staticWait(5);
    	for(WebElement element: contentOptions2) {
    		System.out.println(element.getText());
    	}
    }
    	
    	
    
    
    
    
    
    public void setCombination() {
    	sites.click();
    	productcentral.click();
    	us.click();
    	en.click();
    	createButton.click();
    	pageButton.click();
    	HelperFunctions.waitForPageToLoad(5);
    	productListingPageTemplate.click();
    	nextButton.click();
    	HelperFunctions.waitForPageToLoad(5);
    	productCentralTab.click();
    	
    	for(WebElement each: documentCategoryTag) {
    		if(each.getText().contains("Hosted Software Terms")) {
    			each.click();
    			break;
    		}
    	}
    	
    	
    	
    	
    }
    
    public void setHyperlinks() {
    	
    	sites.click();
    	productcentral.click();
    	us.click();
    	en.click();
    	HelperFunctions.staticWait(3);
    	products.click();
    	HelperFunctions.staticWait(3);
    	changeNavigatorLink.click();
    	HelperFunctions.staticWait(3);
    	String expectedTitle="Offering Overview";
    	String expectedTitle2="Terms & Conditions";
    	String expectedTitle3="Maintenance & Support";
    	String expectedTitle4="Offering Overview";
    	String expectedTitle5="Documentation";
    	String expectedTitle6="Data Processing Addendum";
    	Assert.assertTrue(firstPositionAuthor.getText().contains(expectedTitle));
    	Assert.assertTrue(secondPositionAuthor.getText().contains(expectedTitle2));
    	Assert.assertTrue(thirdPositionAuthor.getText().contains(expectedTitle3));
    	Assert.assertTrue(forthPositionAuthor.getText().contains(expectedTitle4));
    	Assert.assertTrue(fifthPositionAuthor.getText().contains(expectedTitle5));
    	Assert.assertTrue(sixthPositionAuthor.getText().contains(expectedTitle6));
    	offerinfOverviewImage.click();
    	editButton.click();
    	HelperFunctions.waitForPageToLoad(5);
    
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
    	System.out.println(Driver.getDriver().getTitle());
	    Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
	  
	    ArrayList<String> tabs2 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs2.get(1));
	    
	    Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/products/change-navigator.html");
	    HelperFunctions.waitForPageToLoad(5);
	    Assert.assertTrue(firstTitle.getText().contains(expectedTitle));
	    Assert.assertTrue(secondTitle.getText().contains(expectedTitle2));
	    Assert.assertTrue(thirdTitle.getText().contains(expectedTitle3));
	    Assert.assertTrue(forthTitle.getText().contains(expectedTitle4));
	    Assert.assertTrue(fifthTitle.getText().contains(expectedTitle5));
	    Assert.assertTrue(sixthTitle.getText().contains(expectedTitle6));
	    
	    offeringOverviewLink.click();
	    HelperFunctions.waitForPageTitle(expectedTitle);
	    String actualURL=Driver.getDriver().getCurrentUrl();
	    String expectedURL="https://productcentral-qa.products.pwc.com/us/en/products/change-navigator/offering-overview.html";
	    Assert.assertEquals(actualURL, expectedURL, "Actual and expected URL don't match");
    	
    	
    	
    }
    
    
    
    
    
    

}
