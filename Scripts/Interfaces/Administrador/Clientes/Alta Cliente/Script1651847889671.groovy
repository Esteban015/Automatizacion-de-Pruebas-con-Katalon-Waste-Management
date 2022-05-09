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

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_email_form-control'), GlobalVariable.userAdmin)

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_lock_outline_form-control'), GlobalVariable.passAdmin)

WebUI.sendKeys(findTestObject('Object Repository/Page_Administrador_Cliente/input_lock_outline_form-control'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/p_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/span_Clientes'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Crear Cliente_client_name'), 'Nombre de Cliente')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Nombre del Cliente_street'), 'Calle')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Calle del Cliente_street_number'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Altura de Calle_city'), 'Ciudad')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Ciudad del Cliente_state'), 'Provincia')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Provincia del Cliente_country'), 'Pais')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Pas del Cliente_phone'), '123123123')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Longitud_name'), 'User123')

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/div_Lenguaje_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/span_Es'))

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Lenguaje_email'), 'ejemplo@ejemplo7.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Administrador_Cliente/input_E-mail_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/div_Rol de Usuario_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/span_Rol Cliente'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/div'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

