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

WebUI.setText(findTestObject('Object Repository/Page_Contenedor/input_email_form-control'), GlobalVariable.userCliente)

WebUI.setText(findTestObject('Object Repository/Page_Contenedor/input_lock_outline_form-control'), GlobalVariable.passCliente)

WebUI.sendKeys(findTestObject('Object Repository/Page_Contenedor/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Contenedor/p_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_Contenedor/span_Contenedores'))

WebUI.click(findTestObject('Object Repository/Page_Contenedor/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Contenedor/input_Crear Contenedor_serie_id'), '234234235')

WebUI.setText(findTestObject('Object Repository/Page_Contenedor/input_Nmero de Serie_description'), 'Una Descripcion')

WebUI.setText(findTestObject('Object Repository/Page_Contenedor/input_Descripcin_address'), 'Una Direccion')

WebUI.setText(findTestObject('Object Repository/Page_Contenedor/input_Direccin_current_level'), '60')

WebUI.click(findTestObject('Object Repository/Page_Contenedor/div_Tipo de Contenedor_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Contenedor/span_prueba'))

WebUI.click(findTestObject('Object Repository/Page_Contenedor/div_Sitio_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Contenedor/span_Sitio N4721'))

WebUI.click(findTestObject('Object Repository/Page_Contenedor/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

