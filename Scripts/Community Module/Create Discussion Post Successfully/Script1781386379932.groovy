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

WebUI.navigateToUrl('https://utm-go.vercel.app/home')

WebUI.setText(findTestObject('Community Module/Page_UTMGo/input_yougraduate.utm.my'), 'habibullah@graduate.utm.my')

WebUI.setEncryptedText(findTestObject('Community Module/Page_UTMGo/input_Enter your password'), 'f7IgQFd4qQo=')

WebUI.sendKeys(findTestObject('Community Module/Page_UTMGo/input_Enter your password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Community Module/Page_UTMGo/button_Sign In'))

WebUI.click(findTestObject('Community Module/Page_UTMGo/button_Community'))

WebUI.click(findTestObject('Community Module/Page_UTMGo/button_DiscussionJoin community conversations'))

WebUI.click(findTestObject('Community Module/Page_UTMGo/svg_lucide lucide-plus w-5 h-5'))

WebUI.setText(findTestObject('Community Module/Page_UTMGo/input_What would you like to discuss'), 'Test')

WebUI.setText(findTestObject('Community Module/Page_UTMGo/textarea_Share your thoughts with the community'), 'Test 123')

WebUI.click(findTestObject('Community Module/Page_UTMGo/button_Post'))

WebUI.click(findTestObject('Community Module/Page_UTMGo/div_mmuhammad habibullah6_13_2026, 9_37_58 PMTes'))

