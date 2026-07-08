package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLELoggerFunc {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLELoggerFunc(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLELoggerFunc nLELoggerFunc) {
        if (nLELoggerFunc == null) {
            return 0L;
        }
        return nLELoggerFunc.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLELoggerFunc(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
