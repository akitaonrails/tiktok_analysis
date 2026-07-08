package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLERectF {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLERectF(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public float getBottom() {
        return NLEMediaJniJNI.NLERectF_bottom_get(this.swigCPtr, this);
    }

    public float getLeft() {
        return NLEMediaJniJNI.NLERectF_left_get(this.swigCPtr, this);
    }

    public float getRight() {
        return NLEMediaJniJNI.NLERectF_right_get(this.swigCPtr, this);
    }

    public float getTop() {
        return NLEMediaJniJNI.NLERectF_top_get(this.swigCPtr, this);
    }

    public NLERectF() {
        this(NLEMediaJniJNI.new_NLERectF__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLERectF nLERectF) {
        if (nLERectF == null) {
            return 0L;
        }
        return nLERectF.swigCPtr;
    }

    public void setBottom(float f) {
        NLEMediaJniJNI.NLERectF_bottom_set(this.swigCPtr, this, f);
    }

    public void setLeft(float f) {
        NLEMediaJniJNI.NLERectF_left_set(this.swigCPtr, this, f);
    }

    public void setRight(float f) {
        NLEMediaJniJNI.NLERectF_right_set(this.swigCPtr, this, f);
    }

    public void setTop(float f) {
        NLEMediaJniJNI.NLERectF_top_set(this.swigCPtr, this, f);
    }

    public NLERectF(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public NLERectF(float f, float f2, float f3, float f4) {
        this(NLEMediaJniJNI.new_NLERectF__SWIG_1(f, f2, f3, f4), true);
    }
}
