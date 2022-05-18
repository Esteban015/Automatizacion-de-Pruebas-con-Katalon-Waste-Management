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

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_email_form-control'), GlobalVariable.userCliente)

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_lock_outline_form-control'), GlobalVariable.passCliente)

WebUI.sendKeys(findTestObject('Object Repository/Page_Proveedores/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.navigateToUrl('https://wm-front.vercel.app/manage/provider')

WebUI.click(findTestObject('Object Repository/Page_Proveedores/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_Crear Proveedor_mat-input-0'), 'Un Nombre')

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_Nombre_mat-input-1'), 'Una Direccion')

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_Direccin_mat-input-2'), '12831238')

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_Telfono_mat-input-3'), 'Ejemplo')

WebUI.click(findTestObject('Object Repository/Page_Proveedores/div_Lenguaje_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Proveedores/span_Es'))

WebUI.setText(findTestObject('Object Repository/Page_Proveedores/input_Lenguaje_mat-input-4'), 'ejemplo@ejemplo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Proveedores/input_E-mail_mat-input-5'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Proveedores/div_Rol de Usuario_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Proveedores/span_Rol Proveedor'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Proveedores/i_check'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Proveedores/i_check'), 0)

WebUI.click(findTestObject('Object Repository/Page_Proveedores/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

