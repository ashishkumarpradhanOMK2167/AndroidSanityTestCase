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

Mobile.tap(findTestObject('Object Repository/MainPage/Main Page - See all services'), 0)

Mobile.tap(findTestObject('Object Repository/P2M/Scan any QR (1)'), 0)

Mobile.tap(findTestObject('Object Repository/P2M/Enter Mobile Number or Merchant Code'), 0)
MerchantCode = "BLF001"
Mobile.setText(findTestObject('Object Repository/P2M/Mobile Number or Name or Code'),MerchantCode, 0)

Mobile.tap(findTestObject('Object Repository/P2M/Merchant-BLF001'), 0)

Mobile.setText(findTestObject('Object Repository/P2M/EnterAmount'), "1", 0)

MerchantName = Mobile.getText(findTestObject('Object Repository/P2M/MarchantName'), 0)
println(MerchantName)
println(MerchantCode)

TotalPayment = Mobile.getText(findTestObject('Object Repository/P2M/TotalPayment'), 0)
TotalPayment = "₹" + TotalPayment;
println(TotalPayment)

WalletBalance = Mobile.getText(findTestObject('Object Repository/P2M/Wallet Balance'), 0)
println(WalletBalance)



//Mobile.tap(findTestObject('Object Repository/P2M/Confirm Transfer'), 0)
//
//Mobile.verifyElementText(findTestObject('Object Repository/P2M/AmountPaid'), TotalPayment, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.verifyElementText(findTestObject('Object Repository/P2M/MarchantName - Paid'), MerchantName, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.verifyElementText(findTestObject('Object Repository/P2M/MarchantCode - Paid'), MerchantCode, FailureHandling.STOP_ON_FAILURE)


Mobile.closeApplication()




