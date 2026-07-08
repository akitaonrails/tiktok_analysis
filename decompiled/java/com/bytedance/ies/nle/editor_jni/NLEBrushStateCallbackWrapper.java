package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEBrushStateCallbackWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEBrushStateCallbackWrapper(j);
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
        NLEMediaPublicJniJNI.NLEBrushStateCallbackWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEBrushStateCallbackWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEBrushStateCallbackWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEBrushStateCallbackWrapper(), true);
        NLEMediaPublicJniJNI.NLEBrushStateCallbackWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEBrushStateCallbackWrapper nLEBrushStateCallbackWrapper) {
        if (nLEBrushStateCallbackWrapper == null) {
            return 0L;
        }
        return nLEBrushStateCallbackWrapper.swigCPtr;
    }

    public void onStateChange(NLEBrushStickerState nLEBrushStickerState) {
        if (getClass() == NLEBrushStateCallbackWrapper.class) {
            NLEMediaPublicJniJNI.NLEBrushStateCallbackWrapper_onStateChange(this.swigCPtr, this, NLEBrushStickerState.getCPtr(nLEBrushStickerState), nLEBrushStickerState);
        } else {
            NLEMediaPublicJniJNI.NLEBrushStateCallbackWrapper_onStateChangeSwigExplicitNLEBrushStateCallbackWrapper(this.swigCPtr, this, NLEBrushStickerState.getCPtr(nLEBrushStickerState), nLEBrushStickerState);
        }
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEBrushStateCallbackWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
