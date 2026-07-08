package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLETemplateMattingService extends INLETemplateMattingService {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLETemplateJNI.delete_NLETemplateMattingService(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public boolean cancel() {
        return NLETemplateJNI.NLETemplateMattingService_cancel(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public void clear() {
        NLETemplateJNI.NLETemplateMattingService_clear(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public void removeListener() {
        NLETemplateJNI.NLETemplateMattingService_removeListener(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public boolean start() {
        return NLETemplateJNI.NLETemplateMattingService_start(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public void finalize() {
        delete();
    }

    public static long getCPtr(NLETemplateMattingService nLETemplateMattingService) {
        if (nLETemplateMattingService == null) {
            return 0L;
        }
        return nLETemplateMattingService.swigCPtr;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLETemplateMattingService
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLETemplateMattingService(long j, boolean z) {
        super(NLETemplateJNI.NLETemplateMattingService_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static String getMattingWorkSpace(String str, String str2) {
        return NLETemplateJNI.NLETemplateMattingService_getMattingWorkSpace(str, str2);
    }

    public NLETemplateMattingService(NLETemplateModel nLETemplateModel, String str, String str2, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback) {
        this(NLETemplateJNI.new_NLETemplateMattingService(NLETemplateModel.getCPtr(nLETemplateModel), nLETemplateModel, str, str2, INLETemplateMattingServiceCallback.getCPtr(iNLETemplateMattingServiceCallback), iNLETemplateMattingServiceCallback), true);
    }

    public static NLESingleSlotMattingTask createSingleMattingTask(NLETrackSlot nLETrackSlot, NLEModel nLEModel, String str, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback) {
        long jNLETemplateMattingService_createSingleMattingTask__SWIG_1 = NLETemplateJNI.NLETemplateMattingService_createSingleMattingTask__SWIG_1(NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, NLEModel.getCPtr(nLEModel), nLEModel, str, INLETemplateMattingServiceCallback.getCPtr(iNLETemplateMattingServiceCallback), iNLETemplateMattingServiceCallback);
        if (jNLETemplateMattingService_createSingleMattingTask__SWIG_1 == 0) {
            return null;
        }
        return new NLESingleSlotMattingTask(jNLETemplateMattingService_createSingleMattingTask__SWIG_1, true);
    }

    public static NLESingleSlotMattingTask createSingleMattingTask(NLETrackSlot nLETrackSlot, NLEModel nLEModel, String str, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, String str2) {
        long jNLETemplateMattingService_createSingleMattingTask__SWIG_0 = NLETemplateJNI.NLETemplateMattingService_createSingleMattingTask__SWIG_0(NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, NLEModel.getCPtr(nLEModel), nLEModel, str, INLETemplateMattingServiceCallback.getCPtr(iNLETemplateMattingServiceCallback), iNLETemplateMattingServiceCallback, str2);
        if (jNLETemplateMattingService_createSingleMattingTask__SWIG_0 == 0) {
            return null;
        }
        return new NLESingleSlotMattingTask(jNLETemplateMattingService_createSingleMattingTask__SWIG_0, true);
    }
}
