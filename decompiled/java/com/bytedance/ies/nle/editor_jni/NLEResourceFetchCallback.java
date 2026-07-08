package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEResourceFetchCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEResourceFetchCallback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        NLEEditorJniJNI.NLEResourceFetchCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        NLEEditorJniJNI.NLEResourceFetchCallback_change_ownership(this, this.swigCPtr, true);
    }

    public NLEResourceFetchCallback() {
        this(NLEEditorJniJNI.new_NLEResourceFetchCallback(), true);
        NLEEditorJniJNI.NLEResourceFetchCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEResourceFetchCallback nLEResourceFetchCallback) {
        if (nLEResourceFetchCallback == null) {
            return 0L;
        }
        return nLEResourceFetchCallback.swigCPtr;
    }

    public void onError(int i) {
        NLEEditorJniJNI.NLEResourceFetchCallback_onError(this.swigCPtr, this, i);
    }

    public void onProgress(int i) {
        NLEEditorJniJNI.NLEResourceFetchCallback_onProgress(this.swigCPtr, this, i);
    }

    public NLEResourceFetchCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onSuccess(String str, String str2) {
        NLEEditorJniJNI.NLEResourceFetchCallback_onSuccess(this.swigCPtr, this, str, str2);
    }
}
