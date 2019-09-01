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

if (BIvarKewarganegaraan == 'WNI') {
    Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-WNI'), 0)
} else {
    Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-WNA'), 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-NegaraAsal'), BIvarNegaraAsal, 0)

    Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : BIvarNegaraAsal]), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpNoKTP'), BIvarNoKTP, 0)

if (BIvarVerifikasi == 'Ya') {
    Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_BtnVerifikasiKTP'), 0)

    CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)
} else {
    if (BIvarMasaBerlaku == 'seumurhidup') {
        Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-SeumurHidup'), 0)

        if (BIvarKewarganegaraan == 'WNA') {
            Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-NomorPassport'), BIvarNomorPassport, 
                0)

            Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-TanggalBerakhirPassport'), 0)
        }
    } else {
        Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-TidakSeumurHidup'), 0)

        Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-TanggalBerakhirIdentitas'), 0)
    }
    
    Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpNamaSesuaiIdentitas'), BIvarNamaSesuaiIdentitas, 
        0)

    if (BIvarJenisKelamin == 'perempuan') {
        Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-perempuan'), 0)
    } else {
        Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower-Identitas-lakilaki'), 0)
    }
    
    CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.2, 1000)

    Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpTempatLahir'), BIvarTempatLahir, 0)

    Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_InpTempatLahir'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : BIvarTempatLahir]), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_TxtTanggalLahir'), 0)

    WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : BIvarTahun], FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : BIvarTahun], FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpAlamatLengkap'), BIvarAlamatLengkap, 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpRT'), BIvarRT, 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpRW'), BIvarRW, 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpKodePos'), BIvarKodePos, 0)

    Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_InpKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_Identitas_LOVKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_TxtStatusPerkawinan'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BIvarStatusPerkawinan]), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_TxtAgama'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BIvarAgama]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_TxtStatusPerkawinan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BIvarStatusPerkawinan]), 0, FailureHandling.STOP_ON_FAILURE)

