package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMattingRuntimeController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMattingRuntimeController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public VecString getRunningTasks() {
        return new VecString(NLEMediaPublicJniJNI.NLEMattingRuntimeController_getRunningTasks(this.swigCPtr, this), true);
    }

    public void removeAllTask() {
        NLEMediaPublicJniJNI.NLEMattingRuntimeController_removeAllTask(this.swigCPtr, this);
    }

    public void removeMattingListener() {
        NLEMediaPublicJniJNI.NLEMattingRuntimeController_removeMattingListener(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMattingRuntimeController nLEMattingRuntimeController) {
        if (nLEMattingRuntimeController == null) {
            return 0L;
        }
        return nLEMattingRuntimeController.swigCPtr;
    }

    public boolean addMattingTask(String str) {
        return NLEMediaPublicJniJNI.NLEMattingRuntimeController_addMattingTask(this.swigCPtr, this, str);
    }

    public void removeMattingTask(String str) {
        NLEMediaPublicJniJNI.NLEMattingRuntimeController_removeMattingTask(this.swigCPtr, this, str);
    }

    public void setMattingListener(NLEMattingListenerWrapper nLEMattingListenerWrapper) {
        NLEMediaPublicJniJNI.NLEMattingRuntimeController_setMattingListener(this.swigCPtr, this, NLEMattingListenerWrapper.getCPtr(nLEMattingListenerWrapper), nLEMattingListenerWrapper);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMattingRuntimeController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void cleanMattingFile(String str, String str2, int i, String str3) {
        NLEMediaPublicJniJNI.NLEMattingRuntimeController_cleanMattingFile__SWIG_1(this.swigCPtr, this, str, str2, i, str3);
    }

    public void copyMattingFile(String str, String str2, String str3, int i) {
        NLEMediaPublicJniJNI.NLEMattingRuntimeController_copyMattingFile(this.swigCPtr, this, str, str2, str3, i);
    }

    public void cleanMattingFile(String str, String str2, int i, String str3, boolean z) {
        NLEMediaPublicJniJNI.NLEMattingRuntimeController_cleanMattingFile__SWIG_0(this.swigCPtr, this, str, str2, i, str3, z);
    }
}
