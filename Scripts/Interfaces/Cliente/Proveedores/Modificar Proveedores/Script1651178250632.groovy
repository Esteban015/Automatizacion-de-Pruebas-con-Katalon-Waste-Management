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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://wm-front.vercel.app/auth/login?returnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_email_form-control (1)'), GlobalVariable.userCliente)

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_lock_outline_form-control (1)'), GlobalVariable.passCliente)

WebUI.sendKeys(findTestObject('Object Repository/Page_Proveedores/input_lock_outline_form-control (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Proveedores/p_Gestin (1)'))

WebUI.delay(2)

WebUI.navigateToUrl('https://wm-front.vercel.app/manage/provider')

WebUI.click(findTestObject('Object Repository/Page_Proveedores/td_Example Name'))

WebUI.click(findTestObject('Object Repository/Page_Proveedores/i_edit'))

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_Datos del Proveedor_provider_name'), 'Example Name 2')

WebUI.click(findTestObject('Object Repository/Page_Proveedores/div_Usuario_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Proveedores/span_Hudson LLC'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Proveedores/i_check (1)'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Proveedores/i_check (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Proveedores/i_check (1)'))

WebUI.delay(2)

WebUI.closeBrowser()

