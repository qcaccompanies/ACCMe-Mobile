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

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Btn Simulasi Kredit'), 0)

if (varPembiayaan == 'NewCar') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_new car'), 0)
} else {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_used car'), 0)

    if (varUsedCar == 'Regular') {
        Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Regular'), 0)
    } else if (varUsedCar == 'Transaksi2Pihak') {
        Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_transaksi 2 pihak'), 
            0)

        if (varTopup == 'ya') {
            Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_topup ya'), 0)

            Mobile.setText(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Nomor Kontrak Exsisting'), 
                varNoKontrakExisting, 0)
        } else {
            Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_topup tidak'), 0)
        }
    } else if (varUsedCar == 'InventoryFinancing') {
        Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_inventory financing'), 
            0)
    }
}

if (varTipePembiayaan == 'syariah') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Syariah'), 0)
} else {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Konvensional'), 0)
}

if (varPaket == 'ya') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_kode paket'), 0)

    Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : varKodePaket]), 0)
}

Mobile.setText(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Brand'), varBrand, 0)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Brand'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/Simulasi Kredit-LOVBrand'), 0)

Mobile.setText(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Type'), varType, 0)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Type'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Type LOV'), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.3, 1000)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Model'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varModel]), 0)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Tahun'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varTahun]), 0)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Tenor'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varTenor]), 0)

Mobile.setText(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp OTR'), varOTR, 0)

if (varADDMdanADDB == 'ADDM') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Btn ADDM'), 0)
} else {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Btn ADDB'), 0)
}

Mobile.setText(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp RP'), varRP, 0)

if (varACP == 'credit') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp ACP Credit'), 0)
} else if (varACP == 'Cash') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp ACP Cash'), 0)
} else if (varACP == 'None') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp ACP None'), 0)
}

Mobile.setText(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Dealer'), varDealer, 
    0)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Dealer'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_LOV Dealer'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Sales Dealer'), varSales, 
    0)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Inp Sales Dealer'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_LOV Sales Dealer'), 0)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Btn Hitung'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Btn Berikutnya'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

