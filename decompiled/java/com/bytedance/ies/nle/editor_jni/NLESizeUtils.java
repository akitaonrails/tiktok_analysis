package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESizeUtils {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLESizeUtils(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLESizeUtils() {
        this(NLEEditorJniJNI.new_NLESizeUtils(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLESizeUtils nLESizeUtils) {
        if (nLESizeUtils == null) {
            return 0L;
        }
        return nLESizeUtils.swigCPtr;
    }

    public NLESizeUtils(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static NLESize NLESizeMake(float f, float f2) {
        return new NLESize(NLEEditorJniJNI.NLESizeUtils_NLESizeMake(f, f2), true);
    }
}
