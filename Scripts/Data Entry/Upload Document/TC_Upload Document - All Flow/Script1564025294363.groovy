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

WebUI.callTestCase(findTestCase('dynamic test case/open application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

if (varUploadBorrower == 'Y') {
    WebUI.callTestCase(findTestCase('Data Entry/Upload Document/Borrower/MASTER FLOW/TC_Upload Document - borrower - MASTER FLOW'), 
        [('Borrower_varKTP') : Borrower_varKTP, ('Borrower_varSelfie') : Borrower_varSelfie, ('Borrower_varWefie') : Borrower_varWefie
            , ('Borrower_varKartuKeluarga') : Borrower_varKartuKeluarga, ('Borrower_varSim') : Borrower_varSim, ('Borrower_varNPWP') : Borrower_varNPWP
            , ('Borrower_varSTNK') : Borrower_varSTNK, ('Borrower_varSlipGaji') : Borrower_varSlipGaji, ('Borrower_varUploadKTP') : Borrower_varUploadKTP
            , ('Borrower_varUploadSelfie') : Borrower_varUploadSelfie, ('Borrower_varUploadWefie') : Borrower_varUploadWefie
            , ('Borrower_varUploadKartuKeluarga') : Borrower_varUploadKartuKeluarga, ('Borrower_varUploadSim') : Borrower_varUploadSim
            , ('Borrower_varUploadNPWP') : Borrower_varUploadNPWP, ('Borrower_varUploadSTNK') : Borrower_varUploadSTNK, ('Borrower_varUploadSlipGaji') : Borrower_varUploadSlipGaji], 
        FailureHandling.STOP_ON_FAILURE)
}

if (varUploadCoborrower == 'Y') {
    WebUI.callTestCase(findTestCase('Data Entry/Upload Document/Coborrower/MASTER FLOW/TC_Upload Document - co borrower - MASTER FLOW'), 
        [('CoBorrower_varKTP') : CoBorrower_varKTP, ('CoBorrower_varSelfie') : CoBorrower_varSelfie, ('CoBorrower_varWefie') : CoBorrower_varWefie
            , ('CoBorrower_varSim') : CoBorrower_varSim, ('CoBorrower_varNPWP') : CoBorrower_varNPWP, ('CoBorrower_varSTNK') : CoBorrower_varSTNK
            , ('CoBorrower_varSlipGaji') : CoBorrower_varSlipGaji, ('CoBorrower_varKK') : CoBorrower_varKK, ('CoBorrower_varUploadKTP') : CoBorrower_varUploadKTP
            , ('CoBorrower_varUploadSelfie') : CoBorrower_varUploadSelfie, ('CoBorrower_varUploadWefie') : CoBorrower_varUploadWefie
            , ('CoBorrower_varUploadSim') : CoBorrower_varUploadSim, ('CoBorrower_varUploadNPWP') : CoBorrower_varUploadNPWP
            , ('CoBorrower_varUploadSTNK') : CoBorrower_varUploadSTNK, ('CoBorrower_varUploadSlipGaji') : CoBorrower_varUploadSlipGaji
            , ('CoBorrower_varUploadKK') : CoBorrower_varUploadKK], FailureHandling.STOP_ON_FAILURE)
}

if (varUploadGuarantor == 'Y') {
    WebUI.callTestCase(findTestCase('Data Entry/Upload Document/Guarantor/MASTER FLOW/TC_Upload Document - guarantor - MASTER FLOW'), 
        [('Guarantor_varKTP') : Guarantor_varKTP, ('Guarantor_varSelfie') : Guarantor_varSelfie, ('Guarantor_varWefie') : Guarantor_varWefie
            , ('Guarantor_varKartuKeluarga') : Guarantor_varKartuKeluarga, ('Guarantor_varSim') : Guarantor_varSim, ('Guarantor_varNPWP') : Guarantor_varNPWP
            , ('Guarantor_varSTNK') : Guarantor_varSTNK, ('Guarantor_varSlipGaji') : Guarantor_varSlipGaji, ('Guarantor_varUploadKTP') : Guarantor_varUploadKTP
            , ('Guarantor_varUploadSelfie') : Guarantor_varUploadSelfie, ('Guarantor_varUploadWefie') : Guarantor_varUploadWefie
            , ('Guarantor_varUploadKartuKeluarga') : Guarantor_varUploadKartuKeluarga, ('Guarantor_varUploadSim') : Guarantor_varUploadSim
            , ('Guarantor_varUploadNPWP') : Guarantor_varUploadNPWP, ('Guarantor_varUploadSTNK') : Guarantor_varUploadSTNK
            , ('Guarantor_varUploadSlipGaji') : Guarantor_varUploadSlipGaji], FailureHandling.STOP_ON_FAILURE)
}

if (varUploadSales == 'Y') {
    WebUI.callTestCase(findTestCase('Data Entry/Upload Document/Sales/MASTER FLOW/TC_Upload Document - sales - MASTER FLOW'), 
        [('Sales_varKTP') : Sales_varKTP, ('Sales_varUploadKTP') : Sales_varUploadKTP], FailureHandling.STOP_ON_FAILURE)
}

