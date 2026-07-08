package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEVEOperationListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEVEOperationListener(j);
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
        NLEMediaPublicJniJNI.NLEVEOperationListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEVEOperationListener_change_ownership(this, this.swigCPtr, true);
    }

    public NLEVEOperationListener() {
        this(NLEMediaPublicJniJNI.new_NLEVEOperationListener(), true);
        NLEMediaPublicJniJNI.NLEVEOperationListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVEOperationListener nLEVEOperationListener) {
        if (nLEVEOperationListener == null) {
            return 0L;
        }
        return nLEVEOperationListener.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEVEOperationListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onVEOperationEvent(NLEVEOperationResType nLEVEOperationResType, String str, NLEResourceNode nLEResourceNode, int i, NLERenderAction nLERenderAction) {
        NLEMediaPublicJniJNI.NLEVEOperationListener_onVEOperationEvent(this.swigCPtr, this, nLEVEOperationResType.swigValue(), str, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode, i, nLERenderAction.swigValue());
    }
}
