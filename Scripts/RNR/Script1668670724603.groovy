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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication("com.mobikwik_new")

CustomKeywords.'test.ReSetUpApp.goToHome'()

Mobile.tap(findTestObject('Object Repository/RNR/RNR'), 0)

boolean checkSTW1 = Mobile.verifyElementText(findTestObject('Object Repository/RNR/Spin the wheel'),"Spin the wheel",FailureHandling.CONTINUE_ON_FAILURE)
if(checkSTW1){
	CustomKeywords.'function.SpinTheWheel.spin'()
	Mobile.tap(findTestObject('Object Repository/RNR/Cross'), 0)
}


Mobile.scrollToText("Spin Now")

Mobile.tap(findTestObject('Object Repository/RNR/Spin Now'), 0)

boolean checkSTW2 = Mobile.verifyElementText(findTestObject('Object Repository/RNR/Spin the wheel'),"Spin the wheel",FailureHandling.CONTINUE_ON_FAILURE)
if(checkSTW2){
	CustomKeywords.'function.SpinTheWheel.spin'()
}

Mobile.tap(findTestObject('Object Repository/RNR/Cross'),0)

Mobile.tap(findTestObject('Object Repository/RNR/Your Rewards'),0)

Mobile.delay(5)

Mobile.pressBack()
Mobile.pressBack()

Mobile.closeApplication()