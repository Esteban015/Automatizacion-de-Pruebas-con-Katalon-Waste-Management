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

WebUI.setText(findTestObject('Object Repository/Page_Sitios/input_email_form-control (1)'), 'pkertzmann@example.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sitios/input_lock_outline_form-control (1)'), '373N5QL8KVQ=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sitios/input_lock_outline_form-control (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Sitios/b_build_caret'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_Sitios (1)'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/td_Sitio N3559'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/i_edit'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/input_Datos del Sitio_name'))

WebUI.setText(findTestObject('Object Repository/Page_Sitios/input_Nombre_description'), 'Media cuadra 2')

WebUI.setText(findTestObject('Object Repository/Page_Sitios/input_Descripcin_address'), 'CUBA 4338 2')

WebUI.click(findTestObject('Object Repository/Page_Sitios/div_Depsito_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_Recoleccin (1)'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/div_Bilateral_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_Frontal (1)'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/div_Papel_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_Electronico'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/div_Tan_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Sitios/span_LightYellow'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Sitios/i_check (1)'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Sitios/i_check (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Sitios/i_check (1)'))

WebUI.delay(2)

WebUI.closeBrowser()

