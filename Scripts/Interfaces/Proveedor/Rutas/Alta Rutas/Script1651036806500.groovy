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

WebUI.setText(findTestObject('Object Repository/Page_Rutas/input_email_form-control'), GlobalVariable.userProveedor)

WebUI.setText(findTestObject('Object Repository/Page_Rutas/input_lock_outline_form-control'), GlobalVariable.passProveedor)

WebUI.sendKeys(findTestObject('Object Repository/Page_Rutas/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Rutas/p_Planificacin'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/span_Rutas'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Rutas/input_Crear Ruta_name'), 'Ruta Oeste')

WebUI.click(findTestObject('Object Repository/Page_Rutas/div_Nombre_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/span_Ejemplo16'))

WebUI.click(findTestObject('Page_Rutas/input_Fecha_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/span_Esteban Ariel Amaya'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/div_Empleado_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/span_78AB (20)'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/span_Optimizar'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/i_check'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/mat-icon_check'))

WebUI.click(findTestObject('Object Repository/Page_Rutas/button_OK'))

WebUI.delay(2)

WebUI.closeBrowser()

