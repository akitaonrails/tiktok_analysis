package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEFilterName {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEFilterName(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEFilterName() {
        this(NLEEditorJniJNI.new_NLEFilterName(), true);
    }

    public static String getAI_MATTING() {
        return NLEEditorJniJNI.NLEFilterName_getAI_MATTING();
    }

    public static String getAUDIO_COMMON_FILTER() {
        return NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER();
    }

    public static String getAUDIO_DSP_FILTER() {
        return NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER();
    }

    public static String getAUDIO_EFFECT_ADJUST() {
        return NLEEditorJniJNI.NLEFilterName_getAUDIO_EFFECT_ADJUST();
    }

    public static String getAUDIO_FADE_FILTER() {
        return NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER();
    }

    public static String getAUDIO_LOUDNESS_BALANCE_FILTER() {
        return NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER();
    }

    public static String getAUDIO_MATRIX_FILTER() {
        return NLEEditorJniJNI.NLEFilterName_getAUDIO_MATRIX_FILTER();
    }

    public static String getAUDIO_SAMI_FILTER() {
        return NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER();
    }

    public static String getAUDIO_VOICE_BEAUTIFY_FILTER() {
        return NLEEditorJniJNI.NLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER();
    }

    public static String getAUDIO_VOLUME_FILTER() {
        return NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER();
    }

    public static String getBEAUTFY_FILTER() {
        return NLEEditorJniJNI.NLEFilterName_getBEAUTFY_FILTER();
    }

    public static String getBEAUTY() {
        return NLEEditorJniJNI.NLEFilterName_getBEAUTY();
    }

    public static String getBRIGHTNESS() {
        return NLEEditorJniJNI.NLEFilterName_getBRIGHTNESS();
    }

    public static String getCOLOR_CURVES() {
        return NLEEditorJniJNI.NLEFilterName_getCOLOR_CURVES();
    }

    public static String getCOMMON() {
        return NLEEditorJniJNI.NLEFilterName_getCOMMON();
    }

    public static String getCONTRACT() {
        return NLEEditorJniJNI.NLEFilterName_getCONTRACT();
    }

    public static String getEFFECT_STICKER() {
        return NLEEditorJniJNI.NLEFilterName_getEFFECT_STICKER();
    }

    public static String getFADE() {
        return NLEEditorJniJNI.NLEFilterName_getFADE();
    }

    public static String getFIGURE_SLIM() {
        return NLEEditorJniJNI.NLEFilterName_getFIGURE_SLIM();
    }

    public static String getFIGURE_STRETCH() {
        return NLEEditorJniJNI.NLEFilterName_getFIGURE_STRETCH();
    }

    public static String getFIGURE_ZOOM() {
        return NLEEditorJniJNI.NLEFilterName_getFIGURE_ZOOM();
    }

    public static String getHDR() {
        return NLEEditorJniJNI.NLEFilterName_getHDR();
    }

    public static String getHIGHLIGHT() {
        return NLEEditorJniJNI.NLEFilterName_getHIGHLIGHT();
    }

    public static String getHSL() {
        return NLEEditorJniJNI.NLEFilterName_getHSL();
    }

    public static String getLENS_HDR() {
        return NLEEditorJniJNI.NLEFilterName_getLENS_HDR();
    }

    public static String getLIGHT_SENSATION() {
        return NLEEditorJniJNI.NLEFilterName_getLIGHT_SENSATION();
    }

    public static String getLOG_COLOR_WHEELS() {
        return NLEEditorJniJNI.NLEFilterName_getLOG_COLOR_WHEELS();
    }

    public static String getLUT() {
        return NLEEditorJniJNI.NLEFilterName_getLUT();
    }

    public static String getPARTICLE() {
        return NLEEditorJniJNI.NLEFilterName_getPARTICLE();
    }

    public static String getPRIMARY_COLOR_WHEELS() {
        return NLEEditorJniJNI.NLEFilterName_getPRIMARY_COLOR_WHEELS();
    }

    public static String getRESHAPE() {
        return NLEEditorJniJNI.NLEFilterName_getRESHAPE();
    }

    public static String getSATURATION() {
        return NLEEditorJniJNI.NLEFilterName_getSATURATION();
    }

    public static String getSHADOW() {
        return NLEEditorJniJNI.NLEFilterName_getSHADOW();
    }

    public static String getSHARPEN() {
        return NLEEditorJniJNI.NLEFilterName_getSHARPEN();
    }

    public static String getTEMPERATURE() {
        return NLEEditorJniJNI.NLEFilterName_getTEMPERATURE();
    }

    public static String getTONE() {
        return NLEEditorJniJNI.NLEFilterName_getTONE();
    }

    public static String getVIDEO_EFFECT() {
        return NLEEditorJniJNI.NLEFilterName_getVIDEO_EFFECT();
    }

    public static String getVIDEO_LENS_HDR() {
        return NLEEditorJniJNI.NLEFilterName_getVIDEO_LENS_HDR();
    }

    public static String getVIGNETTING() {
        return NLEEditorJniJNI.NLEFilterName_getVIGNETTING();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEFilterName nLEFilterName) {
        if (nLEFilterName == null) {
            return 0L;
        }
        return nLEFilterName.swigCPtr;
    }

    public NLEFilterName(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
