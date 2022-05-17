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

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/input_email_form-control'), GlobalVariable.userCliente)

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/input_lock_outline_form-control'), GlobalVariable.passCliente)

WebUI.sendKeys(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/input_lock_outline_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/b_build_caret'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/span_Tipo de Vehculo'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/td_Vehiculo N0001'))

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/i_edit'))

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/input_rv_hookup_name'), 'Vehiculo Nº 001')

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/input_Nombre_brand'), 'Iveco 2')

WebUI.setText(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/input_Marca_vmodel'), 'Eurocargo 2022')

WebUI.click(findTestObject('Object Repository/Page_Tipo_de_Vehiculo2/i_check'))

WebUI.delay(2)

WebUI.closeBrowser()

