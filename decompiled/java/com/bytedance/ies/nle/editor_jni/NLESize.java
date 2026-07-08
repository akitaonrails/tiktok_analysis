package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESize {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLESize(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String debug() {
        return NLEEditorJniJNI.NLESize_debug(this.swigCPtr, this);
    }

    public float getHeight() {
        return NLEEditorJniJNI.NLESize_height_get(this.swigCPtr, this);
    }

    public float getWidth() {
        return NLEEditorJniJNI.NLESize_width_get(this.swigCPtr, this);
    }

    public boolean valid() {
        return NLEEditorJniJNI.NLESize_valid(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLESize nLESize) {
        if (nLESize == null) {
            return 0L;
        }
        return nLESize.swigCPtr;
    }

    public void setHeight(float f) {
        NLEEditorJniJNI.NLESize_height_set(this.swigCPtr, this, f);
    }

    public void setWidth(float f) {
        NLEEditorJniJNI.NLESize_width_set(this.swigCPtr, this, f);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLESize(float f, float f2) {
        this(NLEEditorJniJNI.new_NLESize(f, f2), true);
    }

    public NLESize(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
