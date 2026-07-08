package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class INLEMediaOnProgressChanged {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_INLEMediaOnProgressChanged(j);
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
        NLEMediaPublicJniJNI.INLEMediaOnProgressChanged_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.INLEMediaOnProgressChanged_change_ownership(this, this.swigCPtr, true);
    }

    public INLEMediaOnProgressChanged() {
        this(NLEMediaPublicJniJNI.new_INLEMediaOnProgressChanged(), true);
        NLEMediaPublicJniJNI.INLEMediaOnProgressChanged_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEMediaOnProgressChanged iNLEMediaOnProgressChanged) {
        if (iNLEMediaOnProgressChanged == null) {
            return 0L;
        }
        return iNLEMediaOnProgressChanged.swigCPtr;
    }

    public void onChanged(double d) {
        NLEMediaPublicJniJNI.INLEMediaOnProgressChanged_onChanged(this.swigCPtr, this, d);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEMediaOnProgressChanged(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
