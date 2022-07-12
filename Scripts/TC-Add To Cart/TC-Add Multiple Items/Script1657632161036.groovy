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

'Back to the main page\r\n'
Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Recent/imageView_Mini Digital Speaker TD-V26'), 0)

Mobile.tap(findTestObject('Recent/Items/btn_ADD TO CART'), 0)

Mobile.setText(findTestObject('Recent/Items/TextField_Number of Order'), '2', 0)

Mobile.tap(findTestObject('Recent/Items/btn_ADD'), 0)

'Back to the main page\r\n'
Mobile.pressBack()

Mobile.tap(findTestObject('Recent/imageView_U17 USB Portable M3 Humidifier Air Purifier'), 0)

Mobile.tap(findTestObject('Recent/Items/btn_ADD TO CART'), 0)

Mobile.setText(findTestObject('Recent/Items/TextField_Number of Order'), '2', 0)

Mobile.tap(findTestObject('Recent/Items/btn_ADD'), 0)

'back to the main page'
Mobile.pressBack()

