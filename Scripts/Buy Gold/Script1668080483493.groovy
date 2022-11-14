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
Mobile.tap(findTestObject('Object Repository/BuyGold/Buy 99.5 pure gold'), 0)

GoldBalance = Mobile.getText(findTestObject('Object Repository/BuyGold/Gold Balance -   0.4213 gram(s)'), 0)
NetLoss = Mobile.getText(findTestObject('Object Repository/BuyGold/Net Loss  7.19'), 0)
TotalPurchased = Mobile.getText(findTestObject('Object Repository/BuyGold/Total Purchased  2167'), 0)
TotalSold = Mobile.getText(findTestObject('Object Repository/BuyGold/Total Sold  10'), 0)

println(GoldBalance)
println(NetLoss)
println(TotalPurchased)
println(TotalSold)

Mobile.tap(findTestObject('Object Repository/BuyGold/Sell Gold'),0)
Mobile.setText(findTestObject('Object Repository/BuyGold/SellGoldinRs'), "1", 0)
Mobile.tap(findTestObject('Object Repository/BuyGold/Sell - Continue'),0)
// Mobile.tap(findTestObject(findTestObject('Object Repository/BuyGold/Sell Gold Final'),0)

