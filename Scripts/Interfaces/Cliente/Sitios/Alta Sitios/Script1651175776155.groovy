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

WebUI.setText(findTestObject('Object Repository/Page_Sitios/input_email_form-control'), GlobalVariable.userCliente)

WebUI.setText(findTestObject('Object Repository/Page_Sitios/input_lock_outline_form-control'), GlobalVariable.passCliente)

WebUI.sendKeys(findTestObject('Object Repository/Page_Sitios/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Sitios/p_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_Sitios'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Sitios/input_Crear Sitio_mat-input-0'), 'Sitio')

WebUI.setText(findTestObject('Object Repository/Page_Sitios/input_Nombre_mat-input-1'), 'Una Descripcion')

WebUI.setText(findTestObject('Object Repository/Page_Sitios/input_Descripcin_mat-input-2'), 'Una Direccion')

WebUI.click(findTestObject('Object Repository/Page_Sitios/div_Categora_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_Recoleccin'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/div_Lado de Carga_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_Bilateral'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/div_Tipo de Contenido_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_Metal'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/div_Zona_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_Villa Amaya'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/div'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/i_check'))

WebUI.closeBrowser()

