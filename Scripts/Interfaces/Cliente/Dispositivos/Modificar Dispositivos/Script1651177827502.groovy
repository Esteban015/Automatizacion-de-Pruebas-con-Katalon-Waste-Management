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

WebUI.setText(findTestObject('Object Repository/Page_Dispositivos/input_email_form-control'), 'cborer@example.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dispositivos/input_lock_outline_form-control'), '373N5QL8KVQ=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Dispositivos/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/p_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/span_Dispositivos'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/td_236213617236'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/i_edit'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/div_Registrado_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/span_Activo'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/div_Modelo_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/span_CT-0005'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Dispositivos/input_Nombre_serial_id'))

WebUI.setText(findTestObject('Object Repository/Page_Dispositivos/input_Nombre_serial_id'), '34523423234')

WebUI.doubleClick(findTestObject('Object Repository/Page_Dispositivos/input_Numero de Serie_imei'))

WebUI.setText(findTestObject('Object Repository/Page_Dispositivos/input_Numero de Serie_imei'), '1231423423423')

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

