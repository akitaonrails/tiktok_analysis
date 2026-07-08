package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class EpResourceManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_EpResourceManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public EpResourceManager() {
        this(NLEResourcesDAVJNI.new_EpResourceManager(), true);
    }

    public static boolean hasEpResourceDelegate() {
        return NLEResourcesDAVJNI.EpResourceManager_hasEpResourceDelegate();
    }

    public static EpResourceManager obtain() {
        long jEpResourceManager_obtain = NLEResourcesDAVJNI.EpResourceManager_obtain();
        if (jEpResourceManager_obtain == 0) {
            return null;
        }
        return new EpResourceManager(jEpResourceManager_obtain, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EpResourceManager epResourceManager) {
        if (epResourceManager == null) {
            return 0L;
        }
        return epResourceManager.swigCPtr;
    }

    public static void setEpResource(EpResourceDelegate epResourceDelegate) {
        NLEResourcesDAVJNI.EpResourceManager_setEpResource(EpResourceDelegate.getCPtr(epResourceDelegate), epResourceDelegate);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EpResourceManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void request(String str, EpResourceCallback epResourceCallback) {
        NLEResourcesDAVJNI.EpResourceManager_request__SWIG_1(this.swigCPtr, this, str, EpResourceCallback.getCPtr(epResourceCallback), epResourceCallback);
    }

    public void request(String str, String str2, EpResourceCallback epResourceCallback) {
        NLEResourcesDAVJNI.EpResourceManager_request__SWIG_0(this.swigCPtr, this, str, str2, EpResourceCallback.getCPtr(epResourceCallback), epResourceCallback);
    }
}
