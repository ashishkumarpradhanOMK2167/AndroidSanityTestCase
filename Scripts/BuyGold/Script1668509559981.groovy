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

Mobile.tap(findTestObject('MainPage/Main Page - See all services'), 0)

Mobile.scrollToText("Credit Card Zone")

Mobile.tap(findTestObject('Object Repository/BuyGold/Buy 99.5 pure gold 2'), 0)

// Buying Gold
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/BuyGold/Buy Gold'),0)
Mobile.setText(findTestObject('Object Repository/BuyGold/BuyGoldinRupees - '), "1", 0)
Mobile.tap(findTestObject('Object Repository/BuyGold/Pay'), 0)
Mobile.delay(3)

boolean checkPaymentSuccesPage = Mobile.verifyElementText(findTestObject('Object Repository/BuyGold/PaymentSuccessful-Payment Successful'), "Payment Successful", FailureHandling.CONTINUE_ON_FAILURE)
if(checkPaymentSuccesPage){
	
	OrderID = Mobile.getText(findTestObject('Object Repository/BuyGold/PaymentSuccessful-Order Id'), 0, FailureHandling.STOP_ON_FAILURE)
	Quantity = Mobile.getText(findTestObject('Object Repository/BuyGold/PaymentSuccessful-Quantity'), 0, FailureHandling.STOP_ON_FAILURE)
	DateOfBuy = Mobile.getText(findTestObject('Object Repository/BuyGold/PaymentSuccessful- Date'), 0, FailureHandling.STOP_ON_FAILURE)
	Amount = Mobile.getText(findTestObject('Object Repository/BuyGold/PaymentSuccessful-Amount'), 0, FailureHandling.STOP_ON_FAILURE)
	
	println("Order ID " + OrderID)
	println("Quantity in grams " + Quantity)
	println("Date " + DateOfBuy)
	println("Total Amount Paid " + Amount)
}


Mobile.pressBack()


GoldBalance = Mobile.getText(findTestObject('Object Repository/BuyGold/Gold Balance -   0.4213 gram(s)'), 0)
NetLoss = Mobile.getText(findTestObject('Object Repository/BuyGold/Net Loss  7.19'), 0)
TotalPurchased = Mobile.getText(findTestObject('Object Repository/BuyGold/Total Purchased  2167'), 0)
TotalSold = Mobile.getText(findTestObject('Object Repository/BuyGold/Total Sold  10'), 0)

println(GoldBalance)
println(NetLoss)
println(TotalPurchased)
println(TotalSold)


CustomKeywords.'test.ReSetUpApp.back'(2)


Mobile.closeApplication()

