package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class PairFloatFloat {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_PairFloatFloat(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public float getFirst() {
        return NLEEditorJniJNI.PairFloatFloat_first_get(this.swigCPtr, this);
    }

    public float getSecond() {
        return NLEEditorJniJNI.PairFloatFloat_second_get(this.swigCPtr, this);
    }

    public PairFloatFloat() {
        this(NLEEditorJniJNI.new_PairFloatFloat__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public PairFloatFloat(PairFloatFloat pairFloatFloat) {
        this(NLEEditorJniJNI.new_PairFloatFloat__SWIG_2(getCPtr(pairFloatFloat), pairFloatFloat), true);
    }

    public static long getCPtr(PairFloatFloat pairFloatFloat) {
        if (pairFloatFloat == null) {
            return 0L;
        }
        return pairFloatFloat.swigCPtr;
    }

    public void setFirst(float f) {
        NLEEditorJniJNI.PairFloatFloat_first_set(this.swigCPtr, this, f);
    }

    public void setSecond(float f) {
        NLEEditorJniJNI.PairFloatFloat_second_set(this.swigCPtr, this, f);
    }

    public PairFloatFloat(float f, float f2) {
        this(NLEEditorJniJNI.new_PairFloatFloat__SWIG_1(f, f2), true);
    }

    public PairFloatFloat(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
