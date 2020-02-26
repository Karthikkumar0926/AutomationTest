package com.automationpratice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpratice.helper.BaseClass;

public class BuyDress extends BaseClass {

	@FindBy(xpath = "(//*[text()='Dresses'])[2]")
	private WebElement linkDress;
	
	@FindBy(xpath = "(//*[@class='subcategory-name'])[1]")
	private WebElement linCasualkDress;
	
	
	@FindBy(xpath = "(//*[@class='right-block'])[1]")
	private WebElement ProductDetails;
	
	@FindBy(xpath = "(//*[@title='Add to cart'])[1]")
	private WebElement btnAddToBag;
	
	@FindBy(xpath = "(//*[contains(text(),'Proceed to checkout')])[1]")
	private WebElement btnProceedCheckout;
	
	@FindBy(xpath = "(//*[text()='Proceed to checkout'])[1]")
	private WebElement btnProceedCheckout2;
	
	@FindBy(xpath = "(//*[@id='email'])[1]")
	private WebElement txtRUName;
	
	@FindBy(xpath = "(//*[@id='passwd'])[1]")
	private WebElement txtRUPassword;
	
	@FindBy(xpath = "(//*[@id='SubmitLogin'])[1]")
	private WebElement BtnRUSignIn;
	
	@FindBy(xpath = "(//*[@name='processAddress'])[1]")
	private WebElement BtnprocessAddress;
	
	@FindBy(xpath = "(//*[@for='cgv'])[1]")
	private WebElement chbTandC;
	
	@FindBy(xpath = "(//*[@name='processCarrier'])[1]")
	private WebElement btnprocessCarrier;
	
	@FindBy(xpath = "(//*[@id='total_price'])[1]")
	private WebElement txtTotalPrice;
	
	
	public BuyDress () {
		PageFactory.initElements(driver, this);
	}


	public WebElement getLinkDress() {
		return linkDress;
	}


	public void setLinkDress(WebElement linkDress) {
		this.linkDress = linkDress;
	}


	public WebElement getLinCasualkDress() {
		return linCasualkDress;
	}


	public void setLinCasualkDress(WebElement linCasualkDress) {
		this.linCasualkDress = linCasualkDress;
	}


	public WebElement getProductDetails() {
		return ProductDetails;
	}


	public void setProductDetails(WebElement productDetails) {
		ProductDetails = productDetails;
	}


	public WebElement getBtnAddToBag() {
		return btnAddToBag;
	}


	public void setBtnAddToBag(WebElement btnAddToBag) {
		this.btnAddToBag = btnAddToBag;
	}


	public WebElement getBtnProceedCheckout() {
		return btnProceedCheckout;
	}


	public void setBtnProceedCheckout(WebElement btnProceedCheckout) {
		this.btnProceedCheckout = btnProceedCheckout;
	}


	public WebElement getBtnProceedCheckout2() {
		return btnProceedCheckout2;
	}


	public void setBtnProceedCheckout2(WebElement btnProceedCheckout2) {
		this.btnProceedCheckout2 = btnProceedCheckout2;
	}


	public WebElement getTxtRUName() {
		return txtRUName;
	}


	public void setTxtRUName(WebElement txtRUName) {
		this.txtRUName = txtRUName;
	}


	public WebElement getTxtRUPassword() {
		return txtRUPassword;
	}


	public void setTxtRUPassword(WebElement txtRUPassword) {
		this.txtRUPassword = txtRUPassword;
	}


	public WebElement getBtnRUSignIn() {
		return BtnRUSignIn;
	}


	public void setBtnRUSignIn(WebElement btnRUSignIn) {
		BtnRUSignIn = btnRUSignIn;
	}


	public WebElement getBtnprocessAddress() {
		return BtnprocessAddress;
	}


	public void setBtnprocessAddress(WebElement btnprocessAddress) {
		BtnprocessAddress = btnprocessAddress;
	}


	public WebElement getChbTandC() {
		return chbTandC;
	}


	public void setChbTandC(WebElement chbTandC) {
		this.chbTandC = chbTandC;
	}


	public WebElement getBtnprocessCarrier() {
		return btnprocessCarrier;
	}


	public void setBtnprocessCarrier(WebElement btnprocessCarrier) {
		this.btnprocessCarrier = btnprocessCarrier;
	}


	public WebElement getTxtTotalPrice() {
		return txtTotalPrice;
	}


	public void setTxtTotalPrice(WebElement txtTotalPrice) {
		this.txtTotalPrice = txtTotalPrice;
	}
	
}
