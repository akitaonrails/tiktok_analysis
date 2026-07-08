package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEResourceManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEResourceManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLEMediaJniJNI.NLEResourceManager_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaJniJNI.NLEResourceManager_change_ownership(this, this.swigCPtr, true);
    }

    public NLEResourceManager() {
        this(NLEMediaJniJNI.new_NLEResourceManager(), true);
        NLEMediaJniJNI.NLEResourceManager_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEResourceManager nLEResourceManager) {
        if (nLEResourceManager == null) {
            return 0L;
        }
        return nLEResourceManager.swigCPtr;
    }

    public int cancelTask(String str) {
        return NLEMediaJniJNI.NLEResourceManager_cancelTask(this.swigCPtr, this, str);
    }

    public String fetchResource(String str) {
        return NLEMediaJniJNI.NLEResourceManager_fetchResource__SWIG_1(this.swigCPtr, this, str);
    }

    public int pauseTask(String str) {
        return NLEMediaJniJNI.NLEResourceManager_pauseTask(this.swigCPtr, this, str);
    }

    public int resumeTask(String str) {
        return NLEMediaJniJNI.NLEResourceManager_resumeTask__SWIG_1(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEResourceManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public String fetchResource(String str, NLEResourceCallback nLEResourceCallback) {
        return NLEMediaJniJNI.NLEResourceManager_fetchResource__SWIG_0(this.swigCPtr, this, str, NLEResourceCallback.getCPtr(nLEResourceCallback), nLEResourceCallback);
    }

    public int resumeTask(String str, NLEResourceCallback nLEResourceCallback) {
        return NLEMediaJniJNI.NLEResourceManager_resumeTask__SWIG_0(this.swigCPtr, this, str, NLEResourceCallback.getCPtr(nLEResourceCallback), nLEResourceCallback);
    }
}
