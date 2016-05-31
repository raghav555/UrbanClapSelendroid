import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Timer;
import java.util.TimerTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.client.SelendroidKeys;
import io.selendroid.common.SelendroidCapabilities;

public class uc_test {
	/**
	 * 
	 * @param args
	 * 
	 * @throws Exception
	 * 
	 */
	static int price = 0;
	static int response = 0;
	static int a=1;

	public static void main(String args[]) {
		int MINUTES = 10; // The delay in minutes
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() { // Function runs every MINUTES minutes.
				// Run the code you want here
				try {
					func();
					System.out.println(a);
					a++;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // If the function you wanted was static
			}
		}, 0, 1000 * 60 * MINUTES);
		// 1000 milliseconds in a second * 60 per minute * the MINUTES variable.

	}

	public static void func() throws Exception {

		SelendroidCapabilities capa = new SelendroidCapabilities("com.urbanclap.provider:3.0.3");

		 Thread.sleep(2000);

		WebDriver driver = new SelendroidDriver(capa);
		
		Thread.sleep(2000);

		WebElement element2 = driver.findElement(By.xpath("//AppCompatButton[@value='Login']"));

		element2.click();

		Thread.sleep(2000);

		WebElement element3 = driver.findElement(By.id("email"));

		element3.sendKeys("yoga@healersathome.com");

		WebElement element4 = driver.findElement(By.id("passWord"));

		element4.sendKeys("8613");

		new Actions(driver).sendKeys(SelendroidKeys.BACK).perform();

		Thread.sleep(2000);

		WebElement element5 = driver.findElement(By.xpath("//AppCompatButton[@value='Login']"));

		element5.click();

		while (true) {
			int price = 0;
			int response=0;

			// TODO Auto-generated method stub
			// Thread.sleep(2000);
			// app-id:com.urbanclap.provider:3.0.3

			Thread.sleep(10000);
			

			WebElement pages = driver.findElement(By.xpath("(//AppCompatTextView[@id='lead_type_help'])[1]"));
			TouchActions flick = new TouchActions(driver).flick(pages, 0, +500, 0);
			flick.perform();

			// Assert.assertEquals("true", inputField.getAttribute("enabled"));

			// inputField.sendKeys("Selendroid");

			// Assert.assertEquals("Selendroid", inputField.getText());

			// System.out.println(name);

			/*
			 * WebElement element6 = driver.findElement(By.xpath(
			 * "(//AppCompatTextView[@id='response'])[1]")); int
			 * a=Character.getNumericValue((element6.getText().charAt(0)));
			 * System.out.println(a); WebElement element7 =
			 * driver.findElement(By.xpath("//AppCompatTextView[@id='name']"));
			 * System.out.println(element7.getText()); WebElement element8 =
			 * driver.findElement(By.xpath(
			 * "(//RelativeLayout[@id='info_text'])[1]"));
			 * System.out.println(element8.getText());
			 */

			Thread.sleep(2000);
			WebElement element66 = driver.findElement(By.xpath("(//AppCompatTextView[@id='lead_type_help'])[1]"));
			System.out.println(element66.getText());

			WebElement element65 = driver.findElement(By.xpath("(//AppCompatTextView[@id='response'])[1]"));
			System.out.println(element65.getText());

			String s1;
			s1 = element65.getText().toString();
			String REGEX10 = "1";
			String REGEX11 = "2";
			String REGEX12 = "3";
			String REGEX13 = "4";
			String REGEX14 = "5";
			
			Pattern pattern;
			Matcher matcher;
			pattern = Pattern.compile(REGEX10, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(s1);
			if (matcher.lookingAt() == true) {
				response = 1;
			}
			pattern = Pattern.compile(REGEX11, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(s1);
			if (matcher.lookingAt() == true) {
				response = 2;
			}
			pattern = Pattern.compile(REGEX12, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(s1);
			if (matcher.lookingAt() == true) {
				response = 3;
			}
			pattern = Pattern.compile(REGEX13, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(s1);
			if (matcher.lookingAt() == true) {
				response = 4;
			}
			pattern = Pattern.compile(REGEX14, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(s1);
			if (matcher.lookingAt() == true) {
				response = 5;
			}
			System.out.println(response);
			if (response == 5) {
				break;
			} else {
				WebElement element6 = driver.findElement(By.xpath("(//AppCompatTextView[@id='name'])[1]"));
				element6.click();

				Thread.sleep(2000);
				
				WebElement element60 = driver.findElement(By.id("service_container"));
				List<WebElement> list = element60.findElements(By.tagName("AppCompatTextView"));
				String REGEX55="Number of days";
				pattern = Pattern.compile(REGEX55, Pattern.CASE_INSENSITIVE);
				
				int index=0;
				int a=0;
				int count1=0;
				outerloop:
				for (WebElement i : list) {
					System.out.println(i.getText());
					matcher = pattern.matcher(i.getText());
					if (matcher.lookingAt() == true)
					{
						index=a;
						break outerloop;
					}
					a++;
				}
				System.out.println(a);
				System.out.println(index);
				
				WebElement element61 = driver.findElement(By.id("service_container"));
				List<WebElement> list1 = element61.findElements(By.tagName("LinearLayout"));
				//System.out.println(list1.get(index+1).findElement(By.tagName("TextView")).getText());
				System.out.println(list1.size());
				int i;
				for(i=0;i<list1.size();i++)
				{
					System.out.println(list1.get(i).findElement(By.tagName("TextView")).getText());
				}
				/*
				for (WebElement i : list1) {
					System.out.println(i.getText());
				}
				*/
				String s;
				s = list1.get(index+1).findElement(By.tagName("TextView")).getText();
				
				// price=price+1;
				String REGEX1 = "Once";
				String REGEX2 = "Twice";
				String REGEX3 = "Thrice";
				String REGEX4 = "4";
				String REGEX5 = "5";
				String REGEX6 = "6";
				String REGEX7 = "7";
				String INPUT = s;
				System.out.println("No of visits per week:"+INPUT);
				// Pattern pattern;
				// Matcher matcher;
				pattern = Pattern.compile(REGEX1, Pattern.CASE_INSENSITIVE);
				matcher = pattern.matcher(INPUT);
				if (matcher.lookingAt() == true) {
					price = 3500;
				}
				pattern = Pattern.compile(REGEX2, Pattern.CASE_INSENSITIVE);
				matcher = pattern.matcher(INPUT);
				if (matcher.lookingAt() == true) {
					price = 4500;
				}
				pattern = Pattern.compile(REGEX3, Pattern.CASE_INSENSITIVE);
				matcher = pattern.matcher(INPUT);
				if (matcher.lookingAt() == true) {
					price = 5500;
				}
				pattern = Pattern.compile(REGEX4, Pattern.CASE_INSENSITIVE);
				matcher = pattern.matcher(INPUT);
				if (matcher.lookingAt() == true) {
					price = 6500;
				}
				pattern = Pattern.compile(REGEX5, Pattern.CASE_INSENSITIVE);
				matcher = pattern.matcher(INPUT);
				if (matcher.lookingAt() == true) {
					price = 7500;
				}
				pattern = Pattern.compile(REGEX6, Pattern.CASE_INSENSITIVE);
				matcher = pattern.matcher(INPUT);
				if (matcher.lookingAt() == true) {
					price = 8500;
				}
				pattern = Pattern.compile(REGEX7, Pattern.CASE_INSENSITIVE);
				matcher = pattern.matcher(INPUT);
				if (matcher.lookingAt() == true) {
					price = 9500;
				}
				
				//Thread.sleep(1000000);

				/*
				 * int i;
				 * 
				 * String[] words = s.split("\\s+"); for (i = 0; i <
				 * words.length; i++) { // You may want to check for a non-word
				 * character before blindly // performing a replacement // It
				 * may also be necessary to adjust the character class words[i]
				 * = words[i].replaceAll("[^\\w]", ""); }
				 * for(i=0;i<words.length;i++) { System.out.println(words[i]); }
				 * 
				 * int price = 0; if(words[0].compareTo("Once")==0) {
				 * price=3500; } if(words[0].compareTo("Twice")==0) {
				 * price=4500; } if(words[0].compareTo("Thrice")==0) {
				 * price=5500; } if(words[0].compareTo("4")==0) { price=6500; }
				 * if(words[0].compareTo("5")==0) { price=7500; }
				 * if(words[0].compareTo("6")==0) { price=8500; }
				 * if(words[0].compareTo("7")==0) { price=9500; }
				 * 
				 * 
				 */

				element60.click();

				Thread.sleep(2000);

				// WebElement element15 =
				// driver.findElement(By.xpath("(//LinearLayout)[1]"));
				// System.out.println(element15.getText());

				// WebElement element18 =
				// driver.findElement(By.xpath("(//AppCompatTextView[@id='top'])[1]"));
				// System.out.println(element18.getText());

				// WebElement element16 =
				// driver.findElement(By.xpath("//TextView[@value='4 or more
				// times a week']"));
				// System.out.println(element16.getText());

				// WebElement element17 =
				// driver.findElement(By.xpath("//TextView[@value='Thrice a
				// week']"));
				// element17.click();
				// element15.click();

				WebElement element8 = driver.findElement(By.xpath("//AppCompatButton[@id='respond']"));
				element8.click();

				Thread.sleep(2000);

				WebElement element9 = driver.findElement(By.xpath("//AppCompatEditText[@id='enter_amount']"));
				element9.sendKeys(Integer.toString(price));

				Thread.sleep(5000);
				//Thread.sleep(10000000);
				/*
				 * WebElement element11 =
				 * driver.findElement(By.id("buttonTest")); element11.click();
				 */
				// WebElement element12 = driver.findElement(By.id("name"));
				// element12.sendKeys("Eight");

				WebElement element12 = driver.findElement(By.xpath("//AppCompatEditText[@id='enter_detail']"));
				element12.sendKeys("We are a group of IITians & wellness professionals looking to serve you at home"
						+ "\n" + "About Instructor:" + "\n\n" + "Education: Bachelors/Masters in Yoga" + "\n"
						+ "Experience: 5+ years of Yoga teaching" + "\n\n" + "Mobile: 8882032030");

				// WebElement element11 =
				// driver.findElement(By.xpath("//AppCompatTextView[@id='name']"));
				// element11.sendKeys("Eight");

				Thread.sleep(2000);

									
				WebElement element10 = driver.findElement(By.xpath("//AppCompatButton[@id='submit']"));
				element10.click();

				Thread.sleep(6000);

				new Actions(driver).sendKeys(SelendroidKeys.BACK).perform();

				Thread.sleep(5000);

				new Actions(driver).sendKeys(SelendroidKeys.BACK).perform();

				Thread.sleep(5000);

				new Actions(driver).sendKeys(SelendroidKeys.BACK).perform();

				Thread.sleep(5000);

				new Actions(driver).sendKeys(SelendroidKeys.BACK).perform();

				Thread.sleep(5000);
				

				/*
				 * WebElement element7 = driver.findElement(By.xpath(
				 * "//AppCompatButton[@value='respond']")); element7.click();
				 */
				

				Thread.sleep(2000);
				

			}
			
		}
		driver.quit();
		return;
	}

}