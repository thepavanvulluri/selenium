package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePageLawn;
import pom_scripts.LoginLawn;

public class TestScript_LN8 extends Base_Test {
	
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
		
		
		l2.laptop();
		System.out.println("clicked on usb");
		l2.close();
		l2.addToCart();
		System.out.println("added to cart");
		//driver.findElement(By.xpath("//a[@class=\"navbar_cartIcon__Lqbph active\"]/../..//a[@href=\"/cart\"]")).click();
		
		
	}
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException{
		Object [][]testdata=ReadExcel.getMultipleData("Signin");
		return testdata;
		
	}
	
	
}
