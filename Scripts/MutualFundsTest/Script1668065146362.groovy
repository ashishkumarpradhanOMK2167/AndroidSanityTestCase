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
Mobile.tap(findTestObject('Object Repository/MainPage/Investments  Insurance'), 0)
Mobile.tap(findTestObject('Object Repository/MainPage/DirectMutualFunds'), 0)

boolean checkPage = Mobile.verifyElementText(findTestObject('Object Repository/MutualFunds/Mutual Funds Portfolio'), "Mutual Funds Portfolio", FailureHandling.STOP_ON_FAILURE)
if(checkPage){

	date = Mobile.getText(findTestObject('Object Repository/MutualFunds/Portfolio value as of 09 Nov 2022'), 0)
	PortfolioValue = Mobile.getText(findTestObject('Object Repository/MutualFunds/PortfolioValue - '), 0)
	Mobile.scrollToText("View Holdings")
	TotalInvested = Mobile.getText(findTestObject('Object Repository/MutualFunds/Total Invested - 1600'), 0)
	println(date)
	println("PortfolioValue = " + PortfolioValue)
	println("Total Invested = " + TotalInvested)
	
}

Mobile.closeApplication()