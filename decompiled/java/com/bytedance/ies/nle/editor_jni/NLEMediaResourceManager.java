package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaResourceManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMediaResourceManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEResourceManager getResourceManager() {
        long jNLEMediaResourceManager_getResourceManager = NLEMediaPublicJniJNI.NLEMediaResourceManager_getResourceManager(this.swigCPtr, this);
        if (jNLEMediaResourceManager_getResourceManager == 0) {
            return null;
        }
        return new NLEResourceManager(jNLEMediaResourceManager_getResourceManager, true);
    }

    public NLEMediaResourceManager() {
        this(NLEMediaPublicJniJNI.new_NLEMediaResourceManager(), true);
    }

    public static NLEMediaResourceManager obtain() {
        long jNLEMediaResourceManager_obtain = NLEMediaPublicJniJNI.NLEMediaResourceManager_obtain();
        if (jNLEMediaResourceManager_obtain == 0) {
            return null;
        }
        return new NLEMediaResourceManager(jNLEMediaResourceManager_obtain, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaResourceManager nLEMediaResourceManager) {
        if (nLEMediaResourceManager == null) {
            return 0L;
        }
        return nLEMediaResourceManager.swigCPtr;
    }

    public void setDelegate(NLEResourceManager nLEResourceManager) {
        NLEMediaPublicJniJNI.NLEMediaResourceManager_setDelegate(this.swigCPtr, this, NLEResourceManager.getCPtr(nLEResourceManager), nLEResourceManager);
    }

    public NLEMediaResourceManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void prepareNecessaryResource(NLEModel nLEModel, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback) {
        NLEMediaPublicJniJNI.NLEMediaResourceManager_prepareNecessaryResource__SWIG_2(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, INLENecessaryResourceFetchCallback.getCPtr(iNLENecessaryResourceFetchCallback), iNLENecessaryResourceFetchCallback);
    }

    public void prepareNecessaryResource(NLEModel nLEModel, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, boolean z) {
        NLEMediaPublicJniJNI.NLEMediaResourceManager_prepareNecessaryResource__SWIG_1(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, INLENecessaryResourceFetchCallback.getCPtr(iNLENecessaryResourceFetchCallback), iNLENecessaryResourceFetchCallback, z);
    }

    public void prepareNecessaryResource(NLEModel nLEModel, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, boolean z, boolean z2) {
        NLEMediaPublicJniJNI.NLEMediaResourceManager_prepareNecessaryResource__SWIG_0(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, INLENecessaryResourceFetchCallback.getCPtr(iNLENecessaryResourceFetchCallback), iNLENecessaryResourceFetchCallback, z, z2);
    }
}
