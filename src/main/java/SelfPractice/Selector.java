package SelfPractice;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class Selector {

	public static void main(String[] args) throws Throwable {
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriver wd = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
		wd.get("https://selectorshub.com/xpath-practice-page/");
		// wd.quit();
		WebElement elen = wd.findElement(By.xpath("//*[@id=\"cars\"]"));
		List<WebElement> l1 = wd.findElements(By.xpath("//*[@id=\"cars\"]/option"));
		Iterator<WebElement> i1 = l1.iterator();

		while (i1.hasNext()) {
			System.out.println(i1.next().getText());
		}
		/*
		 * Select s = new Select(wd.findElement(By.xpath("//*[@id=\\\"cars\\\"]")));
		 * List<WebElement> carList=s.getOptions(); Iterator i2=carList.iterator();
		 * while(i2.hasNext()) { System.out.println(i1.next().getText()); } //not getting getText method
		 * //wd.close();
		 */
	}

}
