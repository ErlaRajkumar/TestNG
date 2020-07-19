package com.facebook.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	
	// SelectingMessengerIcon
	@FindBy(xpath = "(//div[@class='oajrlxb2 tdjehn4e qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso i1ao9s8h esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l bp9cbjyn s45kfl79 emlxlaya bkmhp75w spb7xbtv rt8b4zig n8ej3o3l agehan2d sk4xxmp2 taijpn5t qypqp5cg q676j6op'])[4]")
	private WebElement messengerIcon;

	// SelectingAnFriend
	@FindBy(xpath = "(//span[contains(text(),'Raj Kumar')]/ancestor::div[2])[1]")
	private WebElement selectFriend;
	
	// Sending Text Message
	@FindBy(xpath = "//*[@id=\"mount_0_0\"]/div/div/div[1]/div[5]/div[1]/div[1]/div[1]/div/div/div[1]/div/div/div/div[2]/div/div[2]/form/div/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div/div")
	private WebElement sendingText;
	
	// Sending The Like Button
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M3.3,6H0.7')]")
	private WebElement sendingLike;
	
	//Sending The GIF
	@FindBy(xpath = "//div[@class='pmk7jnqg kkf49tns cgat1ltu sw24d88r i09qtzwb timu3f6w g3zh7qmp flx89l3n mb8dcdod chkx7lpg']//div[@class='oajrlxb2 gs1a9yip g5ia77u1 mtkw9kbi tlpljxtp qensuy8j ppp5ayq2 goun2846 ccm00jje s44p3ltw mk2mc5f4 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv nhd2j8a9 pq6dq46d mg4g778l btwxx1t3 pfnyh3mw p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x tgvbjcpo hpfvmrgz jb3vyjys ph5uu5jm e5nlhep0 b3onmgus l9j0dhe7 i1ao9s8h esuyzwwr f1sip0of du4w35lb lzcic4wl abiwlrkh p8dawk7l']//*[local-name()='svg']")
	private WebElement clickingGIFIcon;
	
	//Searching For GIF
	@FindBy(xpath = "//input[@class='oajrlxb2 rq0escxv f1sip0of hidtqoto lzcic4wl ijkhr0an nlq1og4t sgqwj88q b3i9ofy5 oo9gr5id b1f16np4 hdh3q7d8 dwo3fsh8 qu0x051f esr5mh6w e9989ue4 r7d6kgcz br7hx15l h2jyy9rg n3ddgdk9 owxd89k7 ihxqhq3m jq4qci2q k4urcfbm iu8raji3 tv7at329 l60d2q6s d1544ag0 hwnh5xvq tw6a2znq o1lsuvei']")
	private WebElement searchGIF;
	
	//Selecting the Searched GIF
	@FindBy(xpath = "//img[@src='https://media.tenor.co/images/f693d6332b5468427075a09c6b7d93f8/tenor.gif?riffsid=T1RRMk1Ea3lObDkwYUE9PTB6xB_TyJJiyJ1mCd-fEE-dwI-b3PXIwB1nETDy-_87yXKCaEFVjiVqdf3f_hxkbF24-w']")
	private WebElement sendingGIF;
	
	// ClosingTheTab
	@FindBy(xpath = "//div[@aria-label='Close tab']")
	private WebElement cancelButton;

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectingMessengerIcon() {
	
		messengerIcon.click();
	}
	
	public void friend() throws InterruptedException {
		selectFriend.click();
		Thread.sleep(5000);
	}
	
	public void sendingText() throws InterruptedException
	{
		sendingText.click();
		Thread.sleep(3000);
		sendingText.sendKeys("Hai"+Keys.ENTER);
	}

	public void sendingLikeSymbol() {
		sendingLike.click();
	}
	
	public void sendingGIF() throws InterruptedException {
		clickingGIFIcon.click();
		Thread.sleep(5000);
		searchGIF.sendKeys("Thank");
		Thread.sleep(3000);
		sendingGIF.click();
		
	}

	public void closingTab() {
		cancelButton.click();
	}
}
