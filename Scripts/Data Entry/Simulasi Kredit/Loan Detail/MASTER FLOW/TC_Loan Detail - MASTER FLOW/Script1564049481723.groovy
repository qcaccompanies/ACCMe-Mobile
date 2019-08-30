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

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Loan Detail/LoanDetail_SubsidiRate'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (varTipeAngsuran == 'regular') {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Loan Detail/LoanDetail_Regular'), 0)
} else {
    Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Loan Detail/LoanDetail_irregular'), 0)
}

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.4, 1000)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Loan Detail/LoanDetail_Hitung'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Loan Detail/LoanDetail_Berikutnya'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Loan Detail/LoanDetail_Berikutnya'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

