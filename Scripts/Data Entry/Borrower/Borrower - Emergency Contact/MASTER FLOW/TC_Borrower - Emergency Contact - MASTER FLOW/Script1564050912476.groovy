import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpNamaLengkap'), BEvarNamaLengkap, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_TxtHubungan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BEvarHubungan]), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpAlamat'), BEvarAlamat, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpRT'), BEvarRT, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpRW'), BEvarRW, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpKodePos'), BEvarKodePos, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_LOVKodePos'), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpKodeArea'), BEvarKodeArea, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpNoTelponKantor'), BEvarNoTelponKantor, 
    0)

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpExt'), BEvarEXT, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpTeleponSelular'), BEvarTeleponSelular, 
    0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.5, 1000)

Mobile.setText(findTestObject('Borrower/Borrower - Emergency/Borrower_Emergency_InpEmail'), BEvarEmail, 0)

