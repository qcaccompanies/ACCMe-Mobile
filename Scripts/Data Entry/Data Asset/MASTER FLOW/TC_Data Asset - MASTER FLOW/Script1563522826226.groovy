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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.tap(findTestObject('Data Asset/DataAsset_TxtWarna'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varWarna]), 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorRangka'), varNomorRangka, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorMesin'), varNomorMesin, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNamaBPKB'), varNamaBPKB, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorBPKB'), varNomorBPKB, 0)

if (varBPKBBedaNama == 'Y') {
    Mobile.tap(findTestObject('Data Asset/DataAsset_CheckBPKBBedaNama'), 0)
}

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorPolisiDepan'), varNomorPolisiDepan, 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.3, 1000)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorPolisiTengah'), varNomorPolisiTengah, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorPolisiBelakang'), varNomorPolisiBelakang, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorFaktur'), varNomorFaktur, 0)

Mobile.tap(findTestObject('Data Asset/DataAsset_TxtTanggalBerakhirSTNK'), 0)

WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : '2025'], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpAlamat'), varAlamat, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpRT'), varRT, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpRW'), varRW, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpKodePos'), varKodePos, 0)

Mobile.tap(findTestObject('Data Asset/DataAsset_InpKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Data Asset/DataAsset_LOVKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

