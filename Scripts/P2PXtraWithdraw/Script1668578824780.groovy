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
CustomKeywords.'test.ReSetUpApp.goToHome'()

Mobile.tap(findTestObject('MainPage/Main Page - See all services'), 0)

Mobile.scrollToText("Credit Card Zone")

Mobile.tap(findTestObject('Object Repository/MainPage/Xtra Earn 12 p.a.'), 0)

yourInvestment = Mobile.getText(findTestObject('P2PXtraWithdraw/YourInvestment - 101'),0)
println(yourInvestment)
int value = yourInvestment.toInteger()
println(value)

yourEarnings = Mobile.getText(findTestObject('P2PXtraWithdraw/YourEarnings'),0)
println(yourEarnings)

if(value > 0){
	Mobile.tap(findTestObject('P2PXtraWithdraw/Withdraw'), 0)
	Mobile.setText(findTestObject('P2PXtraWithdraw/WithdrawalAmount'), "1", 0)
	Mobile.tap(findTestObject('P2PXtraWithdraw/WithdrawSecond'), 0)
	
	Mobile.tap(findTestObject('P2PXtraWithdraw/INDIAN OVERSEAS BANK'), 0)
	
	
	Mobile.tap( findTestObject('P2PXtraWithdraw/Withdraw On Bottom Sheet'), 0)
	
}

AmountWithdraw = Mobile.getText(findTestObject('P2PXtraWithdraw/SuccessPage-Amount'), 0)
AmountWithdraw = AmountWithdraw.substring(1)
int AmountWithdrawValue = AmountWithdraw.toInteger()


value = value - AmountWithdrawValue;
println(value)
yourInvestmentAfterWithdraw = value.toString()

Mobile.delay(3)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('P2PXtraWithdraw/YourInvestment - 101'), yourInvestmentAfterWithdraw, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'test.ReSetUpApp.back'(2)

Mobile.closeApplication()


