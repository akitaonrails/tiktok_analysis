package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class PairNLEPoint2NLEPoint {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_PairNLEPoint2NLEPoint(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public VecNLEPointSPtr getFirst() {
        long jPairNLEPoint2NLEPoint_first_get = NLEEditorJniJNI.PairNLEPoint2NLEPoint_first_get(this.swigCPtr, this);
        if (jPairNLEPoint2NLEPoint_first_get == 0) {
            return null;
        }
        return new VecNLEPointSPtr(jPairNLEPoint2NLEPoint_first_get, false);
    }

    public VecNLEPointSPtr getSecond() {
        long jPairNLEPoint2NLEPoint_second_get = NLEEditorJniJNI.PairNLEPoint2NLEPoint_second_get(this.swigCPtr, this);
        if (jPairNLEPoint2NLEPoint_second_get == 0) {
            return null;
        }
        return new VecNLEPointSPtr(jPairNLEPoint2NLEPoint_second_get, false);
    }

    public PairNLEPoint2NLEPoint() {
        this(NLEEditorJniJNI.new_PairNLEPoint2NLEPoint__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public PairNLEPoint2NLEPoint(PairNLEPoint2NLEPoint pairNLEPoint2NLEPoint) {
        this(NLEEditorJniJNI.new_PairNLEPoint2NLEPoint__SWIG_2(getCPtr(pairNLEPoint2NLEPoint), pairNLEPoint2NLEPoint), true);
    }

    public static long getCPtr(PairNLEPoint2NLEPoint pairNLEPoint2NLEPoint) {
        if (pairNLEPoint2NLEPoint == null) {
            return 0L;
        }
        return pairNLEPoint2NLEPoint.swigCPtr;
    }

    public void setFirst(VecNLEPointSPtr vecNLEPointSPtr) {
        NLEEditorJniJNI.PairNLEPoint2NLEPoint_first_set(this.swigCPtr, this, VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr);
    }

    public void setSecond(VecNLEPointSPtr vecNLEPointSPtr) {
        NLEEditorJniJNI.PairNLEPoint2NLEPoint_second_set(this.swigCPtr, this, VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public PairNLEPoint2NLEPoint(VecNLEPointSPtr vecNLEPointSPtr, VecNLEPointSPtr vecNLEPointSPtr2) {
        this(NLEEditorJniJNI.new_PairNLEPoint2NLEPoint__SWIG_1(VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr, VecNLEPointSPtr.getCPtr(vecNLEPointSPtr2), vecNLEPointSPtr2), true);
    }

    public PairNLEPoint2NLEPoint(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
