package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class PairIntInt {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_PairIntInt(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getFirst() {
        return NLEEditorJniJNI.PairIntInt_first_get(this.swigCPtr, this);
    }

    public int getSecond() {
        return NLEEditorJniJNI.PairIntInt_second_get(this.swigCPtr, this);
    }

    public PairIntInt() {
        this(NLEEditorJniJNI.new_PairIntInt__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public PairIntInt(PairIntInt pairIntInt) {
        this(NLEEditorJniJNI.new_PairIntInt__SWIG_2(getCPtr(pairIntInt), pairIntInt), true);
    }

    public static long getCPtr(PairIntInt pairIntInt) {
        if (pairIntInt == null) {
            return 0L;
        }
        return pairIntInt.swigCPtr;
    }

    public void setFirst(int i) {
        NLEEditorJniJNI.PairIntInt_first_set(this.swigCPtr, this, i);
    }

    public void setSecond(int i) {
        NLEEditorJniJNI.PairIntInt_second_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public PairIntInt(int i, int i2) {
        this(NLEEditorJniJNI.new_PairIntInt__SWIG_1(i, i2), true);
    }

    public PairIntInt(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
