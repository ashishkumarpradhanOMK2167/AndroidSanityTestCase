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

Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/PayRent/Main Page - See all services'), 0)


Mobile.scrollToText("Credit Card Zone")
Mobile.tap(findTestObject('Object Repository/MutualFunds/Direct Mutual Funds 2'), 0)

Mobile.delay(5)

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
if(checkPage){
	
}


Mobile.closeApplication()