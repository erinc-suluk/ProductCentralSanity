package Pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;

public class HomePage extends HelperFunctions {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	@FindBy(xpath="//img[@class='cmp-hero__image']")
	private WebElement promotionBannerImage;
	
	@FindBy(xpath="//div[@class='cmp-hero__description']")
	private WebElement descriptionOfPromotionBanner;
	
	@FindBy(xpath="//div[@class='cmp-hero']")
	private WebElement promotionBanner;
	
	@FindBy(xpath="//div[@class='cmp-leftnavigation__items']")
	private static List<WebElement> leftNavigationItems2;
	
	@FindBy(xpath="//div[@class='cmp-tiles__entries']//a")
	private static List<WebElement> homePageTiles;
	
	@FindBy(xpath="(//div[@class='cmp-tiles__entry-title'])[1]")
	private WebElement legalTile;
	
	@FindBy(xpath="//div[@class='cmp-product-list__search-bar-container']")
	private WebElement landingPageComponentForLegalTile;
	
	@FindBy(xpath="//div[@class='cmp-tiles__entry-title']")
	private static List<WebElement> titleOfTiles;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement oneStopTitle;
	
	@FindBy(xpath="//div[@class='cmp-tiles__entry-desc']")
	private static List<WebElement> descriptionOfTiles;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement title;
	
	@FindBy(xpath="//div[@class='text cmp-tiles__description']")
	private WebElement descriptionOfTitle;
	
	@FindBy(xpath="(//a[@href='/us/en/my-products.html'])[1]")
	private WebElement logintoMyProduct;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/automation/homepage-demo/jcr:content/root/container/container/tiles/title']")
	private WebElement titleforAuthor;
	
	
	
	

	
	static Logger logger=Logger.getLogger("HomePage");
	
	
	
	public void setImage() {
		HelperFunctions.waitForPageToLoad(3);
		 Boolean image = (Boolean) ((JavascriptExecutor)Driver.getDriver()) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0",promotionBannerImage );
          if (image) {
	         Assert.assertTrue(true);
	      } else {
	         logger.error("The promotion banner does not contain an image");
	      }
		
	}
	public void setDescriptionOfBanner() {
		HelperFunctions.waitForPageToLoad(3);
		String actual=descriptionOfPromotionBanner.getText();
	      String expected="PwC's home for information on legal terms & conditions, security, and compliance for our licensed products.";
		  Assert.assertEquals(actual, expected, "The promotion banner does not match with the expected text.");
	}
	
	
	public void setPromotionBanner() {
		HelperFunctions.waitForPageToLoad(3);
		if(promotionBanner.isDisplayed()) {
			 Assert.assertTrue(true);
	      } else {
	         logger.error("The promotion banner is not visible to all users on homepage");
	      }
		
	}
	
	
	public void sethomePageTiles() {
		HelperFunctions.waitForPageToLoad(3);
		for(WebElement TilesItems:homePageTiles) {
			if(TilesItems.isDisplayed()) {
				Assert.assertTrue(true);
			}else {
				logger.error("Missing home page tile");
			}
	}
		
	}
	public void setLegalTile() {
		legalTile.click();
		HelperFunctions.waitForPageToLoad(10);
		if(landingPageComponentForLegalTile.isDisplayed()) {
			Assert.assertTrue(true);
		}else {
			logger.error("Landing page component does not exist");
		}
		
	}

	public void setTitleOfTiles() {
		for(WebElement eachTitle:titleOfTiles) {
			if(eachTitle.isDisplayed()) {
				Assert.assertTrue(true);
			}else {
				logger.error("Tiles do not contain a title");
			}
	}
		
		
	}
	
	public void setOneStopTitle() {
		String actualTitle=oneStopTitle.getText();
		String expectedTitle="One stop shop, for all your Product needs";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void setDescriptionOfTiles() {
		for(WebElement eachDescription: descriptionOfTiles) {
			System.out.println(eachDescription.getCssValue("-webkit-line-clamp"));
			if(eachDescription.getCssValue("-webkit-line-clamp").equals("6")) {
				Assert.assertTrue(true);
			}else {
				logger.error("The description is more than 6 lines");
				
			}
		}
	}
	
	public void setTitleAndDescription() {
		HelperFunctions.waitForPageToLoad(3);
		if(title.isDisplayed() && descriptionOfTitle.isDisplayed()) {
			Assert.assertTrue(true);
		}else {
			logger.error("The title or description does not exist on homepage");
			
		}
	}
	
	public void setTitleforAuthor() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
