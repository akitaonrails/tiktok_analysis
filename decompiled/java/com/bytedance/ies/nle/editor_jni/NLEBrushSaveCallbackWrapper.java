package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEBrushSaveCallbackWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEBrushSaveCallbackWrapper(j);
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
        NLEMediaPublicJniJNI.NLEBrushSaveCallbackWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEBrushSaveCallbackWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEBrushSaveCallbackWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEBrushSaveCallbackWrapper(), true);
        NLEMediaPublicJniJNI.NLEBrushSaveCallbackWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper) {
        if (nLEBrushSaveCallbackWrapper == null) {
            return 0L;
        }
        return nLEBrushSaveCallbackWrapper.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEBrushSaveCallbackWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onDone(String str, boolean z) {
        if (getClass() == NLEBrushSaveCallbackWrapper.class) {
            NLEMediaPublicJniJNI.NLEBrushSaveCallbackWrapper_onDone(this.swigCPtr, this, str, z);
        } else {
            NLEMediaPublicJniJNI.NLEBrushSaveCallbackWrapper_onDoneSwigExplicitNLEBrushSaveCallbackWrapper(this.swigCPtr, this, str, z);
        }
    }
}
