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

Mobile.tap(findTestObject('Navigation-Bar/btn_Category'), 0)

Mobile.tap(findTestObject('Category/Options/btn_Electronics - Gadgets'), 0)

Mobile.tap(findTestObject('Recent/imageView_Samsung Galaxy S10 - Black'), 0)

Mobile.tap(findTestObject('Recent/Items/btn_ADD TO CART'), 0)

Mobile.setText(findTestObject('Recent/Items/TextField_Number of Order'), '2', 0)

Mobile.tap(findTestObject('Recent/Items/btn_ADD'), 0)

Mobile.tap(findTestObject('Cart/btn_Cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Shopping-Cart/layout_FirstItem'), 0)

Mobile.verifyElementText(findTestObject('Cart/Shopping-Cart/txtView_Total'), 'Total : 1.978 USD', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Cart/Shopping-Cart/btn_CHECKOUT'), 0)

Mobile.verifyElementText(findTestObject('Checkout/txtEdited_Name'), name, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Checkout/txtEdited_Email'), email, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Checkout/txtEdited_PhoneNumber'), phonenumber, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Checkout/txtEdited_Address'), address, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Checkout/dropdown_Shipping'), 0)

Mobile.tap(findTestObject('Checkout/dropdown_Shipping'), 0)

Mobile.tap(findTestObject('Checkout/txtView_FedEx'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Checkout/txt_OrderDetail'), 'resource-id', 'com.solodroid.solomerce:id/edt_order_list', 
    0)

Mobile.tap(findTestObject('Checkout/btn_PROCESS CHECKOUT'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/txtView_Are you sure want to checkout'), 0)

Mobile.tap(findTestObject('Checkout/btn_YES(Process Checkout)'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/txtView_Congratulation(Order Success)'), 40, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Checkout/btn_OK(Order Success)'), 0, FailureHandling.OPTIONAL)

