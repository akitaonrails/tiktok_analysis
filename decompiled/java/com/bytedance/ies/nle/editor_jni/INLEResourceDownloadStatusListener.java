package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class INLEResourceDownloadStatusListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_INLEResourceDownloadStatusListener(j);
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
        NLEMediaJniJNI.INLEResourceDownloadStatusListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaJniJNI.INLEResourceDownloadStatusListener_change_ownership(this, this.swigCPtr, true);
    }

    public void onAllResourceDownloadFinished() {
        NLEMediaJniJNI.INLEResourceDownloadStatusListener_onAllResourceDownloadFinished(this.swigCPtr, this);
    }

    public INLEResourceDownloadStatusListener() {
        this(NLEMediaJniJNI.new_INLEResourceDownloadStatusListener(), true);
        NLEMediaJniJNI.INLEResourceDownloadStatusListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener) {
        if (iNLEResourceDownloadStatusListener == null) {
            return 0L;
        }
        return iNLEResourceDownloadStatusListener.swigCPtr;
    }

    public void onStart(NLEResourceNode nLEResourceNode) {
        NLEMediaJniJNI.INLEResourceDownloadStatusListener_onStart(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEResourceDownloadStatusListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onSuccess(NLEResourceNode nLEResourceNode, boolean z) {
        NLEMediaJniJNI.INLEResourceDownloadStatusListener_onSuccess(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode, z);
    }

    public void onFail(NLEResourceNode nLEResourceNode, int i, String str) {
        NLEMediaJniJNI.INLEResourceDownloadStatusListener_onFail(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode, i, str);
    }
}
