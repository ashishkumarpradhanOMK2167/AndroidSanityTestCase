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

Mobile.startExistingApplication("com.mobikwik_new")

CustomKeywords.'test.ReSetUpApp.goToHome'()

Mobile.delay(1)
Mobile.tap(findTestObject('MainPage/Main Page - See all services'), 0)


Mobile.scrollToText("Credit Card Zone")
Mobile.tap(findTestObject('Object Repository/MutualFunds/Direct Mutual Funds 2'), 0)

Mobile.delay(6)

//boolean checkPage = Mobile.verifyElementText(findTestObject('Object Repository/MutualFunds/Mutual Funds Portfolio'), "Mutual Funds Portfolio", FailureHandling.STOP_ON_FAILURE)
//if(checkPage){
//    date = ""
//	PortfolioValue = "0"
//	TotalInvested = "0"
//	
//	boolean verifyHoldings = false;
//	verifyHoldings = Mobile.checkElement(findTestObject('Object Repository/MutualFunds/PortfolioValue - '), 0 , FailureHandling.CONTINUE_ON_FAILURE)
//	
//	if(verifyHoldings){
//		date = Mobile.getText(findTestObject('Object Repository/MutualFunds/Portfolio value as of 09 Nov 2022'), 0, FailureHandling.CONTINUE_ON_FAILURE)
//		PortfolioValue = Mobile.getText(findTestObject('Object Repository/MutualFunds/PortfolioValue - '), 0, FailureHandling.CONTINUE_ON_FAILURE)
//		Mobile.scrollToText("View Holdings" , FailureHandling.CONTINUE_ON_FAILURE)
//		TotalInvested = Mobile.getText(findTestObject('Object Repository/MutualFunds/Total Invested - 1600'), 0, FailureHandling.CONTINUE_ON_FAILURE)
//		println(date)
//		println("PortfolioValue = " + PortfolioValue)
//		println("Total Invested = " + TotalInvested)
//	}
//	else {
//		println("Invest in Mutual Funds")
//	}
//}

boolean checkPage = Mobile.verifyElementText(findTestObject('Object Repository/MutualFunds/Mutual Fund Dashboard'), "Mutual Fund Dashboard", FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MutualFunds/ProfileImage'), 0)

Name = Mobile.getText(findTestObject('Object Repository/MutualFunds/Name - Ashish Kumar Pradhan'), 0)
println(Name)

Mobile.verifyElementText(findTestObject('Object Repository/MutualFunds/Name - Ashish Kumar Pradhan'), "Ashish Kumar Pradhan", FailureHandling.STOP_ON_FAILURE)

PanNumber = Mobile.getText(findTestObject('Object Repository/MutualFunds/Pan - FMSPP7878E'), 0)
println(PanNumber)

Mobile.verifyElementText(findTestObject('Object Repository/MutualFunds/Pan - FMSPP7878E'), "FMSPP7878E", FailureHandling.STOP_ON_FAILURE)

Email = Mobile.getText(findTestObject('Object Repository/MutualFunds/Email - akp750750gmail.com'), 0)
println(Email)

Mobile.verifyElementText(findTestObject('Object Repository/MutualFunds/Email - akp750750gmail.com'),"akp750750@gmail.com", FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'test.ReSetUpApp.back'(3)

Mobile.closeApplication()