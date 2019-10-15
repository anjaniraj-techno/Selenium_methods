package com.mind;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.thoughtworks.selenium.webdriven.commands.Submit;


public class Naukri_Registration {
	
	static String URL="https://www.naukri.com/";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver dr=new FirefoxDriver();
dr.manage().window().maximize() ;
dr.navigate().to(URL);
dr.findElement(By.xpath(".//*[@id='login_Layer']")).click();
dr.findElement(By.xpath(".//*[@id='lgnFrm']/div[9]/a")).click();
dr.findElement(By.xpath("html/body/div[1]/form/div[2]/div/button")).click();
dr.findElement(By.xpath(".//*[@id='fname']")).sendKeys("Ronit Roy");
dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("rronit899@gmail.com");
//dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("asd36aassddf@gmail.com");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/div[3]/div[1]/div/input")).sendKeys("Test@123");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/div[4]/div[1]/div/input[2]")).sendKeys("9955665588");
//dr.findElement(By.xpath(".//*[@id='basicDetailForm']/div[4]/div[1]/div/input[2]")).sendKeys("9952556568");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input")).sendKeys("5");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys("3");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);

dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-uploader/div/div[1]/span[1]/input")).click();
Runtime.getRuntime().exec("C:\\Users\\Rahul\\Desktop\\Test_Autoitcode.exe");
/*Robot cc =new Robot();
cc.keyPress(KeyEvent.VK_D);
cc.keyRelease(KeyEvent.VK_D);
cc.keyPress(KeyEvent.VK_SHIFT);
cc.keyPress(KeyEvent.VK_SEMICOLON);
cc.keyRelease(KeyEvent.VK_SEMICOLON);
cc.keyRelease(KeyEvent.VK_SHIFT);
cc.keyPress(KeyEvent.VK_BACK_SLASH);
cc.keyRelease(KeyEvent.VK_BACK_SLASH);
cc.keyPress(KeyEvent.VK_R);
cc.keyRelease(KeyEvent.VK_R);
cc.keyPress(KeyEvent.VK_E);
cc.keyRelease(KeyEvent.VK_E);
cc.keyPress(KeyEvent.VK_S);
cc.keyRelease(KeyEvent.VK_S);
cc.keyPress(KeyEvent.VK_U);
cc.keyRelease(KeyEvent.VK_U);
cc.keyPress(KeyEvent.VK_M);
cc.keyRelease(KeyEvent.VK_M);
cc.keyPress(KeyEvent.VK_E);
cc.keyRelease(KeyEvent.VK_E);
cc.keyPress(KeyEvent.VK_DECIMAL);
cc.keyRelease(KeyEvent.VK_DECIMAL);
cc.keyPress(KeyEvent.VK_D);
cc.keyRelease(KeyEvent.VK_D);
cc.keyPress(KeyEvent.VK_O);
cc.keyRelease(KeyEvent.VK_O);
cc.keyPress(KeyEvent.VK_C);
cc.keyRelease(KeyEvent.VK_C);
cc.keyPress(KeyEvent.VK_X);
cc.keyRelease(KeyEvent.VK_X);
cc.keyPress(KeyEvent.VK_ENTER);
cc.keyRelease(KeyEvent.VK_ENTER);*/
Thread.sleep(10000);
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/div[5]/div/div/div[2]/button")).click();
Thread.sleep(18000);
dr.findElement(By.xpath(".//*[@id='designation_0']")).sendKeys("Senior Software Engineer");
dr.findElement(By.xpath(".//*[@id='designation_0']")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='designation_0']")).sendKeys(Keys.ENTER);
Thread.sleep(8000);
dr.findElement(By.xpath(".//*[@id='company_0']")).sendKeys("Infosys");
dr.findElement(By.xpath(".//*[@id='company_0']")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='company_0']")).sendKeys(Keys.ENTER);
Thread.sleep(8000);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-salary/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys("3");
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-salary/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-salary/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-salary/div/div[1]/div/div[3]/div[1]/ul/li/div/label/input")).sendKeys("80");
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-salary/div/div[1]/div/div[3]/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-salary/div/div[1]/div/div[3]/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[1]/div[1]/ul/li/div/label/input")).sendKeys("2016");
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[1]/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[1]/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[2]/div[1]/ul/li/div/label/input")).sendKeys("Mar");
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[2]/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[2]/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[2]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input")).sendKeys("Pune");
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[2]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[2]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
//dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li/div/label/input")).sendKeys("2 months");
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='selSkillCont']/div/ul/li/suggestor/div/div/input")).sendKeys("QA");
dr.findElement(By.xpath(".//*[@id='selSkillCont']/div/ul/li/suggestor/div/div/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='selSkillCont']/div/ul/li/suggestor/div/div/input")).sendKeys(Keys.ENTER);
Thread.sleep(8000);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[1]/resman-salary/div/div[1]/div/div[1]/label[1]")).click();
//dr.findElement(By.xpath(".//*[@id='selSkillCont']/div/ul/li/suggestor/div/div/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[2]/resman-keyskill/div[1]/div[2]")).click();
dr.findElement(By.xpath(".//*[@id='employmentDetailForm']/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li/div/label/input/following::button[1]")).click();
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/edu-qualification/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys("Masters");
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/edu-qualification/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/edu-qualification/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/edu-course/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys("CS");
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/edu-course/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/edu-course/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/edu-spec/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys("CS");
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/edu-spec/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/edu-spec/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='institute_0']")).sendKeys("Bharathiar University, Coimbatore");
dr.findElement(By.xpath(".//*[@id='institute_0']")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='institute_0']")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/div/div/div/div/label[1]")).click();
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/edu-passing/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys("2016");
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/edu-passing/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/edu-section/section/div/edu-passing/div/div[1]/div/div/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='educationDetailForm']/div/div/div/button")).click();

	}

}
