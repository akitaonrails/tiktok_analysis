package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class PairStringString {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_PairStringString(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getFirst() {
        return DavinciResourceJniJNI.PairStringString_first_get(this.swigCPtr, this);
    }

    public String getSecond() {
        return DavinciResourceJniJNI.PairStringString_second_get(this.swigCPtr, this);
    }

    public PairStringString() {
        this(DavinciResourceJniJNI.new_PairStringString__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public PairStringString(PairStringString pairStringString) {
        this(DavinciResourceJniJNI.new_PairStringString__SWIG_2(getCPtr(pairStringString), pairStringString), true);
    }

    public static long getCPtr(PairStringString pairStringString) {
        if (pairStringString == null) {
            return 0L;
        }
        return pairStringString.swigCPtr;
    }

    public void setFirst(String str) {
        DavinciResourceJniJNI.PairStringString_first_set(this.swigCPtr, this, str);
    }

    public void setSecond(String str) {
        DavinciResourceJniJNI.PairStringString_second_set(this.swigCPtr, this, str);
    }

    public PairStringString(String str, String str2) {
        this(DavinciResourceJniJNI.new_PairStringString__SWIG_1(str, str2), true);
    }

    public PairStringString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
