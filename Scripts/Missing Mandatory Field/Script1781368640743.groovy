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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://utm-go.vercel.app/')

WebUI.setText(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/input_yougraduate.utm.my'), 'fakhrul-04@graduate.utm.my')

WebUI.setEncryptedText(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/input_Enter your password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/button_Sign In'))

WebUI.click(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/button_Record'))

WebUI.setText(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/input_Enter activity name'), 'futsal matches')

WebUI.selectOptionByValue(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/select_Select activity typeBadmintonFutsalVolley'), 
    'Futsal', false)

WebUI.setText(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/input_w-full h-12 px-4 border rounded-lg transiti'), '13-06-2026')

WebUI.click(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/input_e.g., 1.5'))

WebUI.click(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/button_Submit Activity'))

WebUI.click(findTestObject('Record Module/Page_UTMGo/Page_UTMGo/p_Please complete all required fields'))

