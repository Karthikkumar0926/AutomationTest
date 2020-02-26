package com.automationpratice.login;

import org.testng.annotations.Test;

import com.automationpratice.Pages.BuyDress;
import com.automationpratice.Pages.LoginPage;
import com.automationpratice.helper.BaseClass;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginpageTest extends BaseClass {
	WebDriver driver;
	LoginPage Loginpage;
	BaseClass Base;
	BuyDress Dress;
	
  @Test(enabled= true, priority =1)
  public void createAccount() {
	  Loginpage = new LoginPage();
	  Assert.assertTrue(elementFound(Loginpage.getLinkSignIn()));
	   System.out.println("LinkSignIn is showing properly");
	   System.out.println("Clicking the SignIn Link");
	   click(Loginpage.getLinkSignIn());
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    String SignInUrl = driver.getCurrentUrl();
	   System.out.println(SignInUrl);
	   Assert.assertTrue(elementFound(Loginpage.getTxtNewUserID()));
	   System.out.println("Entering the NewUser Id");
	    Random randomGenerator = new Random();  
	   int randomInt = randomGenerator.nextInt(1000);  
	   setText(Loginpage.getTxtNewUserID(), "karthikkumareng+"+ randomInt +"@gmail.com");
	   Reporter.log("NewUseName : " + "karthikkumareng+"+ randomInt +"@gmail.com");
	   System.out.println("Clicking the CreateAccount");
	   click(Loginpage.getBtnCreateAccount());
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   String AccountCreateUrl = driver.getCurrentUrl();
	   System.out.println(AccountCreateUrl);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   System.out.println("Entering the NewUser firstName");
	   setText(Loginpage.getTxtNUFirstName(), "Test");
	   Reporter.log("NewUserFirstName : "  +"Test" );
	   System.out.println("Entering the NewUser LastName");
	   setText(Loginpage.getTxtNULastName(), "Test");
	   Reporter.log("NewUserLastName :"  +"Test" );
	   System.out.println("Entering the NewUser Password");
	   setText(Loginpage.getTxtNUPassword(), "Tester@123");
	   Reporter.log("NewUserPassword : "  +"Tester@123" );
	   System.out.println("Entering the FirstName");
	   setText(Loginpage.getTxtFirstName(), "Test");
	   System.out.println("Entering the LastName");
	   setText(Loginpage.getTxtLastName(), "Test");
	   System.out.println("Entering the Address1");
	   Reporter.log("Address1 :" +"Test" );
	   setText(Loginpage.getTxtAddress1(), "Tester");
	   System.out.println("Entering the City");
	   setText(Loginpage.getTxtCity(), "Adamsvile");
	   Reporter.log("City :" + "Adamsvile" );
	   System.out.println("Entering the State");
	   Select S= new Select(Loginpage.getDropState());
	    S.selectByIndex(4);
	   System.out.println("Entering the Zipecode");
	   setText(Loginpage.getTxtPostcode(), "02138");
	   Reporter.log("Postcode :"  +"02138" );
	   System.out.println("Entering the PhoneNo");
	   setText(Loginpage.getTxtPhone(), "9876543210");
	   Reporter.log("Phone :"  +"9876543210" );
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println("Clicking the Register");
	   click(Loginpage.getBtnRegister());
	   Reporter.log("Clicked Register" );
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
  }
  
  
  @Test(enabled= true, priority =2)
  public void ReturnUserSign() {
	  Loginpage = new LoginPage();
	  Assert.assertTrue(elementFound(Loginpage.getLinkSignIn()));
	   System.out.println("LinkSignIn is showing properly");
	   System.out.println("Clicking the SignIn Link");
	   click(Loginpage.getLinkSignIn());
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   String SignInUrl = driver.getCurrentUrl();
	   System.out.println(SignInUrl);
	   Assert.assertTrue(elementFound(Loginpage.getTxtRUID()));
	   System.out.println("Entering the ReturnUser Id");
	   setText(Loginpage.getTxtRUID(), "karthikkumareng+1@gmail.com");
	   Reporter.log("ReturnUserName : karthikkumareng+1@gmail.com" );
	   System.out.println("Entering the ReturnPassword Id");
	   setText(Loginpage.getTxtRUPassword(), "Tester@123");
	   Reporter.log("ReturnPassord :Tester@123" );
	   System.out.println("Clicking the SignInAccount");
	   click(Loginpage.getBtnSignin());
	   Reporter.log("Clicked SignInAccount" );
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   String AccountCreateUrl = driver.getCurrentUrl();
	   System.out.println(AccountCreateUrl);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
  }
  
  @Test(enabled= true, priority =3)
  public void buyDress() throws InterruptedException {
	  Dress = new BuyDress();
	  System.out.println("Clicking the Dress");
	  Assert.assertTrue(elementFound(Dress.getLinkDress()));
	  clickbyJs(Dress.getLinkDress());
	  Reporter.log("selecting the Dressoption" );
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   System.out.println("Clicking the CasualkDress");
	   Reporter.log("selecting the CasualkDress" );
	   Assert.assertTrue(elementFound(Dress.getLinCasualkDress()));
	   clickbyJs(Dress.getLinCasualkDress());
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   Thread.sleep(3000);
	   System.out.println("Mouse Hover to Product Details");
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,650)");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   Actions A = new Actions(driver);
	    A.moveToElement(Dress.getProductDetails()).build().perform();
	   System.out.println("Clicking the AddtoBag Btn");
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   click(Dress.getBtnAddToBag());
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   System.out.println("Clicking the Proceed Checkout1");
	   Thread.sleep(3000);
	   clickbyJs(Dress.getBtnProceedCheckout());
	   driver.get("http://automationpractice.com/index.php?controller=order");
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   js.executeScript("window.scrollBy(0,750)");
	   System.out.println("Clicking the Proceed Checkout2");
	   Thread.sleep(3000);
	   click(Dress.getBtnProceedCheckout2());
	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("Entering the ReturnUser Id");
	   setText(Dress.getTxtRUName(), "karthikkumareng+1@gmail.com");
	   Reporter.log("Signin as ReturnUser : karthikkumareng+1@gmail.com " );
	   System.out.println("Entering the ReturnPassword");
	   setText(Dress.getTxtRUPassword(), "Tester@123");
	   Reporter.log("Clicked the processAddress Button" );
	   System.out.println("Clicking the SignInAccount");
	   Reporter.log("Entering the ReturnPassword : Tester@123" );
	   click(Dress.getBtnRUSignIn());
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   String AccountCreateUrl = driver.getCurrentUrl();
	   System.out.println(AccountCreateUrl);
	   System.out.println("Clicking the processAddress Button");
	   click(Dress.getBtnprocessAddress());
	   Reporter.log("Clicked the processAddress Button" );
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   js.executeScript("window.scrollBy(0,550)");
	   System.out.println("Checking  the Terms and conditions");
	   click(Dress.getChbTandC());
	   Reporter.log("selecting the Terms and conditions" );
	    System.out.println("Clicking the ProcessCarrier Button");
	   click(Dress.getBtnprocessCarrier());
	   Reporter.log("processCarrier" );
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   js.executeScript("window.scrollBy(0,850)");
	   System.out.println("Getting the Total price at payment page");
	     String Totalprice = getText(Dress.getTxtTotalPrice());
	   System.out.println("Totalprice --->" + Totalprice);
	   Reporter.log("Totalprice --->" + Totalprice );
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://automationpractice.com/index.php");
	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	   System.out.println("Maximize the window");
	   driver.manage().window().maximize();
	   System.out.println("Brand Logo is Appearing properly");
	   
  }

  @AfterMethod
  public void afterMethod() {
	  Loginpage = new LoginPage();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Assert.assertTrue(elementFound(Loginpage.getBtnSignOut()));
	  Assert.assertTrue(elementFound(Loginpage.getTxtUserName()));
	  String UserName = getText(Loginpage.getTxtUserName());
	   System.out.println("ReturnUser --->" +UserName);
	   Reporter.log("ReturnUser --->" + "UserName");
	   click(Loginpage.getBtnSignOut());
  }

 
  @BeforeSuite
  public void beforeSuite() {
	  Loginpage = new LoginPage();
	 driver = getDriver();
	 System.out.println("Launching the Automationpractice Site");
	   
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  System.out.println("Closing the Automationpractice Site");
  }

}
