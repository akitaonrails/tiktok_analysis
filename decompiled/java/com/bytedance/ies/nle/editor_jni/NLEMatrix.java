package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMatrix {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEMatrix(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public float getRelativeHeight() {
        return NLEEditorJniJNI.NLEMatrix_relativeHeight_get(this.swigCPtr, this);
    }

    public float getRelativeWidth() {
        return NLEEditorJniJNI.NLEMatrix_relativeWidth_get(this.swigCPtr, this);
    }

    public float getRotation() {
        return NLEEditorJniJNI.NLEMatrix_rotation_get(this.swigCPtr, this);
    }

    public long getStartTime() {
        return NLEEditorJniJNI.NLEMatrix_startTime_get(this.swigCPtr, this);
    }

    public float getTransformX() {
        return NLEEditorJniJNI.NLEMatrix_transformX_get(this.swigCPtr, this);
    }

    public float getTransformY() {
        return NLEEditorJniJNI.NLEMatrix_transformY_get(this.swigCPtr, this);
    }

    public int getTransformZ() {
        return NLEEditorJniJNI.NLEMatrix_transformZ_get(this.swigCPtr, this);
    }

    public String toString() {
        return NLEEditorJniJNI.NLEMatrix_toString(this.swigCPtr, this);
    }

    public NLEMatrix() {
        this(NLEEditorJniJNI.new_NLEMatrix(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMatrix nLEMatrix) {
        if (nLEMatrix == null) {
            return 0L;
        }
        return nLEMatrix.swigCPtr;
    }

    public void setRelativeHeight(float f) {
        NLEEditorJniJNI.NLEMatrix_relativeHeight_set(this.swigCPtr, this, f);
    }

    public void setRelativeWidth(float f) {
        NLEEditorJniJNI.NLEMatrix_relativeWidth_set(this.swigCPtr, this, f);
    }

    public void setRotation(float f) {
        NLEEditorJniJNI.NLEMatrix_rotation_set(this.swigCPtr, this, f);
    }

    public void setStartTime(long j) {
        NLEEditorJniJNI.NLEMatrix_startTime_set(this.swigCPtr, this, j);
    }

    public void setTransformX(float f) {
        NLEEditorJniJNI.NLEMatrix_transformX_set(this.swigCPtr, this, f);
    }

    public void setTransformY(float f) {
        NLEEditorJniJNI.NLEMatrix_transformY_set(this.swigCPtr, this, f);
    }

    public void setTransformZ(int i) {
        NLEEditorJniJNI.NLEMatrix_transformZ_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMatrix(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
