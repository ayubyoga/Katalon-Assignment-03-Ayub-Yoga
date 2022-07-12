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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication(GlobalVariable.Apps, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Recent/imageView_Samsung Galaxy S10 - Black'), 0)

Mobile.tap(findTestObject('Recent/Items/btn_ADD TO CART'), 0)

Mobile.setText(findTestObject('Recent/Items/TextField_Number of Order'), '2', 0)

Mobile.tap(findTestObject('Recent/Items/btn_ADD'), 0)

Mobile.tap(findTestObject('Cart/btn_Cart'), 0)

Mobile.tap(findTestObject('Cart/Shopping-Cart/btn_CHECKOUT'), 0)

Mobile.tap(findTestObject('Checkout/txtEdited_Address'), 0)

Mobile.clearText(findTestObject('Checkout/txtEdited_Address'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Checkout/txtField_EmptyAddress'), "Kemayoran", 0)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Checkout/dropdown_Shipping'), 0)

Mobile.tap(findTestObject('Checkout/dropdown_Shipping'), 0)

Mobile.tap(findTestObject('Checkout/txtView_FedEx'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Checkout/txt_OrderDetail'), 'resource-id', 'com.solodroid.solomerce:id/edt_order_list', 
    0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Checkout/btn_PROCESS CHECKOUT'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/txtView_Are you sure want to checkout'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Checkout/btn_YES(Process Checkout)'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/txtView_Congratulation(Order Success)'), 40, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Checkout/btn_OK(Order Success)'), 0, FailureHandling.OPTIONAL)

