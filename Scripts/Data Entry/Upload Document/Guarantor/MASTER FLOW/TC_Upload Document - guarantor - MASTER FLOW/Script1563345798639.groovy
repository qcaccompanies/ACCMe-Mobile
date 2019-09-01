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

Mobile.tap(findTestObject('Upload Document/Tab/UnggahDokumen_TabGuarantor'), 0)

if (Guarantor_varUploadKTP == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnKTP'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)
    } else {
        Mobile.tap(findTestObject('Upload Document/android.view.View168 -  Gallery'), 0)
    }
    
    Mobile.scrollToText(Guarantor_varKTP, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : Guarantor_varKTP]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (Guarantor_varUploadSelfie == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnSelfie'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)
    } else {
        Mobile.tap(findTestObject('Upload Document/android.view.View168 -  Gallery'), 0)
    }
    
    Mobile.scrollToText(Guarantor_varSelfie, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : Guarantor_varSelfie]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (Guarantor_varUploadWefie == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnWefie'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)
    } else {
        Mobile.tap(findTestObject('Upload Document/android.view.View168 -  Gallery'), 0)
    }
    
    Mobile.scrollToText(Guarantor_varWefie, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : Guarantor_varWefie]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (Guarantor_varUploadKartuKeluarga == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnKartuKeluarga'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)
    } else {
        Mobile.tap(findTestObject('Upload Document/android.view.View168 -  Gallery'), 0)
    }
    
    Mobile.scrollToText(Guarantor_varKartuKeluarga, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : Guarantor_varKartuKeluarga]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (Guarantor_varUploadSim == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnSim'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)
    } else {
        Mobile.tap(findTestObject('Upload Document/android.view.View168 -  Gallery'), 0)
    }
    
    Mobile.scrollToText(Guarantor_varSim, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : Guarantor_varSim]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (Guarantor_varUploadNPWP == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnNPWP'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)
    } else {
        Mobile.tap(findTestObject('Upload Document/android.view.View168 -  Gallery'), 0)
    }
    
    Mobile.scrollToText(Guarantor_varNPWP, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : Guarantor_varNPWP]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (Guarantor_varUploadSTNK == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnSTNK'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)
    } else {
        Mobile.tap(findTestObject('Upload Document/android.view.View168 -  Gallery'), 0)
    }
    
    Mobile.scrollToText(Guarantor_varSTNK, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : Guarantor_varSTNK]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (Guarantor_varUploadSlipGaji == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnSlipGaji'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)
    } else {
        Mobile.tap(findTestObject('Upload Document/android.view.View168 -  Gallery'), 0)
    }
    
    Mobile.scrollToText(Guarantor_varSlipGaji, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : Guarantor_varSlipGaji]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

