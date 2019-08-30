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

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpPekerjaan'), BPvarPekerjaan, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpPekerjaan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : BPvarPekerjaan]), 0)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_TxtJabatan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BPvarJabatan]), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpDepartemen'), BPvarDepartemen, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_TxtStatusKaryawan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BPvarStatusKaryawan]), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpNoIndukKaryawan'), BPvarNoIndukKaryawan, 
    0)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_TxtBergabungSejak'), 0)

WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : '2010'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_TxtBadanUsaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BPvarBadanUsaha]), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.3, 1000)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpNamaPerusahaan'), BPvarNamaPerusahaan, 
    0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpBidangUsaha'), BPvarBidangUsaha, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpBidangUsaha'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_LOVBidangUsaha'), 0)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_TxtSubBidangUsaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BPvarSubBidangUsaha]), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpNationalityPerusahaan'), BPvarNationalityPerusahaan, 
    0)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpNationalityPerusahaan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : BPvarNationalityPerusahaan]), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpWebsite'), BPvarWebsite, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_TxtJenisAkunSosialMedia'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BPvarJenisAkunSosialMedia]), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpAkunSosialMedia'), BPvarAkunSosialMedia, 
    0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.3, 1000)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_BtnAlamatKantor'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpAlamatKantor'), BPvarAlamatKantor, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpRT'), BPvarRT, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpRW'), BPvarRW, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpKodePos'), BPvarKodePos, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_LOVKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpPetunjukAlamat'), BPvarPetunjukAlamat, 
    0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpKodeArea'), BPvarKodeArea, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpNoTeleponKantor'), BPvarNoTeleponKantor, 
    0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpExt'), BPvarEXT, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_InpTeleponSeluler'), BPvarTeleponSeluler, 
    0)

