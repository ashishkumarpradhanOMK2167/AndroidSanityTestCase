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

Mobile.scrollToText("Financial Services")
Mobile.tap(findTestObject('Object Repository/PayRent/RechargeAndPayBill - 17'), 0)

Mobile.scrollToText("Pay Rent")
Mobile.tap(findTestObject('Object Repository/PayRent/RechargeAndPayBills - PayRent'), 0)

Mobile.tap(findTestObject('Object Repository/PayRent/PayRent - Use UPI'), 0)

Mobile.setText(findTestObject('Object Repository/PayRent/PayRent - Enter Name Number UPI ID or Scan QR'), "8882305453paytm", 0)
Mobile.tap(findTestObject('Object Repository/PayRent/PayRentSelect - 8882305453paytm'), 0)

Mobile.tap(findTestObject('Object Repository/PayRent/PayRentUpiAmmount - 1'), 0)
// Mobile.tap(findTestObject('Object Repository/PayRent/Upi - Continue'), 0)
Mobile.closeApplication()