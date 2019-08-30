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

Mobile.tap(findTestObject('Penghasilan/Penghasilan_BtnPenghasilanSatu'), 0)

if (varSumberPenghasilanSatu == 'Usaha') {
    Mobile.tap(findTestObject('Penghasilan/Penghasilan_PenghasilanSatu_BtnSumberPenghasilan - Usaha'), 0)
}

switch (varPemilikPenghasilanSatu.toString()) {
    case 'Borrower':
        Mobile.tap(findTestObject('Penghasilan/Penghasilan_PenghasilanSatu_BtnPemilikPenghasilan - Borrower'), 0)

        break
    case 'Coborrower':
        Mobile.tap(findTestObject('Penghasilan/Penghasilan_PenghasilanSatu_BtnPemillikPenghasilan - Coborrower'), 0)

        break
    case 'Guarantor':
        Mobile.tap(findTestObject('Penghasilan/Penghasilan_PenghasilanSatu_BtnPemilikPenghasilan - Guarantor'), 0)

        break
}

Mobile.tap(findTestObject('Penghasilan/Penghasilan_PenghasilanSatu_TxtJenisPekerjaanAtauUsaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varJenisPekerjaanAtauUsahaSatu]), 0)

Mobile.setText(findTestObject('Penghasilan/Penghasilan_PenghasilanSatu_InpPenghasilanKotor'), varPenghasilanKotorSatu, 0)

if (varPenghasilanDua == 'Y') {
    Mobile.tap(findTestObject('Penghasilan/Penghasilan_BtnPenghasilanDua'), 0)

    Mobile.tap(findTestObject('Penghasilan/Penghasilan_PenghasilanDua_TxtJenisPekerjaanAtauUsaha'), 0)

    Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varJenisPekerjaanAtauUsahaDua]), 
        0)

    Mobile.setText(findTestObject('Penghasilan/Penghasilan_PenghasilanDua_InpPenghasilanKotor'), varPenghasilanKotorDua, 
        0)
}

if (varPenghasilanTiga == 'Y') {
    Mobile.tap(findTestObject('Penghasilan/Penghasilan_BtnPenghasilanTiga'), 0)

    Mobile.tap(findTestObject('Penghasilan/Penghasilan_PenghasilanTiga_TxtJenisPekerjaanAtauUsaha'), 0)

    Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varJenisPekerjaanAtauUsahaTiga]), 
        0)

    Mobile.setText(findTestObject('Penghasilan/Penghasilan_PenghasilanTiga_InpPenghasilanKotor'), varPenghasilanKotorTiga, 
        0)
}

Mobile.tap(findTestObject('Penghasilan/Penghasilan_BtnBerikutnya'), 0)

