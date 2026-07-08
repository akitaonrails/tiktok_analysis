package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEVEOperationEventManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEVEOperationEventManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void clearVEOperationListener() {
        NLEMediaPublicJniJNI.NLEVEOperationEventManager_clearVEOperationListener(this.swigCPtr, this);
    }

    public NLEVEOperationEventManager() {
        this(NLEMediaPublicJniJNI.new_NLEVEOperationEventManager(), true);
    }

    public static NLEVEOperationEventManager obtain() {
        long jNLEVEOperationEventManager_obtain = NLEMediaPublicJniJNI.NLEVEOperationEventManager_obtain();
        if (jNLEVEOperationEventManager_obtain == 0) {
            return null;
        }
        return new NLEVEOperationEventManager(jNLEVEOperationEventManager_obtain, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVEOperationEventManager nLEVEOperationEventManager) {
        if (nLEVEOperationEventManager == null) {
            return 0L;
        }
        return nLEVEOperationEventManager.swigCPtr;
    }

    public void addVEOperationListener(NLEVEOperationListener nLEVEOperationListener) {
        NLEMediaPublicJniJNI.NLEVEOperationEventManager_addVEOperationListener(this.swigCPtr, this, NLEVEOperationListener.getCPtr(nLEVEOperationListener), nLEVEOperationListener);
    }

    public void removeVEOperationListener(NLEVEOperationListener nLEVEOperationListener) {
        NLEMediaPublicJniJNI.NLEVEOperationEventManager_removeVEOperationListener(this.swigCPtr, this, NLEVEOperationListener.getCPtr(nLEVEOperationListener), nLEVEOperationListener);
    }

    public NLEVEOperationEventManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
