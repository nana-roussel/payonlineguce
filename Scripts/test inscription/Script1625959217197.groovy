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

WebUI.navigateToUrl('https://testepayment.guichetunique.cm/PayOnlineGuce/')

WebUI.click(findTestObject('Object Repository/Page_Bienvenue sur PayOnlineGuce/img'))

WebUI.click(findTestObject('Object Repository/Page_page de connexion/a_Sinscrire'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/span_Chef de Secteur Douane_ui-icon ui-icon_8e4785'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/li_Manager'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input_Organisme_inscriptionFormj_idt39'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/div_Manager_ui-selectonemenu-trigger ui-sta_4c18e8'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/li_Donneur dordre'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/span_Chef de Secteur Douane_ui-icon ui-icon_8e4785'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/li_Agent de caisse'))

WebUI.setText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input__inscriptionFormlogintxt'), 
    'lolo')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input__inscriptionFormmptxt'), 
    '17d/rLaWffU=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input__inscriptionFormremptxt'), 
    'u0Z05ZuAXd0=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input__inscriptionFormmptxt'), 
    'rQ/5W/QE9QXqXj0Ia7KwKA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input__inscriptionFormremptxt'), 
    'rQ/5W/QE9QXqXj0Ia7KwKA==')

WebUI.setText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input_Nom_inscriptionFormj_idt87'), 
    'NANi')

WebUI.setText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input_Prnom_inscriptionFormj_idt91'), 
    'TCHANKO')

WebUI.setText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input_Adresse_inscriptionFormj_idt95'), 
    'bonapriiso')

WebUI.setText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input_Boite Postale_inscriptionFormj_idt99'), 
    '1749')

WebUI.setText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input_Ville_inscriptionFormj_idt103'), 
    'Douala')

WebUI.setText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input_Tlphone_inscriptionFormj_idt107'), 
    '679644704')

WebUI.setText(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/input_Mail_inscriptionFormj_idt111'), 
    'rousseltchanko@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/span_Envoyer'))

WebUI.click(findTestObject('Object Repository/Page_Plateforme de paiement en ligne GUCE/span_oui'))

WebUI.closeBrowser()

