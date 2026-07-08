package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEEditorJni implements NLEEditorJniConstants {
    public static long getNLETimeMax() {
        return NLEEditorJniJNI.NLETimeMax_get();
    }

    public static String NLEAlphaSplitTypeToString(NLEAlphaSplitType nLEAlphaSplitType) {
        return NLEEditorJniJNI.NLEAlphaSplitTypeToString(nLEAlphaSplitType.swigValue());
    }

    public static String NLEResTypeToString(NLEResType nLEResType) {
        return NLEEditorJniJNI.NLEResTypeToString(nLEResType.swigValue());
    }

    public static String NLETrackTypeToString(NLETrackType nLETrackType) {
        return NLEEditorJniJNI.NLETrackTypeToString(nLETrackType.swigValue());
    }
}
