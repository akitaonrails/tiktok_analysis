package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class INLEAsyncRenderPlayStatusListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_INLEAsyncRenderPlayStatusListener(j);
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
        NLEMediaJniJNI.INLEAsyncRenderPlayStatusListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaJniJNI.INLEAsyncRenderPlayStatusListener_change_ownership(this, this.swigCPtr, true);
    }

    public void onPauseInner() {
        NLEMediaJniJNI.INLEAsyncRenderPlayStatusListener_onPauseInner(this.swigCPtr, this);
    }

    public void onPlayInner() {
        NLEMediaJniJNI.INLEAsyncRenderPlayStatusListener_onPlayInner(this.swigCPtr, this);
    }

    public INLEAsyncRenderPlayStatusListener() {
        this(NLEMediaJniJNI.new_INLEAsyncRenderPlayStatusListener(), true);
        NLEMediaJniJNI.INLEAsyncRenderPlayStatusListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener) {
        if (iNLEAsyncRenderPlayStatusListener == null) {
            return 0L;
        }
        return iNLEAsyncRenderPlayStatusListener.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEAsyncRenderPlayStatusListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
