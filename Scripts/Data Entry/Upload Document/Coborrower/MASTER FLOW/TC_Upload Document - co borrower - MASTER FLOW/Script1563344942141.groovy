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

Mobile.tap(findTestObject('Upload Document/Tab/UnggahDokumen_TabCoBorrower'), 0)

if (CoBorrower_varUploadKTP == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnKTP'), 0)

    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)

	Mobile.scrollToText(CoBorrower_varKTP, FailureHandling.STOP_ON_FAILURE)
	
    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : CoBorrower_varKTP]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (CoBorrower_varUploadSelfie == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnSelfie'), 0)

    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)

	Mobile.scrollToText(CoBorrower_varSelfie, FailureHandling.STOP_ON_FAILURE)
	
    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : CoBorrower_varSelfie]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (CoBorrower_varUploadWefie == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnWefie'), 0)

    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)

	Mobile.scrollToText(CoBorrower_varWefie, FailureHandling.STOP_ON_FAILURE)
	
    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : CoBorrower_varWefie]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (CoBorrower_varUploadSim == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnSim'), 0)

    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)

	Mobile.scrollToText(CoBorrower_varSim, FailureHandling.STOP_ON_FAILURE)
	
    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : CoBorrower_varSim]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (CoBorrower_varUploadNPWP == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnNPWP'), 0)

    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)

	Mobile.scrollToText(CoBorrower_varNPWP, FailureHandling.STOP_ON_FAILURE)
	
    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : CoBorrower_varNPWP]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (CoBorrower_varUploadSTNK == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnSTNK'), 0)

    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)

	Mobile.scrollToText(CoBorrower_varSTNK, FailureHandling.STOP_ON_FAILURE)
	
    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : CoBorrower_varSTNK]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (CoBorrower_varUploadSlipGaji == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnSlipGaji'), 0)

    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)

	Mobile.scrollToText(CoBorrower_varSlipGaji, FailureHandling.STOP_ON_FAILURE)
	
    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : CoBorrower_varSlipGaji]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

if (CoBorrower_varUploadKK == 'Y') {
    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnKartuKeluarga'), 0)

    Mobile.tap(findTestObject('Upload Document/Upload Document - Item Upload/UnggahDokumen_BtnGallery'), 0)

	Mobile.scrollToText(CoBorrower_varKK, FailureHandling.STOP_ON_FAILURE)
	
    Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : CoBorrower_varKK]), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

