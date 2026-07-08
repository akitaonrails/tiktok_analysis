package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEModelVESequenceError {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEModelVESequenceError(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEModelVESequenceError() {
        this(NLEMediaJniJNI.new_NLEModelVESequenceError(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEModelVESequenceError nLEModelVESequenceError) {
        if (nLEModelVESequenceError == null) {
            return 0L;
        }
        return nLEModelVESequenceError.swigCPtr;
    }

    public NLEModelVESequenceError(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
