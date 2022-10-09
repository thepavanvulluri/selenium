package test_Scripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePageLawn;
import pom_scripts.LoginLawn;

public class TestScript_LN10 extends Base_Test {
	@Test(dataProvider = "testData")
	
	public void login(String email,String pwd) throws InterruptedException {
		LoginLawn l1=new LoginLawn(driver);
		l1.clickOnSignIn();
		l1.enterValueInEmailLawn(email);
		l1.enterValueInPwd(pwd);
		l1.clickOnSubmit();
		System.out.println("success login");
		HomePageLawn l2=new HomePageLawn(driver);
		l2.electronics(driver);
		
		
		l2.usb_();
		System.out.println("clicked on headphones");
		l2.close();
		l2.addToCart();
		System.out.println("added to cart");
		//driver.findElement(By.xpath("//a[@class=\"navbar_cartIcon__Lqbph active\"]/../..//a[@href=\"/cart\"]")).click();
		l2.cartB();
		System.out.println("Success");
		l2.buynow();
		System.out.println("clicked buy now");
		l2.address();
		System.out.println("added address");
		l2.proceedButton();
		System.out.println("clicked on proced ");
		Reporter.log("added address");
		l2.cod();
		System.out.println("selected cod");
		l2.proceedtobuy();
		System.out.println("clicked on proced ");
		
	}
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException{
		Object [][]testdata=ReadExcel.getMultipleData("Signin");
		return testdata;
		
	}
	
}