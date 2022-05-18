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

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/input_email_form-control'), GlobalVariable.userAdmin)

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/input_lock_outline_form-control'), 
    GlobalVariable.passAdmin)

WebUI.sendKeys(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/input_lock_outline_form-control'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/p_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/span_Clientes'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/div_infoLista de Clientesaddedit'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/td_Municipio de East Ludieside'))

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/i_edit'))

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/input_Datos del Cliente_client_name'), 
    'Municipio de East Ludieside 2')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/input_Nombre del Cliente_street'), 
    'Crystal Pine 2')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/input_Calle del Cliente_street_number'), 
    '2037')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/input_Altura de Calle_city'), 'New Jalynton 2')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/input_Ciudad del Cliente_state'), 
    'Michigan 2')

WebUI.setText(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/input_Provincia del Cliente_country'), 
    'Mozambique 2')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/i_check'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/i_check'), 0)

WebUI.click(findTestObject('Object Repository/Page_Administrador_Cliente_Modificacion/i_check'))

WebUI.closeBrowser()

