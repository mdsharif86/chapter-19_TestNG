package testByTestNG;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCraigListAccountingAndFinanceLink extends Base {
	@Test //Annotation
	public void testCLAccountngAndFinance() throws InterruptedException {
		
		site.findElement(By.xpath("//span[text()='accounting+finance']")).click();
		String result= site.findElement(By.linkText("accounting/finance")).getText();
		
		Assert.assertEquals(result, "accounting/finance");
	}
}