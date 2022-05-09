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

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_email_form-control (1)'), GlobalVariable.userAdmin)

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_lock_outline_form-control (1)'), GlobalVariable.passAdmin)

WebUI.sendKeys(findTestObject('Object Repository/Page_Administrador_Cliente/input_lock_outline_form-control (1)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/p_Administracin (1)'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/span_Clientes (1)'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/td_Ejemplo'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/i_edit'))

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Datos del Cliente_client_name'), 'Ejemplo 2')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Nombre del Cliente_street (1)'), 'Dorrego 2')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Calle del Cliente_street_number (1)'), 
    '1292')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Altura de Calle_city (1)'), 'Oran2')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente/input_Ciudad del Cliente_state (1)'), 'Salta2')

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente/i_check (1)'))

WebUI.delay(2)

WebUI.closeBrowser()

