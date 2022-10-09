package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.UtilityMethods;

public class HomePageLawn extends BasePage {

	public HomePageLawn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//a[text()='Electronic']")
	WebElement electonicsBtn;
	
	public void electronics(WebDriver driver) {
	actions_classObject(driver).moveToElement(electonicsBtn).perform();
		
	}
	@FindBy(xpath = "//a[text()='Cameras & Accessories']")
	WebElement camera_acc;
	
	public void camera_Acc() {
		clickAction(camera_acc);
	}
	@FindBy(xpath = "//a[text()='USB Cables & Drive']")
	WebElement usb;
	
	public void usb_() {
		clickAction(usb);
	}
	
	@FindBy(xpath = "//a[text()='Watch']")
	WebElement watch;
	public void watchC(){
		clickAction(watch);
	
	}
	@FindBy(xpath = "//a[text()='Computer Peripherals']")
	WebElement computers;
	
	public void computerP() {
		clickAction(computers);
	}
	
	@FindBy(xpath = "//a[text()='Headphones']")
	WebElement headPhones;
	
	public void headphone() {
		clickAction(headPhones);
	}
	
	@FindBy(xpath = "//a[text()='Laptops ']")
	WebElement laptops;
	
	public void laptop() {
		clickAction(laptops);
	}
	@FindBy(xpath = "//a[text()='Mobiles']")
	WebElement mobiles;
	
	public void mobiles() {
		clickAction(mobiles);
	}
	
	@FindBy(linkText = "Power bank")
	WebElement powerbank;
	 
	public void powerbnk() {
		clickAction(powerbank);
	}
	@FindBy(xpath = "//div[@class=\"navbar_searchBlock__vO2hm\"]/../../..//a[@href=\"/cart\"]")
	WebElement cartbutton;
	
	public void cartB() {
	clickAction(cartbutton);
	}
	@FindBy(xpath = "//button[text()='add to cart']")
	WebElement addToCart;
	
	public void addToCart() {
	clickAction(addToCart);
	}
	
	@FindBy(xpath =  "//span[text()='Buy Now']")
	WebElement buynow;
	
	public void buynow() {
		clickAction(buynow);
	}
	
	@FindBy(xpath ="//input[@type=\"radio\"]")
	WebElement radio;
	
	public void address() {
	clickAction(radio);
	}
	
	@FindBy(className = "selectaddress_proceed__kDiuv")
	WebElement proceed;
	
	public void proceedButton() {
		clickAction(proceed);
	}
	@FindBy(xpath = "//input[@value=\"COD\"]")
	WebElement cod;
	
	public void cod() {
		clickAction(cod);
	}
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement proceedtobuy;
	
	public void proceedtobuy() {
		clickAction(proceedtobuy);
	}
	@FindBy(xpath = "//button[@class=\"Toastify__close-button Toastify__close-button--light\"]")
	WebElement close;
	
	public void close() {
		clickAction(close);
	}
	
}
