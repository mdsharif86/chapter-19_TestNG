package testByTestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCraigListAptAndHousingLink extends Base {

	@Test
	public void aptOrHousingLinkActivated() {
		site.findElement(By.xpath("//span[text()='apts / housing']")).click();
		String result = site.findElement(By.linkText("apartments / housing for rent")).getText();
		
		Assert.assertEquals(result, "apartments / housing for rent");
	}
}
