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
Mobile.tap(findTestObject('Object Repository/PayRent/Main Page - See all services'), 0)

Mobile.scrollToText("Credit Card Zone")

Mobile.tap(findTestObject('Object Repository/Insurance/Insurance'), 0)

boolean LossJob = Mobile.verifyElementText(findTestObject('Object Repository/Insurance/Loss of Job'), "Loss of Job", FailureHandling.STOP_ON_FAILURE)
boolean PersonalAccident = Mobile.verifyElementText(findTestObject('Object Repository/Insurance/Personal Accident Insurance'),"Personal Accident Insurance", FailureHandling.STOP_ON_FAILURE)
boolean walletProtect = Mobile.verifyElementText(findTestObject('Object Repository/Insurance/Wallet Protect'),"Wallet Protect", FailureHandling.STOP_ON_FAILURE)
boolean HealthInsurance = Mobile.verifyElementText(findTestObject('Object Repository/Insurance/Health Insurance'), "Health Insurance", FailureHandling.STOP_ON_FAILURE)
boolean DocAssure = Mobile.verifyElementText(findTestObject('Object Repository/Insurance/DocAssure'),"DocAssure", FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Insurance/Pay your existing insurance Premium'), 0)
