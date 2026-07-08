package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMeasure {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEMeasure(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEMeasure() {
        this(NLEEditorJniJNI.new_NLEMeasure(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMeasure nLEMeasure) {
        if (nLEMeasure == null) {
            return 0L;
        }
        return nLEMeasure.swigCPtr;
    }

    public static void performMeasure(NLETimeSpaceNode nLETimeSpaceNode) {
        NLEEditorJniJNI.NLEMeasure_performMeasure(NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
    }

    public NLEMeasure(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void measureInSwingTimeEffect(NLETimeSpaceNode nLETimeSpaceNode, long j) {
        NLEEditorJniJNI.NLEMeasure_measureInSwingTimeEffect(NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode, j);
    }

    public static void reCaculateSlotInSwing(NLEModel nLEModel, boolean z) {
        NLEEditorJniJNI.NLEMeasure_reCaculateSlotInSwing(NLEModel.getCPtr(nLEModel), nLEModel, z);
    }
}
