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

WebUI.setText(findTestObject('Object Repository/Page_Empleados/input_email_form-control'), GlobalVariable.userProveedor)

WebUI.setText(findTestObject('Object Repository/Page_Empleados/input_lock_outline_form-control'), GlobalVariable.passProveedor)

WebUI.sendKeys(findTestObject('Object Repository/Page_Empleados/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Empleados/p_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_Empleados/span_Empleados'))

WebUI.click(findTestObject('Object Repository/Page_Empleados/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Empleados/input_Crear Empleado_employee_name'), 'Un Empleado')

WebUI.setText(findTestObject('Object Repository/Page_Empleados/input_Nombre del Empleado_address'), 'Una Direccion')

WebUI.setText(findTestObject('Object Repository/Page_Empleados/input_Direccin del Empleado_phone'), '123123123')

WebUI.setText(findTestObject('Object Repository/Page_Empleados/input_Telfono del Empleado_name'), 'ejemplo')

WebUI.click(findTestObject('Object Repository/Page_Empleados/div_Lenguaje_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Empleados/span_Es'))

WebUI.setText(findTestObject('Object Repository/Page_Empleados/input_Lenguaje_email'), 'ejemplo@ejemplo.com')

WebUI.setText(findTestObject('Object Repository/Page_Empleados/input_E-mail_password'), '123456')

WebUI.click(findTestObject('Object Repository/Page_Empleados/div_Rol de Usuario_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Empleados/span_Rol Empleado'))

WebUI.click(findTestObject('Object Repository/Page_Empleados/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

