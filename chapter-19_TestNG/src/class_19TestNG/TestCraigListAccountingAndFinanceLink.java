package class_19TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import testByTestNG.Base;

public class TestCraigListAccountingAndFinanceLink extends Base {
	@Test  //here test is called annotation
	public void testAccount_Finance() {
		
		site.findElement(By.xpath("//span[text()='accounting+finance']")).click();
		String result= site.findElement(By.linkText("accounting/finance")).getText();
		
		Assert.assertEquals(result, "accounting/finance");
		
		
	}
}
