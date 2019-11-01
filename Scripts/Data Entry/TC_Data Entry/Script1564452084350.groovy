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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('dynamic test case/open application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(40, FailureHandling.STOP_ON_FAILURE)

//simulasi kredit
WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Simulasi Kredit/MASTER FLOW/TC_Simulasi Kredit - MASTER FLOW'), 
    [('varBrand') : varBrand, ('varType') : varType, ('varModel') : varModel, ('varTahun') : varTahun, ('varTenor') : varTenor
        , ('varOTR') : varOTR, ('varRP') : varRP, ('varDealer') : varDealer, ('varSales') : varSales, ('varTipePembiayaan') : varTipePembiayaan
        , ('varPembiayaan') : varPembiayaan, ('varUsedCar') : varUsedCar, ('varTopup') : varTopup, ('varADDMdanADDB') : varADDMdanADDB
        , ('varACP') : varACP, ('varPaket') : varPaket, ('varKodePaket') : varKodePaket, ('varNoKontrakExisting') : varNoKontrakExisting], 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Simulasi Kredit - Asuransi/MASTER FLOW/TC_Asuransi - MASTER FLOW'), 
    [('varAsuransi') : varAsuransi, ('varKodeWilayah') : varKodeWilayah, ('varTipeAsuransi') : varTipeAsuransi, ('varPenggunaanUnit') : varPenggunaanUnit
        , ('varPembayaranAsuransi') : varPembayaranAsuransi], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Kategori Loan/MASTER FLOW/TC_Kategori Loan - Master FLOW'), 
    [('varTipeAplikasi') : 'CF', ('varTipePelanggan') : 'personal', ('varObjekPembiayaan') : 'PB', ('varTujuanPembiayaan') : 'produktif'
        , ('varJaminanPembiayaan') : 'MOBIL', ('varOpsiNPWP') : 'Approval'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Loan Detail/MASTER FLOW/TC_Loan Detail - MASTER FLOW'), [('varTipeAngsuran') : varTipeAngsuran], 
    FailureHandling.STOP_ON_FAILURE)

// upload foto
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

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

Mobile.waitForElementPresent(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

WebUI.callTestCase(findTestCase('Data Entry/Borrower/Flow Borrower'), [('BvarPekerjaanTab') : BvarPekerjaanTab, ('BvarUsahaTab') : BvarUsahaTab
        , ('BIvarTahun') : BIvarTahun, ('BIvarNoKTP') : BIvarNoKTP, ('BIvarNamaSesuaiIdentitas') : BIvarNamaSesuaiIdentitas
        , ('BIvarTempatLahir') : BIvarTempatLahir, ('BIvarAlamatLengkap') : BIvarAlamatLengkap, ('BIvarRT') : BIvarRT, ('BIvarRW') : BIvarRW
        , ('BIvarKodePos') : BIvarKodePos, ('BIvarAgama') : BIvarAgama, ('BIvarStatusPerkawinan') : BIvarStatusPerkawinan
        , ('BIvarNegaraAsal') : BIvarNegaraAsal, ('BIvarNomorPassport') : BIvarNomorPassport, ('BIvarKewarganegaraan') : BIvarKewarganegaraan
        , ('BIvarMasaBerlaku') : BIvarMasaBerlaku, ('BIvarJenisKelamin') : BIvarJenisKelamin, ('BIUvarNamaLengkapTanpaSingkatan') : BIUvarNamaLengkapTanpaSingkatan
        , ('BIUvarNamaPanggilan') : BIUvarNamaPanggilan, ('BIUvarNoNPWP') : BIUvarNoNPWP, ('BIUvarNamaNPWP') : BIUvarNamaNPWP
        , ('BIUvarNamaIbuKandung') : BIUvarNamaIbuKandung, ('BIUvarPendidikan') : BIUvarPendidikan, ('BIUvarAlamatEmail') : BIUvarAlamatEmail
        , ('BIUvarSumberDanaUangMuka') : BIUvarSumberDanaUangMuka, ('BIUvarSumberDanaAngsuran') : BIUvarSumberDanaAngsuran
        , ('BIUvarKepemilikanDana') : BIUvarKepemilikanDana, ('BIUvarAlamatMenyurat') : BDvarNegaraDomisili, ('BDvarAlamatLengkap') : BDvarAlamatLengkap
        , ('BDvarRT') : BDvarRT, ('BDvarRW') : BDvarRW, ('BDvarKodePos') : BDvarKodePos, ('BDvarNegaraDomisili') : BDvarNegaraDomisili
        , ('BDvarPetunjukAlamat') : BDvarPetunjukAlamat, ('BDvarNoTelponFixedLine') : BDvarNoTelponFixedLine, ('BDvarKodeArea') : BDvarKodeArea
        , ('BDvarTinggalSejakTahun') : BDvarTinggalSejakTahun, ('BDvarStatusTempatTinggal') : BDvarStatusTempatTinggal, ('BDvarTelponSelular') : BDvarTelponSelular
        , ('BDvarDomisili') : BDvarDomisili, ('BDvarROAO') : BDvarROAO, ('BPvarPekerjaan') : BPvarPekerjaan, ('BPvarJabatan') : BPvarJabatan
        , ('BPvarDepartemen') : BPvarDepartemen, ('BPvarStatusKaryawan') : BPvarStatusKaryawan, ('BPvarNoIndukKaryawan') : BPvarNoIndukKaryawan
        , ('BPvarBergabungSejak') : BPvarBergabungSejak, ('BPvarBadanUsaha') : BPvarBadanUsaha, ('BPvarNamaPerusahaan') : BPvarNamaPerusahaan
        , ('BPvarBidangUsaha') : BPvarBidangUsaha, ('BPvarSubBidangUsaha') : BPvarSubBidangUsaha, ('BPvarNationalityPerusahaan') : BPvarNationalityPerusahaan
        , ('BPvarWebsite') : BPvarWebsite, ('BPvarJenisAkunSosialMedia') : BPvarJenisAkunSosialMedia, ('BPvarAkunSosialMedia') : BPvarAkunSosialMedia
        , ('BPvarAlamatKantor') : BPvarAlamatKantor, ('BPvarRT') : BPvarRT, ('BPvarRW') : BPvarRW, ('BPvarKodePos') : BPvarKodePos
        , ('BPvarPetunjukAlamat') : BPvarPetunjukAlamat, ('BPvarKodeArea') : BPvarKodeArea, ('BPvarNoTeleponKantor') : BPvarNoTeleponKantor
        , ('BPvarEXT') : BPvarEXT, ('BPvarTeleponSeluler') : BPvarTeleponSeluler, ('BUvarPekerjaan') : BUvarPekerjaan, ('BUvarBadanUsaha') : BUvarBadanUsaha
        , ('BUvarNamaUsaha') : BUvarNamaUsaha, ('BUvarBidangUsaha') : BUvarBidangUsaha, ('BUvarSubBidangUsaha') : BUvarSubBidangUsaha
        , ('BUvarTanggalMulaiBisnis') : BUvarTanggalMulaiBisnis, ('BUvarAlamatKantor') : BUvarAlamatKantor, ('BUvarKodePos') : BUvarKodePos
        , ('BUvarRT') : BUvarRT, ('BUvarRW') : BUvarRW, ('BUvarPetunjukAlamat') : BUvarPetunjukAlamat, ('BUvarKodeArea') : BUvarKodeArea
        , ('BUvarNoTelponKantor') : BUvarNoTelponKantor, ('BUvarTeleponSeluler') : BUvarTeleponSeluler, ('BUvarWebsite') : BUvarWebsite
        , ('BUvarJenisAkunSosialMedia') : BUvarJenisAkunSosialMedia, ('BUvarAkunSosialMedia') : BUvarAkunSosialMedia, ('BUvarEXT') : BUvarEXT
        , ('BUvarSesuaiDomisili') : BUvarSesuaiDomisili, ('BEvarNamaLengkap') : BEvarNamaLengkap, ('BEvarHubungan') : BEvarHubungan
        , ('BEvarAlamat') : BEvarAlamat, ('BEvarRT') : BEvarRT, ('BEvarRW') : BEvarRW, ('BEvarKodePos') : BEvarKodePos, ('BEvarKodeArea') : BEvarKodeArea
        , ('BEvarNoTelponKantor') : BEvarNoTelponKantor, ('BEvarEXT') : BEvarEXT, ('BEvarTeleponSelular') : BEvarTeleponSelular
        , ('BEvarEmail') : BEvarEmail], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.verifyElementVisible(findTestObject('Borrower/TxtSemuaDataSudahDiisi'), 80, FailureHandling.OPTIONAL)

if (AllStatusPerkawinan == 'Married') {
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Flow Coborrower'), [('CvarPekerjaanTab') : CvarPekerjaanTab, ('CvarUsahaTab') : CvarUsahaTab
            , ('CIvarKTP') : CIvarKTP, ('CIvarNamaSesuaiIdentitas') : CIvarNamaSesuaiIdentitas, ('CIvarTempatLahir') : CIvarTempatLahir
            , ('CIvarAlamatLengkap') : CIvarAlamatLengkap, ('CIvarRT') : CIvarRT, ('CIvarRW') : CIvarRW, ('CIvarKodePos') : CIvarKodePos
            , ('CIvarAgama') : CIvarAgama, ('CIvarPerkawinan') : CIvarPerkawinan, ('CIvarNegaraAsal') : CIvarNegaraAsal, ('CIvarNomorPassport') : CIvarNomorPassport
            , ('CIvarKewarganegaraan') : CIvarKewarganegaraan, ('CIvarMasaBerlaku') : CIvarMasaBerlaku, ('CIUvarNamaLengkap') : CIUvarNamaLengkap
            , ('CIUvarNPWP') : CIUvarNPWP, ('CIUvarNamaNPWP') : CIUvarNamaNPWP, ('CIUvarNamaIbu') : CIUvarNamaIbu, ('CIUvarPendidikan') : CIUvarPendidikan
            , ('CIUvarAlamatEmail') : CIUvarAlamatEmail, ('CIUvarNoTlp1') : CIUvarNoTlp1, ('CIUvarNoTlp2') : CIUvarNoTlp2
            , ('CIUvarHP') : CIUvarHP, ('CIUvarJenisAkunSosmed') : CIUvarJenisAkunSosmed, ('CIUvarAkunSosmed') : CIUvarAkunSosmed
            , ('CDvarAlamatLengkap') : CDvarAlamatLengkap, ('CDvarRT') : CDvarRT, ('CDvarRW') : CDvarRW, ('CDvarKodePos') : CDvarKodePos
            , ('CDvarNegaraDomisili') : CDvarNegaraDomisili, ('CDvarPetunjukAlamat') : CDvarPetunjukAlamat, ('CDvarNoTlp1') : CDvarNoTlp1
            , ('CDvarNoTlp2') : CDvarNoTlp2, ('CDvarTinggalSejakKapan') : CDvarTinggalSejakKapan, ('CDvarStatusTempatTinggal') : CDvarStatusTempatTinggal
            , ('CDvarDomisili') : CDvarDomisili, ('CPvarPekerjaan') : CPvarPekerjaan, ('CPvarDepartemen') : CPvarDepartemen
            , ('CPvarJabatan') : CPvarJabatan, ('CPvarStatusKaryawan') : CPvarStatusKaryawan, ('CPvarNIK') : CPvarNIK, ('CPvarBadanUsaha') : CPvarBadanUsaha
            , ('CPvarNamaPerusahaan') : CPvarNamaPerusahaan, ('CPvarBidangUsaha') : CPvarBidangUsaha, ('CPvarSubBidangUsaha') : CPvarSubBidangUsaha
            , ('CPvarNationalityPerusahaan') : CPvarNationalityPerusahaan, ('CPvarWebsite') : CPvarWebsite, ('CPvarJenisAkunSosmed') : CPvarJenisAkunSosmed
            , ('CPvarAkunSosmed') : CPvarAkunSosmed, ('CPvarAlamatKantor') : CPvarAlamatKantor, ('CPvarRT') : CPvarRT, ('CPvarRW') : CPvarRW
            , ('CPvarKodePos') : CPvarKodePos, ('CPvarPetunjukAlamat') : CPvarPetunjukAlamat, ('CPvarNoTlp1') : CPvarNoTlp1
            , ('CPvarNoTlp2') : CPvarNoTlp2, ('CPvarNoExt') : CPvarNoExt, ('CUvarPekerjaan') : CUvarPekerjaan, ('CUvarBadanUsaha') : CUvarBadanUsaha
            , ('CUvarNamaPerusahaan') : CUvarNamaPerusahaan, ('CUvarBidangUsaha') : CUvarBidangUsaha, ('CUvarSubBidangUsaha') : CUvarSubBidangUsaha
            , ('CUvarAlamatKantor') : CUvarAlamatKantor, ('CUvarRT') : CUvarRT, ('CUvarRW') : CUvarRW, ('CUvarKodePos') : CUvarKodePos
            , ('CUvarPetunjukAlamat') : CUvarPetunjukAlamat, ('CUvarTlp1') : CUvarTlp1, ('CUvarTlp2') : CUvarTlp2, ('CUvarExt') : CUvarExt
            , ('CUvarHP') : CUvarHP, ('CUvarWebsite') : CUvarWebsite, ('CUvarAkunsosmed') : CUvarAkunsosmed, ('CUvarJenisSosmed') : CUvarJenisSosmed], 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

    Mobile.verifyElementVisible(findTestObject('Borrower/TxtSemuaDataSudahDiisi'), 80, FailureHandling.OPTIONAL)
}

if (AllGuarantor == 'Ya') {
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Flow Guarantor'), [('GvarPekerjaanTab') : GvarPekerjaanTab, ('GvarUsahaTab') : GvarUsahaTab
            , ('GIvarNIK') : GIvarNIK, ('GIvarAgama') : GIvarAgama, ('GIvarStatus') : GIvarStatus, ('GIvarNamaSesuaiIdentitas') : GIvarNamaSesuaiIdentitas
            , ('GIvarTempatLahir') : GIvarTempatLahir, ('GIvarAlamatLengkap') : GIvarAlamatLengkap, ('GIvarRT') : GIvarRT
            , ('GIvarRW') : GIvarRW, ('GIvarKodePos') : GIvarKodePos, ('GIvarNegaraAsal') : GIvarNegaraAsal, ('GIvarNomorPassport') : GIvarNomorPassport
            , ('GIvarKewarganegaraan') : GIvarKewarganegaraan, ('GIvarMasaBerlaku') : GIvarMasaBerlaku, ('GIvarJenisKelamin') : GIvarJenisKelamin
            , ('GIUvarNamaLTS') : GIUvarNamaLTS, ('GIUvarNamaIbuK') : GIUvarNamaIbuK, ('GIUvarPendidikan') : GIUvarPendidikan
            , ('GIUvarEmail') : GIUvarEmail, ('GIUvarTseluler') : GIUvarTseluler, ('GIUvarAkunsosmed') : GIUvarAkunsosmed
            , ('GIUvarSosmed') : GIUvarSosmed, ('GIUvarNoNPWP') : GIUvarNoNPWP, ('GIUvarNamaNPWP') : GIUvarNamaNPWP, ('GIUvarKodeArea') : GIUvarKodeArea
            , ('GIUvarTelepon') : GIUvarTelepon, ('GDvarNegara') : GDvarNegara, ('GDvarPtjkAlamat') : GDvarPtjkAlamat, ('GDvarTngglSejakTahun') : GDvarTngglSejakTahun
            , ('GDvarStatusTT') : GDvarStatusTT, ('GDvarAlamatLengkap') : GDvarAlamatLengkap, ('GDvarRT') : GDvarRT, ('GDvarRW') : GDvarRW
            , ('GDvarKodePos') : GDvarKodePos, ('GDvarNoTlp1') : GDvarNoTlp1, ('GDvarNoTlp2') : GDvarNoTlp2, ('GDvarDomisili') : GDvarDomisili
            , ('GBvarJabatan') : GBvarJabatan, ('GBvarBadanUsaha') : GBvarBadanUsaha, ('GBvarBidangUsaha') : GBvarBidangUsaha
            , ('GBvarSubBdngUsaha') : GBvarSubBdngUsaha, ('GBvarPekerjaan') : GBvarPekerjaan, ('GBvarNamaPerusahaan') : GBvarNamaPerusahaan
            , ('GBvarNationalityPeruahaan') : GBvarNationalityPeruahaan, ('GBvarWebsite') : GBvarWebsite, ('GBvarJenisAkunSosmed') : GBvarJenisAkunSosmed
            , ('GBvarSosmed') : GBvarSosmed, ('GBvarStatusKaryawan') : GBvarStatusKaryawan, ('GBvarDepartemen') : GBvarDepartemen
            , ('GBvarAlamatKantor') : GBvarAlamatKantor, ('GBvarRT') : GBvarRT, ('GBvarRW') : GBvarRW, ('GBvarKodePos') : GBvarKodePos
            , ('GBvarPtnjkAlamat') : GBvarPtnjkAlamat, ('GBvarKodeArea') : GBvarKodeArea, ('GBvarTelepon') : GBvarTelepon
            , ('GBvarNIK') : GBvarNIK, ('GBvarEXT') : GBvarEXT, ('GUvarPekerjaan') : GUvarPekerjaan, ('GUvarBadanUsaha') : GUvarBadanUsaha
            , ('GUvarNamaUsaha') : GUvarNamaUsaha, ('GUvarBidangUsaha') : GUvarBidangUsaha, ('GUvarSubBidangUsaha') : GUvarSubBidangUsaha
            , ('GUvarAlamat') : GUvarAlamat, ('GUvarRT') : GUvarRT, ('GUvarRW') : GUvarRW, ('GUvarKodePos') : GUvarKodePos
            , ('GUvarPtnjkAlamat') : GUvarPtnjkAlamat, ('GUIvarTeleponseluler') : GUIvarTeleponseluler, ('GUvarWebsite') : GUvarWebsite
            , ('GUvarJenisSosmed') : GUvarJenisSosmed, ('GUvarSosmed') : GUvarSosmed], FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Penghasilan/MASTER FLOW/TC_Penghasilan - MASTER FLOW'), [('varPenghasilanKotorSatu') : varPenghasilanKotorSatu
        , ('varPenghasilanKotorDua') : varPenghasilanKotorDua, ('varPenghasilanKotorTiga') : varPenghasilanKotorTiga, ('varJenisPekerjaanAtauUsahaSatu') : varJenisPekerjaanAtauUsahaSatu
        , ('varJenisPekerjaanAtauUsahaDua') : varJenisPekerjaanAtauUsahaDua, ('varJenisPekerjaanAtauUsahaTiga') : varJenisPekerjaanAtauUsahaTiga
        , ('varSumberPenghasilanSatu') : varSumberPenghasilanSatu, ('varPemilikPenghasilanSatu') : varPemilikPenghasilanSatu
        , ('varPenghasilanDua') : varPenghasilanDua, ('varPenghasilanTiga') : varPenghasilanTiga], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Bank Account/Bank Account/MASTER FLOW/TC_Bank Account - Bank Account - MASTER FLOW'), 
    [('varNamaCabang') : varNamaCabang, ('varNomorRekening') : varNomorRekening, ('varNamaPemegangRekening') : varNamaPemegangRekening
        , ('varSumberDanaBilaTidakBekerja') : varSumberDanaBilaTidakBekerja, ('varMetodePembayaran') : varMetodePembayaran
        , ('varPembukaanRekeningPermata') : varPembukaanRekeningPermata], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Bank Account/Bank History/MASTER FLOW/TC_Bank Account - Bank History - MASTER FLOW'), 
    [('varNamaBank') : varNamaBank, ('varNomorRekening') : varNomorRekening, ('varNamaPemegangRekening') : varNamaPemegangRekening
        , ('varBulan') : varBulan, ('varFrekuensiDebit') : varFrekuensiDebit, ('varFrekuensiKredit') : varFrekuensiKredit
        , ('varMutasiDebit') : varMutasiDebit, ('varMutasiKredit') : varMutasiKredit, ('varSaldoTertinggi') : varSaldoTertinggi
        , ('varSaldoRataRata') : varSaldoRataRata, ('varSaldoTerrendah') : varSaldoTerrendah, ('varFrekuensiTolakanLuar') : varFrekuensiTolakanLuar
        , ('varFrekuensiTolakanDalam') : varFrekuensiTolakanDalam, ('varTambahBankHistory') : varTambahBankHistory], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.verifyElementVisible(findTestObject('Data Asset/DataAsset_InpNamaBPKB'), 80, FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Data Entry/Data Asset/MASTER FLOW/TC_Data Asset - MASTER FLOW'), [('varNomorRangka') : varNomorRangka
        , ('varNomorMesin') : varNomorMesin, ('varNamaBPKB') : varNamaBPKB, ('varNomorBPKB') : varNomorBPKB, ('varNomorPolisiDepan') : varNomorPolisiDepan
        , ('varNomorPolisiTengah') : varNomorPolisiTengah, ('varNomorPolisiBelakang') : varNomorPolisiBelakang, ('varNomorFaktur') : varNomorFaktur
        , ('varAlamat') : varAlamat, ('varRT') : varRT, ('varRW') : varRW, ('varKodePos') : varKodePos, ('varWarna') : varWarna
        , ('varBPKBBedaNama') : varBPKBBedaNama, ('Survey_varAlamatLengkap') : Survey_varAlamatLengkap, ('Survey_varRT') : Survey_varRT
        , ('Survey_varRW') : Survey_varRW, ('Survey_varKodePos') : Survey_varKodePos, ('Survey_varNoTeleponFixedLine') : Survey_varNoTeleponFixedLine
        , ('Survey_varTeleponSeluler') : Survey_varTeleponSeluler, ('Survey_varvarPetunjukAlamat') : Survey_varvarPetunjukAlamat
        , ('Survey_varAlamatSurveySamaDomisili') : Survey_varAlamatSurveySamaDomisili, ('BPKB_Identitas_varNomorIdentitas') : BPKB_Identitas_varNomorIdentitas
        , ('BPKB_Identitas_varNamaSesuaiIdentitas') : BPKB_Identitas_varNamaSesuaiIdentitas, ('BPKB_Identitas_varTempatLahir') : BPKB_Identitas_varTempatLahir
        , ('BPKB_Identitas_varAlamatLengkap') : BPKB_Identitas_varAlamatLengkap, ('BPKB_Identitas_varRT') : BPKB_Identitas_varRT
        , ('BPKB_Identitas_varRW') : BPKB_Identitas_varRW, ('BPKB_Identitas_varKodePos') : BPKB_Identitas_varKodePos, ('BPKB_Identitas_varAgama') : BPKB_Identitas_varAgama
        , ('BPKB_Identitas_varStatusPerkawinan') : BPKB_Identitas_varStatusPerkawinan, ('BPKB_Identitas_varKewarganegaraan') : BPKB_Identitas_varKewarganegaraan
        , ('BPKB_Identitas_varNegaraAsal') : BPKB_Identitas_varNegaraAsal, ('BPKB_Identitas_varNoPassport') : BPKB_Identitas_varNoPassport
        , ('BPKB_Identitas_varMasaBerlaku') : BPKB_Identitas_varMasaBerlaku], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

if (varBPKBBedaNama == 'Y') {
    not_run: Mobile.verifyElementVisible(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_BtnKewarganegaraan - WNA'), 
        60, FailureHandling.OPTIONAL)

    not_run: WebUI.callTestCase(findTestCase('Data Entry/BPKB Beda Nama/TC_BPKB Beda Nama - All Flow'), [('Survey_varAlamatLengkap') : Survey_varAlamatLengkap
            , ('Survey_varRT') : Survey_varRT, ('Survey_varRW') : Survey_varRW, ('Survey_varKodePos') : Survey_varKodePos
            , ('Survey_varNoTeleponFixedLine') : Survey_varNoTeleponFixedLine, ('Survey_varTeleponSeluler') : Survey_varTeleponSeluler
            , ('Survey_varvarPetunjukAlamat') : Survey_varvarPetunjukAlamat, ('Survey_varAlamatSurveySamaDomisili') : Survey_varAlamatSurveySamaDomisili
            , ('BPKB_Identitas_varNomorIdentitas') : BPKB_Identitas_varNomorIdentitas, ('BPKB_Identitas_varNamaSesuaiIdentitas') : BPKB_Identitas_varNamaSesuaiIdentitas
            , ('BPKB_Identitas_varTempatLahir') : BPKB_Identitas_varTempatLahir, ('BPKB_Identitas_varAlamatLengkap') : BPKB_Identitas_varAlamatLengkap
            , ('BPKB_Identitas_varRT') : BPKB_Identitas_varRT, ('BPKB_Identitas_varRW') : BPKB_Identitas_varRW, ('BPKB_Identitas_varKodePos') : BPKB_Identitas_varKodePos
            , ('BPKB_Identitas_varAgama') : BPKB_Identitas_varAgama, ('BPKB_Identitas_varStatusPerkawinan') : BPKB_Identitas_varStatusPerkawinan
            , ('BPKB_Identitas_varKewarganegaraan') : BPKB_Identitas_varKewarganegaraan, ('BPKB_Identitas_varNegaraAsal') : BPKB_Identitas_varNegaraAsal
            , ('BPKB_Identitas_varNoPassport') : BPKB_Identitas_varNoPassport, ('BPKB_Identitas_varMasaBerlaku') : BPKB_Identitas_varMasaBerlaku], 
        FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)
}

Mobile.verifyElementVisible(findTestObject('Summary Outstanding/SummaryOutstanding_BtnSubmit'), 80, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Summary Outstanding/MASTER FLOW/TC_Summary Outstanding - MASTER FLOW'), [:], 
    FailureHandling.STOP_ON_FAILURE)

