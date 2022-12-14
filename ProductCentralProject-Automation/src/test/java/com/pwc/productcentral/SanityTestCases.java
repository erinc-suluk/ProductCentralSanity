package com.pwc.productcentral;



import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.BasePage;
import Pages.ChangeNavigatorPage;
import Pages.HomePage;
import Pages.HomePageTemplatePage;
import Pages.LegalPage;
import Pages.LoginPageObjects;

import Pages.ProductListingPage;
import Pages.ProductPage;
import Pages.ResellerPage;
import Pages.SecurityPage;


public class SanityTestCases extends BasePage {
	
	ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	public static ConfigurationsReader read;
	String platform = null;
	LoginPageObjects lpo=new LoginPageObjects();
	HomePage hp=new HomePage();
	ChangeNavigatorPage cnp=new ChangeNavigatorPage();
	ProductListingPage plp=new ProductListingPage();
	HomePageTemplatePage hpt=new HomePageTemplatePage();
	ResellerPage rp=new ResellerPage();
	LegalPage lp=new LegalPage();
	SecurityPage sp=new SecurityPage();
	ProductPage pp=new ProductPage();
	
	
	Logger logger=Logger.getLogger("SanityTestCases");
	
	
	


	
	@BeforeSuite
	public void setUp() {
		 PropertyConfigurator.configure(".\\log4j.properties");
		 read = new ConfigurationsReader();
		 platform = read.getPlatform();
		 read.platformName();
		 htmlReporter = new ExtentHtmlReporter("Automation Report for QA.html");
	     extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	     
	}
			
	@BeforeMethod
	public void initTest() {
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().deleteAllCookies();
		HelperFunctions.setWaitTime();
		//Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));
	}
	
	
	/*******************************************************Sanity Test Case********************************************************/
	
	/*
	@Test(enabled=false)
	public void WEB_1() throws IOException {
	   Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));
	   ExtentTest test = extent.createTest("Verify login functionality with valid credentials");
       test.info("Successfully login");
       String path=captureScreenshot("fail.png");
       test.addScreenCaptureFromPath(path);
	   lpo.setUsername(ConfigurationsReader.getProperties("authorUsername"));
	   lpo.setPassword(ConfigurationsReader.getProperties("authorPass"));
	   lpo.setSignInButton();
	   logger.info("Test WEB_1 has passed");
	}*/
	@Test(enabled=false)
	public void WEB_1() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the promotion banner must contain an image");
	    test.info("the promotion banner contains an image");
	    hp.setImage();
	    logger.info("Test WEB_1 has passed");
	    
	}
	@Test(enabled=false)
	public void WEB_2() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the promotion banner must contain a description  'PwC's home for information on legal terms & conditions, security, and compliance for our licensed products.'");
	    test.info("The promotion banner contains a description");
	    hp.setDescriptionOfBanner();
	    logger.info("Test WEB_2 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_3() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the promotion banner is visible to all users on homepage");
	    test.info("The promotion banner is visible to all users on homepage");
	    hp.setPromotionBanner();
	    logger.info("Test WEB_3 has passed");
	}
	@Test (enabled=false)
	public void WEB_4() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 4));
		   ExtentTest test = extent.createTest("Verify related links are visible to all users on content page");
	       test.info("Related links are visible to all users on content page");
	       plp.setAllLinks();
		   logger.info("Test WEB_4 has passed");
		  	   
	}
	@Test(enabled=false)
	public void WEB_5() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 4));
		   ExtentTest test = extent.createTest("Verify that user is able to click the breadcrumb and navigate to the previous page(Products Page)");
	       test.info("The user is able to click the breadcrumb and navigate to the previous page");
	       plp.setBreadcrumbs();
		   logger.info("Test WEB_5 has passed");
	
	}
	@Test(enabled=false)
	public void WEB_5_2() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 9));
		   ExtentTest test = extent.createTest("Verify that user is able to click the breadcrumb and navigate to the previous page(Legal Page)");
	       test.info("The user is able to click the breadcrumb and navigate to the previous page");
	       lp.setlegalTiles();
		   logger.info("Test WEB_5_2 has passed");
	}
	@Test(enabled=false)
	public void WEB_6() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 4));
		   ExtentTest test = extent.createTest("Verify that breadcrumb contains a link");
	       test.info("The breadcrumb contains a link");
	       plp.setLinkOfBreadcrumbs();
		   logger.info("Test WEB_6 has passed");
	}
	@Test(enabled=false)
	public void WEB_7() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the user is able to view the page title and description");
	    test.info("The user is able to view the page title and description");
	    hp.setTitleAndDescription();
	    logger.info("Test WEB_7 has passed");
	}
	@Test(enabled=false)
	public void WEB_8() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 4));
		ExtentTest test = extent.createTest("Verify the user is able to view the related links and content");
	    test.info("The user is able to view the related links and content");
	    plp.setAllLinks();
		logger.info("Test WEB_8 has passed");
	}
	@Test(enabled=false)
	public void WEB_9() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 4));
		   ExtentTest test = extent.createTest("Verify each link represents the content page for the product");
	       test.info("Each link represents the content page for the product");
	       plp.setLinks();
		   logger.info("Test WEB_9 has passed");
	}
	@Test(enabled=false)
	public void WEB_10() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		   ExtentTest test = extent.createTest("Verift if the user is already logged in don't display 'log onto my products'link");
	       test.info("When the user is already logged in 'log onto my products'link are not displayed");
	       plp.setLinks();
		   logger.info("Test WEB_10 has passed");
	}
	
	
	@Test (enabled=false)
	public void WEB_11() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify description can only be a maximum of 6 lines, anything more than that will be truncated");
	    test.info("The description is not more than 6 lines");
	    hp.setDescriptionOfTiles();
	    logger.info("Test WEB_11 has passed");
	}
	@Test (enabled=false)
	public void WEB_12() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify homepage tile is visible to all users on homepage");
	    test.info("The homepage tile is visible to all users on homepage");
	    hp.sethomePageTiles();
	    logger.info("Test WEB_12 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_13() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 4));
		   ExtentTest test = extent.createTest("Verify PDF viewer/controls appear at the bottom of the page");
	       test.info("PDF viewer/controls appear at the bottom of the page");
	       plp.setPdfControllers();
		   logger.info("Test WEB_13 has passed");
	}
	
	
	
	@Test(enabled=false)
	public void WEB14() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("(Home Page)Verify that when left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    test.info("(Home Page)When left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    BasePage.setCollapseButton();
		logger.info("Test WEB_14 has passed");
	}
	@Test(enabled=false)
	public void WEB_14_1() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 9));
		ExtentTest test = extent.createTest("(Legal Page)Verify that when left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    test.info("(Legal Page)When left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    BasePage.setCollapseButton();
		logger.info("Test WEB_14_1 has passed");
	}
	@Test(enabled=false)
	public void WEB_14_2() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 6));
		ExtentTest test = extent.createTest("(Product Listing Page)Verify that when left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    test.info("(Product Listing Page)When left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    BasePage.setCollapseButton();
		logger.info("Test WEB_14_2 has passed");
	}
	@Test(enabled=false)
	public void WEB_14_3() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 8));
		ExtentTest test = extent.createTest("(Reseller Page)Verify that when left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    test.info("(Reseller Page)When left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    BasePage.setCollapseButton();
		logger.info("Test WEB_14_3 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_15() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify left navigation component is visible to user(Home Page)");
	    test.info("Left navigation component is visible to user");
	    BasePage.setLeftNavigationItems2();
		logger.info("Test WEB_15 has passed");
	}
	@Test(enabled=false)
	public void WEB_15_1() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 9));
		ExtentTest test = extent.createTest("Verify left navigation component is visible to user(Legal Page)");
	    test.info("Left navigation component is visible to user");
	    BasePage.setLeftNavigationItems2();
		logger.info("Test WEB_15_1 has passed");
	}
	@Test(enabled=false)
	public void WEB_15_2() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 6));
		ExtentTest test = extent.createTest("Verify left navigation component is visible to user(Product Listing Page)");
	    test.info("Left navigation component is visible to user");
	    BasePage.setLeftNavigationItems2();
		logger.info("Test WEB_15_2 has passed");
	}
	@Test(enabled=false)
	public void WEB_15_3() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 8));
		ExtentTest test = extent.createTest("Verify left navigation component is visible to user(Reseller Page)");
	    test.info("Left navigation component is visible to user");
	    BasePage.setLeftNavigationItems2();
		logger.info("Test WEB_15_3 has passed");
	}
	@Test(enabled=false)
	public void WEB_16() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify that when user clicks on the tile then user navigate to a hyperlink page within the tab");
	    test.info("When user clicks on the tile then user navigate to a hyperlink page within the tab");
	    hp.setLegalTile();
	    System.out.println(Driver.getDriver().getTitle());
	    logger.info("Test WEB_16 has passed");
	}
	@Test (enabled=false)
	public void WEB_17() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify that each tile will contain a title");
	    test.info("Each tile contains a title");
	    hp.setTitleOfTiles();
	    logger.info("Test WEB_17 has passed");
	}
	@Test (enabled=false)
	public void WEB_18() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify that title is like 'One stop shop, for all your Product needs' as per pre defined");
	    test.info("The title is like 'One stop shop, for all your Product needs' as per pre defined");
	    hp.setOneStopTitle();
	    logger.info("Test WEB_18 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_19() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 10));
		ExtentTest test = extent.createTest("Verify the author is able to define the title");
	    test.info("The author is able to define the title");
	    
	    logger.info("Test WEB_19 has passed");
	}
	@Test(enabled=false) //AUTHOR-UNCOMPLETED
	public void WEB_20() throws Exception{
		//ReadXLSdata read=new ReadXLSdata();
		//read.setExcelFile("./testdata.xlsx", "QA");
		//Driver.getDriver().get(read.getCellData("VALUE", 3));
		 Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));
		   ExtentTest test = extent.createTest("Verify on click on load more, another 5 assets must be loaded");
	       test.info("When clicking on load more, another 5 assets are loaded");
	       lpo.setUsername(ConfigurationsReader.getProperties("authorUsername"));
		   lpo.setPassword(ConfigurationsReader.getProperties("authorPass"));
		   lpo.setSignInButton();
		   cnp.setSites();
		
		   
		   logger.info("Test WEB_20 has passed");
	}
	@Test (enabled=false) //AUTHOR-UNCOMPLETED
	public void WEB_21() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 5));
		ExtentTest test = extent.createTest("Verify the user must be able to manually author the footer");
	    test.info("The user is able to manually author the footer");
	    hpt.setFooter();
	}
	@Test(enabled=false)
	public void WEB_22() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the footer section size style and design should be fixed and cannot be editable");
	    test.info("The footer section size style and design are fixed and are not been editable");
	    BasePage.setFooterHome();
	    logger.info("Test WEB_22 has passed");
	}
	
	
	@Test (enabled=false)
	public void WEB_23() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the no spelling mistake for the text on the footer section");
	    test.info("There is no spelling mistake for the text on the footer section");
	    BasePage.setHomePageTemplateElements();
	    BasePage.setFooterTextandPosition();
	    logger.info("Test WEB_23 has passed");
	}
	@Test (enabled=false)
	public void WEB_24() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the position of the footer");
	    test.info("The footer is on the right position");
	    BasePage.setFooterTextandPosition();
	    logger.info("Test WEB_24 has passed");
	}
	@Test (enabled=false)
	public void WEB_25() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 11));
		ExtentTest test = extent.createTest("Verify that flow is same in legal for security");
	    test.info("Verified that flow is same in legal for security");
	    sp.setSecurityTiles();
	    logger.info("Test WEB_25 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_26() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify on click of a search results the user will be navigated to the content type");
	    test.info("On click of a search results the user is navigated to the content type");
	    hp.setSearchButton();
	    logger.info("Test WEB_26 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_27() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify on selection, the results are automatically sorted");
	    test.info("Verified, the results are automatically sorted");
	    hp.setSortedResult();
	    logger.info("Test WEB_27 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_28() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 6));
		ExtentTest test = extent.createTest("Verify that on selection a result, display the relevant product on the page");
	    test.info("Verified that on selection a result, display the relevant product on the page");
	    plp.setSearchBox();
	    logger.info("Test WEB_28 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_29() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 6));
		ExtentTest test = extent.createTest("Verify that search results are based on keywords");
	    test.info("Verified that search results are based on keywords");
	    plp.setSearchResult();
	    logger.info("Test WEB_29 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_30() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 11));
		ExtentTest test = extent.createTest("Verify that no change to the home page or side nav");
	    test.info("Verified that no change to the home page or side nav");
	    BasePage.setLeftNavigationItems2();
	    logger.info("Test WEB_30 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_31() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 11));
		ExtentTest test = extent.createTest("Verify the filter will be a dropdown which will display the My products document categories matching the search results");
	    test.info("The filter is a dropdown which displays the My products document categories matching the search results");
	    hp.setDropdown();
	    logger.info("Test WEB_31 has passed");
	}
	
	
	@Test (enabled=false)
	public void WEB_32() throws Exception{
		 Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));
		   ExtentTest test = extent.createTest("Verify the doc categories will be based on Taxonomy document");
	       test.info("Verified the doc categories will be based on Taxonomy document");
	       lpo.setUsername(ConfigurationsReader.getProperties("authorUsername"));
		   lpo.setPassword(ConfigurationsReader.getProperties("authorPass"));
		   lpo.setSignInButton();
		   cnp.setDocCategory();
	}
	
	@Test (enabled=false)
	public void WEB_33() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify that message shown is 403: You do not have access to this page.Please contact our support team for further assistance.(Link to service now where user can submit a ticket)");
	    test.info("Verified that message shown is 403: You do not have access to this page.Please contact our support team for further assistance. (Link to service now where user can submit a ticket)");
	    lpo.setLogin();
	    pp.setErrorMessage();
	    logger.info("Test WEB_33 has passed");
	}
	
	
	@Test (enabled=false)//!!
	public void WEB_34() throws Exception{
		 Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));
		   ExtentTest test = extent.createTest("Verify the doc categories will be based on Taxonomy document");
	       test.info("Verified the doc categories will be based on Taxonomy document");
	       lpo.setUsername(ConfigurationsReader.getProperties("authorUsername"));
		   lpo.setPassword(ConfigurationsReader.getProperties("authorPass"));
		   lpo.setSignInButton();
		   cnp.setDate();
	}
	@Test (enabled=false)
	public void WEB_35() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify that dropdown list will display the Product & document category as per the latest Tag taxonomy document");
	    test.info("The dropdown list displays the Product & document category as per the latest Tag taxonomy document");
	    hp.setDropdownList();
	    hp.setDropdownList2();
	    logger.info("Test WEB_37 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_36() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the user should see different footer items if logged in");
	    test.info("The user does not see footer link group if logged in");
	    pp.setFooterWithoutLogin();
	    logger.info("Test WEB_37 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_36_1() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify the user should see different footer items if logged in");
	    test.info("The user sees footer link group if logged in");
	    lpo.setLogin();
	    pp.setFooterWithLogin();
	    logger.info("Test WEB_36_1 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_37() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify when the user clicks on next will display the next 5 assets of my product landing page");
	    test.info("When the user clicks on next,the next 5 assets of my product landing page are displayed");
	    lpo.setLogin();
	    pp.setDisplayResources();
	    logger.info("Test WEB_37 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_38() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify when the user clicks on any item the specified asset/page must be loaded in the new tab");
	    test.info("When the user clicks on any item the specified asset/page is loaded in the new tab");
	    lpo.setLogin();
	    pp.setNewTabAssets();
	    logger.info("Test WEB_38 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_39() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify when the user clicks on any item the specified asset/page must be loaded in the new tab");
	    test.info("When the user clicks on any item the specified asset/page is loaded in the new tab");
	    lpo.setLogin();
	    pp.setNewTabAssets();
	    logger.info("Test WEB_39 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_40() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify if user is logged in, then My Products heading in the sitemap is visible");
	    test.info("When user is logged in,My Products heading in the sitemap is visible");
	    lpo.setLogin();
	    pp.setMyProductSitemap();
	    logger.info("Test WEB_40 has passed");
	}
	
	@Test  (enabled=false)
	public void WEB_41() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify the tags accompany the items which are assets");
	    test.info("Verified the tags accompany the items which are assets");
	    lpo.setLogin();
	    pp.setTagsAccompany();
	    logger.info("Test WEB_41 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_42() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify that this page should appear to all Site Visitors that are logged in but do not have the right level of permissions to access the page");
	    test.info("Verified that this page should appear to all Site Visitors that are logged in but do not have the right level of permissions to access the page)");
	    lpo.setLogin();
	    pp.setErrorPage();
	    logger.info("Test WEB_42 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_43() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify there are 2 filters with minor differences between Global and My Products search");
	    test.info("Verified there are 2 filters with minor differences between Global and My Products search");
	    lpo.setLogin();
	    pp.setMyProductSearch();
	    logger.info("Test WEB_43 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_44() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 13));
		ExtentTest test = extent.createTest("Verify the all resources component is presenting a list of 5 assets that are relevant to the product on the product landing page");
	    test.info("Verified the all resources component is presenting a list of 5 assets that are relevant to the product on the product landing page");
	    lpo.setLogin();
	    pp.setResourcesBasedonProducts();
	    logger.info("Test WEB_44 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_45() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 8));
		ExtentTest test = extent.createTest("Verify that page title is visible on page and it displays the name of the product");
	    test.info("Verified that page title is visible on page and it displays the name of the product");
	    rp.setPageTitleAndProducts();
	    logger.info("Test WEB_45 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_46() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 8));
		ExtentTest test = extent.createTest("Verify that breadcrumb will contain a link of the previous page of the site and must respect the UI design");
	    test.info("The breadcrumb contains a link of the previous page of the site and respect the UI design");
	    rp.setBreadcrumbs();
	    logger.info("Test WEB_46 has passed");
	}
	
	@Test 
	public void WEB_47() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 9));
		ExtentTest test = extent.createTest("Verify the content pages will be tagged accordingly");
	    test.info("Verified the content pages are tagged accordingly");
	    lp.setContentPageTags();
	    logger.info("Test WEB_47 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_48() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 9));
		ExtentTest test = extent.createTest("Verify document tile can have 3 lines of description");
	    test.info("Verified document tiles have 3 lines of description");
	    lp.setDescriptionOfTiles();
	    logger.info("Test WEB_48 has passed");
	}
	
	
	
	
	
	
	
	
	
	
	
	



	
	
	
	
	

	
	
	/******************************************************************************************************************************/
	
	
	
	
	
	@AfterSuite
	public void closingBrowser() {
		extent.flush();
		//Driver.closeDriver();
	}
	


	

}