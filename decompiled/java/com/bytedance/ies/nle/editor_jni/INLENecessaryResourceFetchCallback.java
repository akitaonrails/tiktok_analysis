package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class INLENecessaryResourceFetchCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_INLENecessaryResourceFetchCallback(j);
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
        NLEMediaJniJNI.INLENecessaryResourceFetchCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaJniJNI.INLENecessaryResourceFetchCallback_change_ownership(this, this.swigCPtr, true);
    }

    public INLENecessaryResourceFetchCallback() {
        this(NLEMediaJniJNI.new_INLENecessaryResourceFetchCallback(), true);
        NLEMediaJniJNI.INLENecessaryResourceFetchCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback) {
        if (iNLENecessaryResourceFetchCallback == null) {
            return 0L;
        }
        return iNLENecessaryResourceFetchCallback.swigCPtr;
    }

    public void onPreFetch(VecString vecString) {
        NLEMediaJniJNI.INLENecessaryResourceFetchCallback_onPreFetch(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void onProgress(float f) {
        NLEMediaJniJNI.INLENecessaryResourceFetchCallback_onProgress(this.swigCPtr, this, f);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLENecessaryResourceFetchCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onSingleResourceFail(String str, int i, String str2) {
        NLEMediaJniJNI.INLENecessaryResourceFetchCallback_onSingleResourceFail(this.swigCPtr, this, str, i, str2);
    }

    public void onDone(int i, int i2, int i3, String str) {
        NLEMediaJniJNI.INLENecessaryResourceFetchCallback_onDone(this.swigCPtr, this, i, i2, i3, str);
    }
}
