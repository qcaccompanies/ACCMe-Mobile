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

Mobile.tap(findTestObject('Bank Account/TAB/BankAccount_TabBankHistory'), 0)

Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_InpNamaBank'), varNamaBank, 
    0)

Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : varNamaBank]), 0)

Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_InpNomorRekening'), varNomorRekening, 
    0)

Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_InpNamaPemegangRekening'), 
    varNamaPemegangRekening, 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

if (varTambahBankHistory == 'Y') {
    Mobile.tap(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_BtnTambahBankHistory'), 
        0)

    Mobile.tap(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_TxtBulan'), 
        0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varBulan]), 0)

    Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_InpFrekuensiDebit'), 
        varFrekuensiDebit, 0)

    Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_InpFrekuensiKredit'), 
        varFrekuensiKredit, 0)

    Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_InpMutasiDebit'), 
        varMutasiDebit, 0)

    Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_InpMutasiKredit'), 
        varMutasiKredit, 0)

    Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_InpSaldoTertinggi'), 
        varSaldoTertinggi, 0)

    Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_InpSaldoRataRata'), 
        varSaldoRataRata, 0)

    Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_InpSaldoTerrendah'), 
        varSaldoTerrendah, 0)

    Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_InpFrekuensiTolakanLuar'), 
        varFrekuensiTolakanLuar, 0)

    Mobile.setText(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_InpFrekuensiTolakanDalam'), 
        varFrekuensiTolakanDalam, 0)

    Mobile.tap(findTestObject('Bank Account/Bank Account - Bank History/BankAccount_BankHistory_TambahBankHistory_BtnConfirm'), 
        0)
}

