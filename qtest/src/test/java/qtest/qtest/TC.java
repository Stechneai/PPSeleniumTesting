package qtest.qtest;

import org.testng.annotations.Test;

public class TC extends BaseClass {

	@Test
	public void tc1() throws InterruptedException {
		TCPage tp = new TCPage();
		Thread.sleep(3000);
		tp.setUsername().sendKeys("SayaliV");
		Thread.sleep(3000);
		tp.setPassword().sendKeys("abcd123");
		Thread.sleep(3000);
		tp.btnSign().click();
	}
}
