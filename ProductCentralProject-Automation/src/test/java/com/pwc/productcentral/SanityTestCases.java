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
import Pages.ResellerPage;


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
	//log
	
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
	public void WEB_5_1() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 8));
		   ExtentTest test = extent.createTest("Verify that user is able to click the breadcrumb and navigate to the previous page(Reseller Page)");
	       test.info("The user is able to click the breadcrumb and navigate to the previous page");
	       rp.setBreadcrumbs();
		   logger.info("Test WEB_5_1 has passed");
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
	public void WEB_11() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 4));
		ExtentTest test = extent.createTest("Verify the user is able to view the related links and content");
	    test.info("The user is able to view the related links and content");
	    plp.setAllLinks();
		logger.info("Test WEB_11 has passed");
	}
	@Test(enabled=false)
	public void WEB_13() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 4));
		   ExtentTest test = extent.createTest("Verify each link represents the content page for the product");
	       test.info("Each link represents the content page for the product");
	       plp.setLinks();
		   logger.info("Test WEB_13 has passed");
	}
	@Test(enabled=false)
	public void WEB_15() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		   ExtentTest test = extent.createTest("Verift if the user is already logged in don't display 'log onto my products'link");
	       test.info("When the user is already logged in 'log onto my products'link are not displayed");
	       plp.setLinks();
		   logger.info("Test WEB_15 has passed");
	}
	
	
	@Test (enabled=false)
	public void WEB_17() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify description can only be a maximum of 6 lines, anything more than that will be truncated");
	    test.info("The description is not more than 6 lines");
	    hp.setDescriptionOfTiles();
	    logger.info("Test WEB_17 has passed");
	}
	@Test (enabled=false)
	public void WEB_18() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify homepage tile is visible to all users on homepage");
	    test.info("The homepage tile is visible to all users on homepage");
	    hp.sethomePageTiles();
	    logger.info("Test WEB_18 has passed");
	}
	
	@Test(enabled=false)
	public void WEB_19() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 4));
		   ExtentTest test = extent.createTest("Verify PDF viewer/controls appear at the bottom of the page");
	       test.info("PDF viewer/controls appear at the bottom of the page");
	       plp.setPdfControllers();
		   logger.info("Test WEB_19 has passed");
	}
	
	
	
	@Test
	public void WEB_20() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("(Home Page)Verify that when left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    test.info("(Home Page)When left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    BasePage.setCollapseButton();
		logger.info("Test WEB_20 has passed");
	}
	@Test
	public void WEB_20_1() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 9));
		ExtentTest test = extent.createTest("(Legal Page)Verify that when left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    test.info("(Legal Page)When left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    BasePage.setCollapseButton();
		logger.info("Test WEB_20_1 has passed");
	}
	@Test
	public void WEB_20_2() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 6));
		ExtentTest test = extent.createTest("(Product Listing Page)Verify that when left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    test.info("(Product Listing Page)When left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    BasePage.setCollapseButton();
		logger.info("Test WEB_20_2 has passed");
	}
	@Test
	public void WEB_20_3() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 8));
		ExtentTest test = extent.createTest("(Reseller Page)Verify that when left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    test.info("(Reseller Page)When left navigation collapsed,only the collapsed icon will be displayed and on hover over the icon will say 'collapse'");
	    BasePage.setCollapseButton();
		logger.info("Test WEB_20_3 has passed");
	}
	
	@Test
	public void WEB_21() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify left navigation component is visible to user(Home Page)");
	    test.info("Left navigation component is visible to user");
	    BasePage.setLeftNavigationItems2();
		logger.info("Test WEB_21 has passed");
	}
	@Test
	public void WEB_21_1() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 9));
		ExtentTest test = extent.createTest("Verify left navigation component is visible to user(Legal Page)");
	    test.info("Left navigation component is visible to user");
	    BasePage.setLeftNavigationItems2();
		logger.info("Test WEB_21_1 has passed");
	}
	@Test
	public void WEB_21_2() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 6));
		ExtentTest test = extent.createTest("Verify left navigation component is visible to user(Product Listing Page)");
	    test.info("Left navigation component is visible to user");
	    BasePage.setLeftNavigationItems2();
		logger.info("Test WEB_21_2 has passed");
	}
	@Test
	public void WEB_21_3() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 8));
		ExtentTest test = extent.createTest("Verify left navigation component is visible to user(Reseller Page)");
	    test.info("Left navigation component is visible to user");
	    BasePage.setLeftNavigationItems2();
		logger.info("Test WEB_21_3 has passed");
	}
	@Test(enabled=false)
	public void WEB_22() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify that when user clicks on the tile then user navigate to a hyperlink page within the tab");
	    test.info("When user clicks on the tile then user navigate to a hyperlink page within the tab");
	    hp.setLegalTile();
	    System.out.println(Driver.getDriver().getTitle());
	    logger.info("Test WEB_22 has passed");
	}
	@Test (enabled=false)
	public void WEB_23() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify that each tile will contain a title");
	    test.info("Each tile contains a title");
	    hp.setTitleOfTiles();
	    logger.info("Test WEB_23 has passed");
	}
	@Test (enabled=false)
	public void WEB_24() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify that title is like 'One stop shop, for all your Product needs' as per pre defined");
	    test.info("The title is like 'One stop shop, for all your Product needs' as per pre defined");
	    hp.setOneStopTitle();
	    logger.info("Test WEB_24 has passed");
	}
	
	@Test (enabled=false)
	public void WEB_25() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 10));
		ExtentTest test = extent.createTest("Verify the author is able to define the title");
	    test.info("The author is able to define the title");
	    
	    logger.info("Test WEB_25 has passed");
	}
	@Test (enabled=false)//AUTHOR-UNCOMPLETED
	public void WEB_29() throws Exception{
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
		
		   
		   logger.info("Test WEB_29 has passed");
	}
	@Test (enabled=false) //AUTHOR-UNCOMPLETED
	public void WEB_10() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 5));
		ExtentTest test = extent.createTest("Verify the user must be able to manually author the footer");
	    test.info("The user is able to manually author the footer");
	    hpt.setFooter();
	}
	@Test(enabled=false)
	public void WEB_60() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the footer section size style and design should be fixed and cannot be editable");
	    test.info("The footer section size style and design are fixed and are not been editable");
	    BasePage.setFooterHome();
	    logger.info("Test WEB_60 has passed");
	}
	
	
	@Test (enabled=false)
	public void WEB_61() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the no spelling mistake for the text on the footer section");
	    test.info("There is no spelling mistake for the text on the footer section");
	    BasePage.setHomePageTemplateElements();
	    BasePage.setFooterTextandPosition();
	    logger.info("Test WEB_61 has passed");
	}
	@Test (enabled=false)
	public void WEB_63() throws Exception{
		ReadXLSdata read=new ReadXLSdata();
		read.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().get(read.getCellData("VALUE", 2));
		ExtentTest test = extent.createTest("Verify the position of the footer");
	    test.info("The footer is on the right position");
	    BasePage.setFooterTextandPosition();
	    logger.info("Test WEB_63 has passed");
	}
	



	
	
	
	
	

	
	
	/******************************************************************************************************************************/
	
	
	
	
	
	@AfterSuite
	public void closingBrowser() {
		extent.flush();
		Driver.closeDriver();
	}
	


	

}