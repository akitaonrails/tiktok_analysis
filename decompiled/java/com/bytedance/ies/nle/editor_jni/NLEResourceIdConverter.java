package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEResourceIdConverter {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEResourceIdConverter(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static String convertAlgorithmResourceWithModelName(String str) {
        return NLEEditorJniJNI.NLEResourceIdConverter_convertAlgorithmResourceWithModelName(str);
    }

    public static String convertLokiResourceWithEffectId(String str) {
        return NLEEditorJniJNI.NLEResourceIdConverter_convertLokiResourceWithEffectId(str);
    }

    public static String convertMusicIdResource(String str) {
        return NLEEditorJniJNI.NLEResourceIdConverter_convertMusicIdResource(str);
    }

    public static String convertUrlResource(String str) {
        return NLEEditorJniJNI.NLEResourceIdConverter_convertUrlResource(str);
    }

    public static String convertVidResource(String str) {
        return NLEEditorJniJNI.NLEResourceIdConverter_convertVidResource(str);
    }

    public static long getCPtr(NLEResourceIdConverter nLEResourceIdConverter) {
        if (nLEResourceIdConverter == null) {
            return 0L;
        }
        return nLEResourceIdConverter.swigCPtr;
    }

    public NLEResourceIdConverter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static String convertAlgorithmResourceWithRequirements(VecString vecString, String str) {
        return NLEEditorJniJNI.NLEResourceIdConverter_convertAlgorithmResourceWithRequirements(VecString.getCPtr(vecString), vecString, str);
    }

    public static String convertLokiResourceWithResourceId(String str, String str2) {
        return NLEEditorJniJNI.NLEResourceIdConverter_convertLokiResourceWithResourceId(str, str2);
    }
}
