package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class PairStrInt {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_PairStrInt(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getFirst() {
        return NLETemplateJNI.PairStrInt_first_get(this.swigCPtr, this);
    }

    public int getSecond() {
        return NLETemplateJNI.PairStrInt_second_get(this.swigCPtr, this);
    }

    public PairStrInt() {
        this(NLETemplateJNI.new_PairStrInt__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public PairStrInt(PairStrInt pairStrInt) {
        this(NLETemplateJNI.new_PairStrInt__SWIG_2(getCPtr(pairStrInt), pairStrInt), true);
    }

    public static long getCPtr(PairStrInt pairStrInt) {
        if (pairStrInt == null) {
            return 0L;
        }
        return pairStrInt.swigCPtr;
    }

    public void setFirst(String str) {
        NLETemplateJNI.PairStrInt_first_set(this.swigCPtr, this, str);
    }

    public void setSecond(int i) {
        NLETemplateJNI.PairStrInt_second_set(this.swigCPtr, this, i);
    }

    public PairStrInt(String str, int i) {
        this(NLETemplateJNI.new_PairStrInt__SWIG_1(str, i), true);
    }

    public PairStrInt(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
