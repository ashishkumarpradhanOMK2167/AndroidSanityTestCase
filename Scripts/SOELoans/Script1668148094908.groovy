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
Mobile.tap(findTestObject('MainPage/Main Page - See all services'), 0)

Mobile.scrollToText("Credit Card Zone")
Mobile.tap(findTestObject('Object Repository/SOE/Loans'),0)

Boolean check = Mobile.verifyElementText(findTestObject('Object Repository/SOE/Get offer upto 200000 and pay in easy EMIs'),"Get offer upto ₹2,00,000 and pay in easy EMIs" , FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/SOE/CheckBox'),0)
Mobile.tap(findTestObject('Object Repository/SOE/Get started'),0)

Mobile.closeApplication()