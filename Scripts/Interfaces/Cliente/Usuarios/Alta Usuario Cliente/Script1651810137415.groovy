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

WebUI.setText(findTestObject('Object Repository/Page_Usuario_Clientes/input_email_form-control'), 'cborer@example.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Usuario_Clientes/input_lock_outline_form-control'), 'qeJ0sjJnwEs=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Usuario_Clientes/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Usuario_Clientes/p_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Usuario_Clientes/span_Usuarios'))

WebUI.click(findTestObject('Object Repository/Page_Usuario_Clientes/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Usuario_Clientes/input_person_mat-input-0'), 'unusuario')

WebUI.click(findTestObject('Object Repository/Page_Usuario_Clientes/div_role_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Usuario_Clientes/span_Rol Cliente'))

WebUI.setText(findTestObject('Object Repository/Page_Usuario_Clientes/input_usuario_mat-input-1'), 'ejemplo4@ejemplo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Usuario_Clientes/input_correo_mat-input-2'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Usuario_Clientes/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

