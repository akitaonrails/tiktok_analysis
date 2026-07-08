package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class EpResourceDelegate {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_EpResourceDelegate(j);
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
        NLEResourcesDAVJNI.EpResourceDelegate_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEResourcesDAVJNI.EpResourceDelegate_change_ownership(this, this.swigCPtr, true);
    }

    public EpResourceDelegate() {
        this(NLEResourcesDAVJNI.new_EpResourceDelegate(), true);
        NLEResourcesDAVJNI.EpResourceDelegate_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EpResourceDelegate epResourceDelegate) {
        if (epResourceDelegate == null) {
            return 0L;
        }
        return epResourceDelegate.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EpResourceDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean request(String str, EpResourceCallback epResourceCallback) {
        return NLEResourcesDAVJNI.EpResourceDelegate_request__SWIG_1(this.swigCPtr, this, str, EpResourceCallback.getCPtr(epResourceCallback), epResourceCallback);
    }

    public boolean request(String str, String str2, EpResourceCallback epResourceCallback) {
        return NLEResourcesDAVJNI.EpResourceDelegate_request__SWIG_0(this.swigCPtr, this, str, str2, EpResourceCallback.getCPtr(epResourceCallback), epResourceCallback);
    }
}
