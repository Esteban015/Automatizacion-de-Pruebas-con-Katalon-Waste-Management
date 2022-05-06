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

WebUI.setText(findTestObject('Object Repository/Page_Zonas/input_email_form-control'), 'cborer@example.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Zonas/input_lock_outline_form-control'), '373N5QL8KVQ=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Zonas/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Zonas/p_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/span_Zonas'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/td_Villa Alem'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/i_edit'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Zonas/input_Datos de la Zona_mat-input-3'))

WebUI.setText(findTestObject('Object Repository/Page_Zonas/input_Datos de la Zona_mat-input-3'), 'Villa Esteban')

WebUI.click(findTestObject('Object Repository/Page_Zonas/div_Hudson LLC_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/span_Hudson LLC'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active_1'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active_1'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active_1'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active_1'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active_1'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active_1'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active_1'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active_1'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/div'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/button_X_gm-control-active'))

WebUI.click(findTestObject('Object Repository/Page_Zonas/i_check'))

WebUI.closeBrowser()

