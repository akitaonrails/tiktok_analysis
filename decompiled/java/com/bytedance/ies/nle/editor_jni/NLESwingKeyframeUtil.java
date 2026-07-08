package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESwingKeyframeUtil {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLESwingKeyframeUtil(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLESwingKeyframeUtil() {
        this(NLEEditorJniJNI.new_NLESwingKeyframeUtil(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLESwingKeyframeUtil nLESwingKeyframeUtil) {
        if (nLESwingKeyframeUtil == null) {
            return 0L;
        }
        return nLESwingKeyframeUtil.swigCPtr;
    }

    public static String keyframePropertyNameForType(NLEKeyframePropertyType nLEKeyframePropertyType) {
        return NLEEditorJniJNI.NLESwingKeyframeUtil_keyframePropertyNameForType(nLEKeyframePropertyType.swigValue());
    }

    public NLESwingKeyframeUtil(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
