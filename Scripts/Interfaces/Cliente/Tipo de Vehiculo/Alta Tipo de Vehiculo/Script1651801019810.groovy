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

WebUI.setText(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_email_form-control'), GlobalVariable.userCliente)

WebUI.setText(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_lock_outline_form-control'), GlobalVariable.passCliente)

WebUI.sendKeys(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/p_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/span_Tipo de Vehculo'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_Crear Tipo de Vehculo_name'), 'Un Nombre')

WebUI.setText(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_Nombre_brand'), 'Una Marca')

WebUI.setText(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_Marca_vmodel'), 'Un Modelo')

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/div_Categoria_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/span_Camioneta'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/div_Unidad de Capacidad_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/div_L  Kg  M3'))

WebUI.setText(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_Unidad de Capacidad_capacity'), '10')

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/div_Lado de Carga_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/span_Bilateral'))

WebUI.setText(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_Lado de Carga_oil_capacity'), '20')

WebUI.setText(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_L_liter_km'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Tipo_Vehiculo/input_LKm_co_km'), '2')

WebUI.scrollToPosition(0, 200)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Tipo_Vehiculo/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

