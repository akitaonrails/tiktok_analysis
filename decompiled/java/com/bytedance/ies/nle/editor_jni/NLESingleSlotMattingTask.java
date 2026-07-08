package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLESingleSlotMattingTask {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_NLESingleSlotMattingTask(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean cancel() {
        return NLETemplateJNI.NLESingleSlotMattingTask_cancel(this.swigCPtr, this);
    }

    public boolean start() {
        return NLETemplateJNI.NLESingleSlotMattingTask_start(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLESingleSlotMattingTask nLESingleSlotMattingTask) {
        if (nLESingleSlotMattingTask == null) {
            return 0L;
        }
        return nLESingleSlotMattingTask.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLESingleSlotMattingTask(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public NLESingleSlotMattingTask(NLETrackSlot nLETrackSlot, NLEModel nLEModel, String str, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback) {
        this(NLETemplateJNI.new_NLESingleSlotMattingTask__SWIG_1(NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, NLEModel.getCPtr(nLEModel), nLEModel, str, INLETemplateMattingServiceCallback.getCPtr(iNLETemplateMattingServiceCallback), iNLETemplateMattingServiceCallback), true);
    }

    public NLESingleSlotMattingTask(NLETrackSlot nLETrackSlot, NLEModel nLEModel, String str, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, String str2) {
        this(NLETemplateJNI.new_NLESingleSlotMattingTask__SWIG_0(NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, NLEModel.getCPtr(nLEModel), nLEModel, str, INLETemplateMattingServiceCallback.getCPtr(iNLETemplateMattingServiceCallback), iNLETemplateMattingServiceCallback, str2), true);
    }
}
