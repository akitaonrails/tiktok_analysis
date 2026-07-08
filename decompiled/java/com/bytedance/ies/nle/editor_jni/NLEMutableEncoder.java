package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMutableEncoder {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_NLEMutableEncoder(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEMutableEncoder() {
        this(NLETemplateJNI.new_NLEMutableEncoder(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMutableEncoder nLEMutableEncoder) {
        if (nLEMutableEncoder == null) {
            return 0L;
        }
        return nLEMutableEncoder.swigCPtr;
    }

    public String encodeMutableItems(NLETemplateModel nLETemplateModel) {
        return NLETemplateJNI.NLEMutableEncoder_encodeMutableItems(this.swigCPtr, this, NLETemplateModel.getCPtr(nLETemplateModel), nLETemplateModel);
    }

    public NLEMutableEncoder(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
