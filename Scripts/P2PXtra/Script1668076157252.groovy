import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication('com.mobikwik_new')

Mobile.tap(findTestObject('Object Repository/PayRent/Main Page - See all services'), 0)

Mobile.scrollToText("Credit Card Zone")

Mobile.tap(findTestObject('Object Repository/MainPage/Xtra Earn 12 p.a.'), 0)

boolean checkPage = Mobile.verifyElementText(findTestObject('Object Repository/P2PXtra/YourInvestment - 101'), "997", FailureHandling.STOP_ON_FAILURE)
if(checkPage){
	// earnings = Mobile.getText(findTestObject('Object Repository/P2PXtra/YourEarnings'), 0)
	// println(earnings)
	
	Mobile.tap(findTestObject('Object Repository/P2PXtra/Withdraw'), 0)
	Mobile.setText(findTestObject('Object Repository/P2PXtra/WithdrawalAmount'), "1", 0)
	Mobile.tap(findTestObject('Object Repository/P2PXtra/WithdrawSecond'), 0)
	
	Mobile.tap(findTestObject('Object Repository/P2PXtra/INDIAN OVERSEAS BANK'), 0)
	
	
	Mobile.tap( findTestObject('Object Repository/P2PXtra/Withdraw On Bottom Sheet'), 0)
	
	
//	Mobile.delay(10)
//	device_Height = Mobile.getDeviceHeight()
//	 
//	 
//	 
//	'Get Width Height and Store in device_Width variable'
//	 
//	device_Width = Mobile.getDeviceWidth()
//	 
//	
//	println(device_Height);
//	println device_Width;
//	 
//	 
//	'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
//	 
//	int startX = device_Width / 2
//	 
//	 
//	 
//	'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
//	 
//	int endX = startX
//	 
//	 
//	 
//	'Storing the startY value'
//	 
//	int startY = device_Height * 0.40
//	 
//	 
//	 
//	'Storing the endY value'
//	 
//	int endY = device_Height * 0.70
//	 
//	 
//	 
//	'Swipe Vertical from top to bottom'
//	 
//	// Mobile.swipe(startX, endY, endX, startY)
//	 
//	 
//	 
//	'Swipe Vertical from bottom to top'
//	 
//	//Mobile.swipe(startX, startY, endX, endY)
	
	
}

Mobile.pressBack()
Mobile.pressBack()
Mobile.pressBack()
Mobile.pressBack()
Mobile.pressBack()

Mobile.closeApplication()


