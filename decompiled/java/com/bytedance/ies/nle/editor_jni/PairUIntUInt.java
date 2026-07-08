package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class PairUIntUInt {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_PairUIntUInt(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getFirst() {
        return NLEEditorJniJNI.PairUIntUInt_first_get(this.swigCPtr, this);
    }

    public long getSecond() {
        return NLEEditorJniJNI.PairUIntUInt_second_get(this.swigCPtr, this);
    }

    public PairUIntUInt() {
        this(NLEEditorJniJNI.new_PairUIntUInt__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public PairUIntUInt(PairUIntUInt pairUIntUInt) {
        this(NLEEditorJniJNI.new_PairUIntUInt__SWIG_2(getCPtr(pairUIntUInt), pairUIntUInt), true);
    }

    public static long getCPtr(PairUIntUInt pairUIntUInt) {
        if (pairUIntUInt == null) {
            return 0L;
        }
        return pairUIntUInt.swigCPtr;
    }

    public void setFirst(long j) {
        NLEEditorJniJNI.PairUIntUInt_first_set(this.swigCPtr, this, j);
    }

    public void setSecond(long j) {
        NLEEditorJniJNI.PairUIntUInt_second_set(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public PairUIntUInt(long j, long j2) {
        this(NLEEditorJniJNI.new_PairUIntUInt__SWIG_1(j, j2), true);
    }

    public PairUIntUInt(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
