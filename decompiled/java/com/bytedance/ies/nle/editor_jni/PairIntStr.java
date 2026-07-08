package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class PairIntStr {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_PairIntStr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getFirst() {
        return NLETemplateJNI.PairIntStr_first_get(this.swigCPtr, this);
    }

    public String getSecond() {
        return NLETemplateJNI.PairIntStr_second_get(this.swigCPtr, this);
    }

    public PairIntStr() {
        this(NLETemplateJNI.new_PairIntStr__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public PairIntStr(PairIntStr pairIntStr) {
        this(NLETemplateJNI.new_PairIntStr__SWIG_2(getCPtr(pairIntStr), pairIntStr), true);
    }

    public static long getCPtr(PairIntStr pairIntStr) {
        if (pairIntStr == null) {
            return 0L;
        }
        return pairIntStr.swigCPtr;
    }

    public void setFirst(int i) {
        NLETemplateJNI.PairIntStr_first_set(this.swigCPtr, this, i);
    }

    public void setSecond(String str) {
        NLETemplateJNI.PairIntStr_second_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public PairIntStr(int i, String str) {
        this(NLETemplateJNI.new_PairIntStr__SWIG_1(i, str), true);
    }

    public PairIntStr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
