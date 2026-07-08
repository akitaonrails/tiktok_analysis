package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEContextProcessorFunc {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_NLEContextProcessorFunc(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLETemplateJNI.NLEContextProcessorFunc_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLETemplateJNI.NLEContextProcessorFunc_change_ownership(this, this.swigCPtr, true);
    }

    public NLEContextProcessorFunc() {
        this(NLETemplateJNI.new_NLEContextProcessorFunc(), true);
        NLETemplateJNI.NLEContextProcessorFunc_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEContextProcessorFunc nLEContextProcessorFunc) {
        if (nLEContextProcessorFunc == null) {
            return 0L;
        }
        return nLEContextProcessorFunc.swigCPtr;
    }

    public String decrypt(String str) {
        return NLETemplateJNI.NLEContextProcessorFunc_decrypt(this.swigCPtr, this, str);
    }

    public String encrypt(String str) {
        return NLETemplateJNI.NLEContextProcessorFunc_encrypt(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEContextProcessorFunc(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
