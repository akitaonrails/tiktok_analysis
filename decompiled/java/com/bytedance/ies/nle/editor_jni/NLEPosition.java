package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEPosition {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEPosition(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public float getX() {
        return NLEMediaJniJNI.NLEPosition_x_get(this.swigCPtr, this);
    }

    public float getY() {
        return NLEMediaJniJNI.NLEPosition_y_get(this.swigCPtr, this);
    }

    public NLEPosition() {
        this(NLEMediaJniJNI.new_NLEPosition__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEPosition nLEPosition) {
        if (nLEPosition == null) {
            return 0L;
        }
        return nLEPosition.swigCPtr;
    }

    public void setX(float f) {
        NLEMediaJniJNI.NLEPosition_x_set(this.swigCPtr, this, f);
    }

    public void setY(float f) {
        NLEMediaJniJNI.NLEPosition_y_set(this.swigCPtr, this, f);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEPosition(float f, float f2) {
        this(NLEMediaJniJNI.new_NLEPosition__SWIG_1(f, f2), true);
    }

    public NLEPosition(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
