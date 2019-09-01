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

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (varTipeAsuransi == 'int') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_Tipe Asuransi Int'), 0)
} else {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_Tipe Asuransi BC'), 0)
}

if (varPenggunaanUnit == 'pribadi') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_PenggunaanUnit Prbd'), 0)
} else {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_PenggunaanUnit Kmrsl'), 0)
}

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_Nama Asuransi'), 0)

Mobile.setText(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_Nama Asuransi'), varAsuransi, 0)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_LOV Nama Asuransi'), 0)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_KDWilayah'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varKodeWilayah]), 0)

if (varPembayaranAsuransi == 'AR') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_PmbyrnAsuransi AR'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_Pmbyrn Asuransi Cash2'), 0)
} else {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_PmbyrnAsuransi TLO'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_PmbyrnAsuransi Credit'), 0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_Hitung'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Asuransi/Asuransi_Berikutnya'), 0)

