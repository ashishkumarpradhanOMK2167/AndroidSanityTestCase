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

Mobile.startExistingApplication('com.mobikwik_new')
CustomKeywords.'test.ReSetUpApp.goToHome'()

Mobile.tap(findTestObject('Object Repository/MobileRechargeCrossSell/Recharge  Pay Bills'), 0)

Mobile.tap(findTestObject('Object Repository/MobileRechargeCrossSell/Mobile'), 0)

Mobile.tap(findTestObject('Object Repository/MobileRechargeCrossSell/My Number'), 0)

Mobile.tap(findTestObject('Object Repository/MobileRechargeCrossSell/Popular'), 0)

RechargeAmount1 = Mobile.getText(findTestObject('Object Repository/MobileRechargeCrossSell/RechargeAmount'), 0)
println(RechargeAmount1)

Mobile.tap(findTestObject('Object Repository/MobileRechargeCrossSell/RechargeAmount'),0)

Mobile.tap(findTestObject('Object Repository/MobileRechargeCrossSell/CheckBox'), 0)

RechargeAmount2 = Mobile.getText(findTestObject('Object Repository/MobileRechargeCrossSell/RechargeAmount (1)'), 0)
RechargeAmount2 = RechargeAmount2.substring(1)
int RechargeAmountInt = RechargeAmount2.toInteger();
println(RechargeAmount2)

InsuranceAmount = Mobile.getText(findTestObject('Object Repository/MobileRechargeCrossSell/InsuranceAmount'), 0)
InsuranceAmount = InsuranceAmount.substring(1)
InsuranceAmountInt = InsuranceAmount.toInteger();
println(InsuranceAmount)

SumAmountInt = InsuranceAmountInt + RechargeAmountInt;
SumAmount = SumAmountInt.toString();
println(SumAmount)

SumAmount = "₹" + SumAmount;
println(SumAmount)

Mobile.verifyElementText(findTestObject('Object Repository/MobileRechargeCrossSell/TotalAmount'), SumAmount, FailureHandling.STOP_ON_FAILURE)

TotalAmount = Mobile.getText(findTestObject('Object Repository/MobileRechargeCrossSell/TotalAmount'), 0)
TotalAmount = TotalAmount.substring(1)
println(TotalAmount)

SumAmount = "Pay " + SumAmount;
println(SumAmount)

Mobile.verifyElementText(findTestObject('Object Repository/MobileRechargeCrossSell/PayAmount'), SumAmount, FailureHandling.STOP_ON_FAILURE)

PayAmount = Mobile.getText(findTestObject('Object Repository/MobileRechargeCrossSell/PayAmount'), 0)
PayAmount = PayAmount.substring(5)
println(PayAmount)

Mobile.tap(findTestObject('Object Repository/MobileRechargeCrossSell/PayAmount'), 0)

Mobile.closeApplication()


