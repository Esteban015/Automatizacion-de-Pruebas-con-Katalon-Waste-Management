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

WebUI.setText(findTestObject('Object Repository/Page_Planes_de_Rutas/input_email_form-control'), GlobalVariable.userProveedor)

WebUI.setText(findTestObject('Object Repository/Page_Planes_de_Rutas/input_lock_outline_form-control'), GlobalVariable.passProveedor)

WebUI.sendKeys(findTestObject('Object Repository/Page_Planes_de_Rutas/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/p_Planificacin'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/span_Planes de Rutas'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Planes_de_Rutas/input_Crear Plan de Ruta_name'), 'Ejemplo18')

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/div_Nombre_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/span_LightPink'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/div_Zona_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/span_Bilateral'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/div_Lado de Carga_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/span_Papel'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/div_Tipo de Residuo_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/span_Sitio N2382'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/div_Sitio de Salida_mat-select-arrow'))

WebUI.click(findTestObject('Page_Planes_de_Rutas/span_Sitio N2382_2'))

WebUI.rightClick(findTestObject('Object Repository/Page_Planes_de_Rutas/img'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/span_Optimizar'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/mat-icon_check'))

WebUI.click(findTestObject('Page_Planes_de_Rutas/mat-icon_check2'))

WebUI.click(findTestObject('Object Repository/Page_Planes_de_Rutas/button_OK'))

WebUI.delay(2)

WebUI.closeBrowser()

