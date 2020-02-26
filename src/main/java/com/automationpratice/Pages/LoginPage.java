package com.automationpratice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpratice.helper.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(xpath = "(//*[@class='login'])[1]")
	private WebElement linkSignIn;
	
	@FindBy(xpath = "(//*[@class='logo img-responsive'])[1]")
	private WebElement BrandLogo;

	@FindBy(xpath = "(//*[@id='email_create'])[1]")
	private WebElement txtNewUserID;
	
	@FindBy(xpath = "(//*[@id='email'])[1]")
	private WebElement txtRUID;
	
	@FindBy(xpath = "(//*[@id='passwd'])[1]")
	private WebElement txtRUPassword;
	
	@FindBy(xpath = "(//*[@id='SubmitLogin'])[1]")
	private WebElement btnSignin;
	
	@FindBy(xpath = "(//*[@id='SubmitCreate'])[1]")
	private WebElement btnCreateAccount;
	
	@FindBy(xpath = "(//*[@id='customer_firstname'])[1]")
	private WebElement txtNUFirstName;
	
	@FindBy(xpath = "(//*[@id='customer_lastname'])[1]")
	private WebElement txtNULastName;
	
	
	@FindBy(xpath = "(//*[@id='passwd'])[1]")
	private WebElement txtNUPassword;
	
	@FindBy(xpath = "(//*[@id='firstname'])[1]")
	private WebElement txtFirstName;
	
	@FindBy(xpath = "(//*[@id='lastname'])[1]")
	private WebElement txtLastName;
	
	@FindBy(xpath = "(//*[@id='address1'])[1]")
	private WebElement txtAddress1;

	@FindBy(xpath = "(//*[@id='id_state'])[1]")
	private WebElement dropState;
	
	@FindBy(xpath = "(//*[@id='city'])[1]")
	private WebElement txtCity;
	
	@FindBy(xpath = "(//*[@id='postcode'])[1]")
	private WebElement txtPostcode;
	
	@FindBy(xpath = "//*[@class='logout']")
	private WebElement BtnSignOut;
	
	@FindBy(xpath = "//*[@class='account']")
	private WebElement txtUserName;
	
	public WebElement getBtnSignOut() {
		return BtnSignOut;
	}


	public void setBtnSignOut(WebElement btnSignOut) {
		BtnSignOut = btnSignOut;
	}


	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public void setTxtUserName(WebElement txtUserName) {
		this.txtUserName = txtUserName;
	}


	public WebElement getTxtPostcode() {
		return txtPostcode;
	}


	public void setTxtPostcode(WebElement txtPostcode) {
		this.txtPostcode = txtPostcode;
	}


	@FindBy(xpath = "(//*[@id='id_country'])[1]")
	private WebElement dropCountry;
	
	@FindBy(xpath = "(//*[@id='phone_mobile'])[1]")
	private WebElement txtPhone;
	
	@FindBy(xpath = "(//*[@id='submitAccount'])[1]")
	private WebElement btnRegister;
	

	public WebElement getBrandLogo() {
		return BrandLogo;
	}


	public void setBrandLogo(WebElement brandLogo) {
		BrandLogo = brandLogo;
	}


	public WebElement getTxtNewUserID() {
		return txtNewUserID;
	}


	public void setTxtNewUserID(WebElement txtNewUserID) {
		this.txtNewUserID = txtNewUserID;
	}


	public WebElement getTxtRUID() {
		return txtRUID;
	}


	public void setTxtRUID(WebElement txtRUID) {
		this.txtRUID = txtRUID;
	}


	public WebElement getTxtRUPassword() {
		return txtRUPassword;
	}


	public void setTxtRUPassword(WebElement txtRUPassword) {
		this.txtRUPassword = txtRUPassword;
	}


	public WebElement getBtnSignin() {
		return btnSignin;
	}


	public void setBtnSignin(WebElement btnSignin) {
		this.btnSignin = btnSignin;
	}


	public WebElement getBtnCreateAccount() {
		return btnCreateAccount;
	}


	public void setBtnCreateAccount(WebElement btnCreateAccount) {
		this.btnCreateAccount = btnCreateAccount;
	}


	public WebElement getTxtNUFirstName() {
		return txtNUFirstName;
	}


	public void setTxtNUFirstName(WebElement txtNUFirstName) {
		this.txtNUFirstName = txtNUFirstName;
	}


	public WebElement getTxtNULastName() {
		return txtNULastName;
	}


	public void setTxtNULastName(WebElement txtNULastName) {
		this.txtNULastName = txtNULastName;
	}


	public WebElement getTxtNUPassword() {
		return txtNUPassword;
	}


	public void setTxtNUPassword(WebElement txtNUPassword) {
		this.txtNUPassword = txtNUPassword;
	}


	public WebElement getTxtFirstName() {
		return txtFirstName;
	}


	public void setTxtFirstName(WebElement txtFirstName) {
		this.txtFirstName = txtFirstName;
	}


	public WebElement getTxtLastName() {
		return txtLastName;
	}


	public void setTxtLastName(WebElement txtLastName) {
		this.txtLastName = txtLastName;
	}


	public WebElement getTxtAddress1() {
		return txtAddress1;
	}


	public void setTxtAddress1(WebElement txtAddress1) {
		this.txtAddress1 = txtAddress1;
	}


	public WebElement getDropState() {
		return dropState;
	}


	public void setDropState(WebElement dropState) {
		this.dropState = dropState;
	}


	public WebElement getTxtCity() {
		return txtCity;
	}


	public void setTxtCity(WebElement txtCity) {
		this.txtCity = txtCity;
	}


	public WebElement getDropCountry() {
		return dropCountry;
	}


	public void setDropCountry(WebElement dropCountry) {
		this.dropCountry = dropCountry;
	}


	public WebElement getTxtPhone() {
		return txtPhone;
	}


	public void setTxtPhone(WebElement txtPhone) {
		this.txtPhone = txtPhone;
	}


	public WebElement getBtnRegister() {
		return btnRegister;
	}


	public void setBtnRegister(WebElement btnRegister) {
		this.btnRegister = btnRegister;
	}


	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getLinkSignIn() {
		return linkSignIn;
	}


	public void setLinkSignIn(WebElement linkSignIn) {
		this.linkSignIn = linkSignIn;
	}
}
