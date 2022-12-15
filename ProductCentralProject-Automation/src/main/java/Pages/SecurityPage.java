
package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;

public class SecurityPage extends HelperFunctions {
	public SecurityPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		} 
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement pageTitle;
	
	@FindBy(xpath="//div[@class='cmp-legal-product-listing__tiles']")
	private static List<WebElement> securityTiles;
	
	@FindBy(xpath="//div[@id='productListingDropdown']")
	private WebElement productListingDropdown;
	
	@FindBy(xpath="//div[@id='sortingDropdown']")
	private WebElement sortingDropdown;
	
	
	
	public void setSecurityTiles() {
		
		String securityTitle="Security";
		Assert.assertEquals(pageTitle.getText(), securityTitle);
		
		boolean isAllDisplayed = true;
        for(WebElement eachTiles : securityTiles){
            if(eachTiles.isDisplayed() == false){
                isAllDisplayed = false;
                break;
            }
        }
       
       HelperFunctions.staticWait(3);
       Boolean pld=productListingDropdown.isDisplayed();
       System.out.println("Product Listing Dropdown is displayed  :" + pld);
       HelperFunctions.staticWait(3);
       Boolean sd=sortingDropdown.isDisplayed();
       System.out.println("Sorting Dropdown is displayed  :" + sd);
     
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
