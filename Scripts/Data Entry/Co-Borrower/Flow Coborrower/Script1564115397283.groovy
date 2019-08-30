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

WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Identitas/TC Co-borrower Identitas'), [('CIvarKTP') : '3471095110940001'
        , ('CIvarNamaSesuaiIdentitas') : 'Fransiska Maya Lestari', ('CIvarTempatLahir') : 'YOGYAKARTA', ('CIvarAlamatLengkap') : 'Keparakan Kidul MG 1 / 1075'
        , ('CIvarRT') : '11', ('CIvarRW') : '11', ('CIvarKodePos') : '12420', ('CIvarAgama') : 'KATOLIK', ('CIvarPerkawinan') : 'MARRIED'
        , ('CIvarNegaraAsal') : 'AUSTRALIA', ('CIvarNomorPassport') : '34526729927762', ('CIvarKewarganegaraan') : 'WNI'
        , ('CIvarMasaBerlaku') : 'seumurhidup', ('CIvarVerifikasi') : 'Ya'], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Info Umum/TC Co-borrower Info Umum'), [('CIUvarNamaLengkap') : 'Fransiska Maya Lestari'
        , ('CIUvarNPWP') : '826819583541000', ('CIUvarNamaNPWP') : 'Fransiska Maya Lestari', ('CIUvarNamaIbu') : 'Astri'
        , ('CIUvarPendidikan') : 'S-1', ('CIUvarAlamatEmail') : 'mcaesagustay@gmail.com', ('CIUvarNoTlp1') : '021', ('CIUvarNoTlp2') : '6289211'
        , ('CIUvarHP') : '089627266744', ('CIUvarJenisAkunSosmed') : 'INSTAGRAM', ('CIUvarAkunSosmed') : '@tharamcy'], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Domisili/TC Co-borrower Domisili'), [('CDvarAlamatLengkap') : 'jl wahyu 1 no 18 jakarta selatan'
        , ('CDvarRT') : '11', ('CDvarRW') : '11', ('CDvarKodePos') : '12420', ('CDvarNegaraDomisili') : 'INDONESIA', ('CDvarPetunjukAlamat') : 'seberang pasar'
        , ('CDvarNoTlp1') : '021', ('CDvarNoTlp2') : '653557', ('CDvarTinggalSejakKapan') : '1964', ('CDvarStatusTempatTinggal') : 'MILIK KELUARGA'
        , ('CDvarDomisili') : 'Ya'], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborower-Pekerjaan-DetailPekerjaanBar'), 0)

if (CvarPekerjaanTab == 'Ya') {
    WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Pekerjaan/TC Co-borrower Pekerjaan'), [('CPvarPekerjaan') : 'KARYAWAN SWASTA'
            , ('CPvarDepartemen') : 'KEUANGAN', ('CPvarJabatan') : 'MARKETING', ('CPvarStatusKaryawan') : 'TETAP', ('CPvarNIK') : '54327'
            , ('CPvarBadanUsaha') : 'CV', ('CPvarNamaPerusahaan') : 'MARKETINGKU', ('CPvarBidangUsaha') : 'ASURANSI', ('CPvarSubBidangUsaha') : 'ASURANSI DAN DANA PENSIUN'
            , ('CPvarNationalityPerusahaan') : 'INDONESIA', ('CPvarWebsite') : 'dokterku.com', ('CPvarJenisAkunSosmed') : 'INSTAGRAM'
            , ('CPvarAkunSosmed') : '@dokterku', ('CPvarAlamatKantor') : 'jl rs fatmawati no 9 jakarta selatan', ('CPvarRT') : '11'
            , ('CPvarRW') : '11', ('CPvarKodePos') : '12420', ('CPvarPetunjukAlamat') : 'seberang pasar\r\n', ('CPvarNoTlp1') : '021'
            , ('CPvarNoTlp2') : '98727', ('CPvarNoExt') : '655'], FailureHandling.STOP_ON_FAILURE)
}

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

if (CvarUsahaTab == 'Ya') {
    CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

    WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Usaha/TC Co-borrower Usaha'), [('CUvarPekerjaan') : 'PENGUSAHA'
            , ('CUvarBadanUsaha') : 'CV', ('CUvarNamaPerusahaan') : 'ASURANSIBULAN', ('CUvarBidangUsaha') : 'ASURANSI', ('CUvarSubBidangUsaha') : 'ASURANSI DAN DANA PENSIUN'
            , ('CUvarAlamatKantor') : 'jl wahyu 1 no 18', ('CUvarRT') : '11', ('CUvarRW') : '11', ('CUvarKodePos') : '12420'
            , ('CUvarPetunjukAlamat') : 'seberang pasar', ('CUvarTlp1') : '021', ('CUvarTlp2') : '647389', ('CUvarExt') : '234'
            , ('CUvarHP') : '089725526722', ('CUvarWebsite') : 'asurnsibulan.com', ('CUvarAkunsosmed') : '@ASURANSIBULAN'
            , ('CUvarJenisSosmed') : 'INSTAGRAM'], FailureHandling.STOP_ON_FAILURE)
}

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

