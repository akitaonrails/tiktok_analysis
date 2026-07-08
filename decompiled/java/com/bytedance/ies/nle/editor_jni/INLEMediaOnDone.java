package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class INLEMediaOnDone {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_INLEMediaOnDone(j);
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
        NLEMediaPublicJniJNI.INLEMediaOnDone_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.INLEMediaOnDone_change_ownership(this, this.swigCPtr, true);
    }

    public INLEMediaOnDone() {
        this(NLEMediaPublicJniJNI.new_INLEMediaOnDone(), true);
        NLEMediaPublicJniJNI.INLEMediaOnDone_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEMediaOnDone iNLEMediaOnDone) {
        if (iNLEMediaOnDone == null) {
            return 0L;
        }
        return iNLEMediaOnDone.swigCPtr;
    }

    public void onDone(int i) {
        NLEMediaPublicJniJNI.INLEMediaOnDone_onDone(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEMediaOnDone(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
