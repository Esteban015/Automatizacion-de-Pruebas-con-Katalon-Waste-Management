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

WebUI.navigateToUrl('https://wm-front.vercel.app/auth/login?returnUrl=%2F')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Login/input_email_form-control'), GlobalVariable.userCliente)

WebUI.setText(findTestObject('Page_Login/input_lock_outline_form-control'), GlobalVariable.passCliente)

WebUI.sendKeys(findTestObject('Page_Login/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Residuo/p_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Residuo/span_Tipo de Residuo'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Residuo/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Residuo/input_Crear Tipo de Residuo_name'), 'Carton')

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Residuo/input_Nombre_pickup_warning_threshold'), '50')

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Residuo/input_Umbral de Precaucin_pickup_alert_threshold'), 
    '80')

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Residuo/span_Categora de Alerta'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Residuo/span_Mximo'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Residuo/span_Unidad de Conversin'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Residuo/span_M3'))

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Residuo/input_Unidad de Conversin_conversion_per_m3'), '1.00')

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Residuo/input_Conversin a M3_max_days_between_pickup'), '5')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Tipo_de_Residuo/i_check'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Tipo_de_Residuo/i_check'), 0)

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Residuo/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

