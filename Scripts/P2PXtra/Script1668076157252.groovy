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

//Mobile.tap(findTestObject('Object Repository/MainPage/Investments  Insurance'), 0)
//Mobile.tap(findTestObject('Object Repository/MainPage/Xtra Earn 12 p.a.'), 0)
//
//boolean checkPage = Mobile.verifyElementText(findTestObject('Object Repository/P2PXtra/YourInvestment - 101'), "101", FailureHandling.STOP_ON_FAILURE)
//if(checkPage){
//	earnings = Mobile.getText(findTestObject('Object Repository/P2PXtra/YourEarnings'), 0)
//	println(earnings)
//	
//	Mobile.tap(findTestObject('Object Repository/P2PXtra/Withdraw'), 0)
//	Mobile.setText(findTestObject('Object Repository/P2PXtra/WithdrawalAmount'), "1", 0)
//	Mobile.tap(findTestObject('Object Repository/P2PXtra/WithdrawSecond'), 0)
//	Mobile.tap(findTestObject('Object Repository/P2PXtra/KOTAK MAHINDRA BANK LIMITED'), 0)
//	Mobile.scrollToText("Withdraw ₹1")
//	Mobile.tap( , 0)
//}
Mobile.tap(findTestObject('Object Repository/P2PXtra/WithdrawSecond'), 0)

Mobile.swipe(400, 600, 400, 400)

Mobile.closeApplication()


