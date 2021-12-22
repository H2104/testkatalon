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

WebUI.navigateToUrl('https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal')

WebUI.click(findTestObject('Object Repository/Page_Wikipdia, lencyclopdie libre/span_Crer un compte'))

WebUI.click(findTestObject('Object Repository/Page_Crer un compte  Wikipdia/div_Nom dutilisateur(conseils)Le nom dutili_aa0323'))

WebUI.setText(findTestObject('Object Repository/Page_Crer un compte  Wikipdia/input_conseils_wpName'), 'testh')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Crer un compte  Wikipdia/input_Mot de passe_wpPassword'), 
    'PJ9tLLUy27I=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Crer un compte  Wikipdia/input_Confirmez le mot de passe_retype'), 
    'PJ9tLLUy27I=')

WebUI.setText(findTestObject('Object Repository/Page_Crer un compte  Wikipdia/input_Actualiser_captchaWord'), 'jiveboom')

WebUI.click(findTestObject('Object Repository/Page_Crer un compte  Wikipdia/span_Accueil'))

WebUI.click(findTestObject('Object Repository/Page_Crer un compte  Wikipdia/span_Accueil'))

