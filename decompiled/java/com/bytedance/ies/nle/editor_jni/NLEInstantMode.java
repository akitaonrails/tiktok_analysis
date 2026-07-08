package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEInstantMode {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEInstantMode(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEInstantMode() {
        this(NLEEditorJniJNI.new_NLEInstantMode(), true);
    }

    public static String getInstantStickerRemove() {
        return NLEEditorJniJNI.NLEInstantMode_InstantStickerRemove_get();
    }

    public static String getInstantStickerScale() {
        return NLEEditorJniJNI.NLEInstantMode_InstantStickerScale_get();
    }

    public static String getInstantStickerTransform() {
        return NLEEditorJniJNI.NLEInstantMode_InstantStickerTransform_get();
    }

    public static String getKey() {
        return NLEEditorJniJNI.NLEInstantMode_Key_get();
    }

    public static String getPivotalStickerUUID() {
        return NLEEditorJniJNI.NLEInstantMode_PivotalStickerUUID_get();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEInstantMode nLEInstantMode) {
        if (nLEInstantMode == null) {
            return 0L;
        }
        return nLEInstantMode.swigCPtr;
    }

    public NLEInstantMode(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
