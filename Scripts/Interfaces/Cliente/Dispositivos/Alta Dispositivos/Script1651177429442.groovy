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

WebUI.setText(findTestObject('Object Repository/Page_Dispositivos/input_email_form-control'), GlobalVariable.userCliente)

WebUI.setText(findTestObject('Object Repository/Page_Dispositivos/input_lock_outline_form-control'), GlobalVariable.passCliente)

WebUI.sendKeys(findTestObject('Object Repository/Page_Dispositivos/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/p_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/span_Dispositivos'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Dispositivos/i_add'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Dispositivos/i_add'), 0)

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Dispositivos/input_cell_wifi_name'), 'Un Nombre')

WebUI.setText(findTestObject('Object Repository/Page_Dispositivos/input_Nombre_serial_id'), '236213617236')

WebUI.setText(findTestObject('Object Repository/Page_Dispositivos/input_Numero de Serie_imei'), '3271382173728273')

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/div_GPS_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/span_Sensor de Basura'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/div_ALS N001-3314_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/span_ALS N001-1949'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/div_Contenedor_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/span_234234235'))

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/div_Registrado_mat-select-arrow'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Dispositivos/i_check'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Dispositivos/i_check'), 0)

WebUI.click(findTestObject('Object Repository/Page_Dispositivos/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

