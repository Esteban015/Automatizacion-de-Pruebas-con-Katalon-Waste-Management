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

WebUI.setText(findTestObject('Object Repository/Page_Usuarios_Proveedor/input_email_form-control (1)'), 'cborer@example.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Usuarios_Proveedor/input_lock_outline_form-control (1)'), 
    'qeJ0sjJnwEs=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Usuarios_Proveedor/input_lock_outline_form-control (1)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Usuarios_Proveedor/p_Administracin (1)'))

WebUI.click(findTestObject('Object Repository/Page_Usuarios_Proveedor/span_Usuarios (1)'))

WebUI.click(findTestObject('Object Repository/Page_Usuarios_Proveedor/td_ejemplo'))

WebUI.click(findTestObject('Object Repository/Page_Usuarios_Proveedor/td_Municipio de South Sheaton'))

WebUI.click(findTestObject('Object Repository/Page_Usuarios_Proveedor/i_edit'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Usuarios_Proveedor/input_correo_mat-input-2 (1)'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Usuarios_Proveedor/i_check (1)'))

WebUI.delay(2)

WebUI.closeBrowser()

