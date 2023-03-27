package Test;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest_DataBase {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazondb", "root", "root");

		Statement stmt = con.createStatement();

		ResultSet result = stmt.executeQuery("select * from searchproduct");

		while (result.next()) {

			HashMap<Integer, String> basket = new HashMap<Integer, String>();
			basket.put(result.getInt("searchvalue"), result.getString("product_name"));
			System.out.println("basket size: " + result.findColumn("product_name"));

			for (Integer item : basket.keySet()) {
				String columnValue = basket.get(item);
				// Open the browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");

				// Locators
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(columnValue);
				driver.findElement(By.id("nav-search-submit-button")).click();

				List<WebElement> product_names = driver.findElements(By.xpath("//div[@class='a-section']//h2//span"));

				List<WebElement> product_price = driver.findElements(By.xpath(
						"//div[@data-component-type='s-search-result']//div[contains(@class,'price')]//span[@class='a-price-whole']"));

				List<WebElement> symbol = driver.findElements(By.xpath(
						"//div[@data-component-type='s-search-result']//div[contains(@class,'price')]//span[@class='a-price-symbol']"));

				// Print size
				System.out.println("All name size:" + product_names.size());
				System.out.println("All price size:" + product_price.size());
				System.out.println("All symbol size:" + symbol.size());

				for (int i = 0; i < product_names.size(); i++) {
					System.out.println("Product : " + product_names.get(i).getText());
					System.out.println("Price : " + symbol.get(i).getText() + " " + product_price.get(i).getText());
				}

				// Take screenshot
				TakesScreenshot tsObj = (TakesScreenshot) driver;
				File fileObj = tsObj.getScreenshotAs(OutputType.FILE);
				File screenshotObj = new File("image.png");
				System.out.println("Sreenshot taken : ");

				// close the driver
				FileUtils.copyFile(fileObj, screenshotObj);
				driver.close();
			}
		}
		con.close();
	}
}
